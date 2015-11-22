package tz.dotanbest;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.util.EncodingUtils;

import android.content.Context;
import android.content.res.Resources;

import tz.dotadata.R;

class ElemName{
	// 一个ElemName表示一个英雄或者装备在主界面的实体
	public ElemName(String n, int id) {
		name = n;
		icon = id;
	}
	public String getName(){
		return name;
	}
	public int getIcon(){
		return icon;
	}
	String name;
	int icon;
};

public class DataCenter {
	public static final int HERO = 0;
	public static final int EQU = 1;
	private static ArrayList<ElemName> hero1 = null;
	private static ArrayList<ElemName> hero2 = null;
	private static ArrayList<ElemName> equ1 = null;
	private static ArrayList<ElemName> equ2 = null;
	
	public static void init(Context context){
		hero1 = init_hero_and_equ_name(R.raw.hero1_name, context);
		hero2 = init_hero_and_equ_name(R.raw.hero2_name, context);
		equ1 = init_hero_and_equ_name(R.raw.equ1_name, context);
		equ2 = init_hero_and_equ_name(R.raw.equ2_name, context);
	}
		
	private static ArrayList<ElemName> init_hero_and_equ_name(int fileid, Context context){
		InputStream file = context.getResources().openRawResource(fileid);
		String res = "";
		ArrayList<ElemName> name = new ArrayList<ElemName>();
		try {
			int len = file.available();
			byte[] buffer = new byte[len];
			file.read(buffer);
			res = EncodingUtils.getString(buffer, "GBK");
			file.close();
			String[] hero_name = res.split("\r\n");
			for (int i = 0; i < hero_name.length; ++i){
				String[] hero = hero_name[i].split("\t");
				if (hero.length != 2){
					continue;
				}
				Resources resource = context.getResources();
				int id = resource.getIdentifier(hero[1], "drawable", context.getPackageName());
				ElemName heroName = new ElemName(hero[0], id);
				name.add(heroName);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return name;
	}
	
	public static List<Map<String, Object>> getHeroAndEquData(int hero_or_equ){
		ArrayList<ElemName> elem = null;
		if (hero_or_equ == HERO){
			elem = mode == 1 ? hero1 : hero2;
		}else if (hero_or_equ == EQU){
			elem = mode == 1 ? equ1 : equ2;
		}
		List<Map<String, Object>> data_list = new ArrayList<Map<String, Object>>();
        for(int i=0;i<elem.size();i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", elem.get(i).getIcon());
            map.put("text", elem.get(i).getName());
            data_list.add(map);
        }
        return data_list;
	}
	
	
	public static List<Map<String, Object>> getUnusedData(){
		return new ArrayList<Map<String, Object>>();
	}

	private static int mode = 1; // 用来判定dota1/dota2的状态
	
	public static int changeMode() {
		if (mode == 1)
			mode = 2;
		else if (mode == 2)
			mode = 1;
		return mode;
	}

	public static int getMode() {
		return mode;
	}

	public static String get_test_str(Context context) {
		InputStream file = context.getResources().openRawResource(R.raw.hero1_name);
		String res = "";
		try {
			int len = file.available();
			byte[] buffer = new byte[len];
			file.read(buffer);
			res = EncodingUtils.getString(buffer, "GBK");
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
}
