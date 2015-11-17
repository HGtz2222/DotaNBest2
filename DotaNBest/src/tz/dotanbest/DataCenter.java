package tz.dotanbest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tz.dotadata.R;

public class DataCenter {
	private static int[] hero_icon = {
		R.drawable.hero_icon_bm, 
		R.drawable.hero_icon_chenmo,
		R.drawable.hero_icon_es,
		R.drawable.hero_icon_jugg,
		R.drawable.hero_icon_lanpangpang,
		R.drawable.hero_icon_lianjin,
		R.drawable.hero_icon_paipai,
		R.drawable.hero_icon_sf,
		R.drawable.hero_icon_tf
		};
	private static String[] hero_name = {
		"兽王",
		"沉默术士",
		"撼地神牛",
		"主宰",
		"食人魔法师",
		"炼金术士",
		"熊战士",
		"影魔",
		"屠夫"
	};
	
	public static List<Map<String, Object>> getHeroData(){
		List<Map<String, Object>> data_list = new ArrayList<Map<String, Object>>();
        for(int i=0;i<hero_icon.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", hero_icon[i]);
            map.put("text", hero_name[i]);
            data_list.add(map);
        }
        return data_list;
	}
	
	private static int[] equ_icon = {
		R.drawable.equ1_shuzhi,
		R.drawable.equ1_touhuan,
		R.drawable.equ1_jixianfaqiu,
		R.drawable.equ1_quantao,
		R.drawable.equ1_siwa,
		R.drawable.equ1_doupeng,
		R.drawable.equ1_jurenliliangyaodai,
		R.drawable.equ1_jinglingpixue,
		R.drawable.equ1_fashichangpao,
		R.drawable.equ1_shirenmoliliangzhifu,
		R.drawable.equ1_huanxinzhiren,
		R.drawable.equ1_molifazhang
	};
	
	private static String[] equ_name = {
		"铁树枝干",
		"贵族圆环",
		"极限法球",
		"力量拳套",
		"敏捷便鞋",
		"智力斗篷",
		"巨人力量腰带",
		"精灵皮靴",
		"法师长袍",
		"食人魔之斧",
		"欢欣之刃",
		"魔力法杖"
	};
	
	public static List<Map<String, Object>> getEquData(){
		List<Map<String, Object>> data_list = new ArrayList<Map<String, Object>>();
        for(int i=0;i<equ_icon.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", equ_icon[i]);
            map.put("text", equ_name[i]);
            data_list.add(map);
        }
        return data_list;
	}
	
	public static List<Map<String, Object>> getUnusedData(){
		return new ArrayList<Map<String, Object>>();
	}
}
