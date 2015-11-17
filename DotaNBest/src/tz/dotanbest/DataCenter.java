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
		"����",
		"��Ĭ��ʿ",
		"������ţ",
		"����",
		"ʳ��ħ��ʦ",
		"������ʿ",
		"��սʿ",
		"Ӱħ",
		"����"
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
		"����֦��",
		"����Բ��",
		"���޷���",
		"����ȭ��",
		"���ݱ�Ь",
		"��������",
		"������������",
		"����Ƥѥ",
		"��ʦ����",
		"ʳ��ħ֮��",
		"����֮��",
		"ħ������"
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
