package tz.dotanbest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tz.dotadata.R;

public class DataCenter {
	private static int[] hero1_icon = {
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
	private static String[] hero1_name = {
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
	
	public static List<Map<String, Object>> getHero1Data(){
		List<Map<String, Object>> data_list = new ArrayList<Map<String, Object>>();
        for(int i=0;i<hero1_icon.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", hero1_icon[i]);
            map.put("text", hero1_name[i]);
            data_list.add(map);
        }
        return data_list;
	}
	
	private static int[] equ1_icon = {
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
	
	private static String[] equ1_name = {
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
	
	public static List<Map<String, Object>> getEqu1Data(){
		List<Map<String, Object>> data_list = new ArrayList<Map<String, Object>>();
        for(int i=0;i<equ1_icon.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", equ1_icon[i]);
            map.put("text", equ1_name[i]);
            data_list.add(map);
        }
        return data_list;
	}
	
	public static List<Map<String, Object>> getUnusedData(){
		return new ArrayList<Map<String, Object>>();
	}

	private static int mode = 1; // �����ж�dota1/dota2��״̬
	
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

	private static int[] hero2_icon = {
		R.drawable.hero2_icon_bm, 
		R.drawable.hero2_icon_sil,
		R.drawable.hero2_icon_es,
		R.drawable.hero2_icon_jugg,
		R.drawable.hero2_icon_omg,
		R.drawable.hero2_icon_lianjin,
		R.drawable.hero2_icon_paipai,
		R.drawable.hero2_icon_sf,
		R.drawable.hero2_icon_tf
		};
	
	private static String[] hero2_name = {
		"����",
		"��Ĭ��ʿ",
		"������",
		"����",
		"ʳ��ħ��ʦ",
		"������ʿ",
		"��սʿ",
		"Ӱħ",
		"����"
	};
	
	public static List<Map<String, Object>> getHero2Data() {
		List<Map<String, Object>> data_list = new ArrayList<Map<String, Object>>();
        for(int i=0;i<hero2_icon.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", hero2_icon[i]);
            map.put("text", hero2_name[i]);
            data_list.add(map);
        }
        return data_list;
	}
	
	private static int[] equ2_icon = {
		R.drawable.equ2_shuzhi,
		R.drawable.equ2_touhuan,
		R.drawable.equ2_jixianfaqiu,
		R.drawable.equ2_quantao,
		R.drawable.equ2_siwa,
		R.drawable.equ2_doupeng,
		R.drawable.equ2_jurenliliangyaodai,
		R.drawable.equ2_jinglingpixue,
		R.drawable.equ2_fashichangpao,
		R.drawable.equ2_shirenmoliliangzhifu,
		R.drawable.equ2_huanxinzhiren,
		R.drawable.equ2_molifazhang
	};
	
	private static String[] equ2_name = {
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

	public static List<Map<String, Object>> getEqu2Data() {
		List<Map<String, Object>> data_list = new ArrayList<Map<String, Object>>();
        for(int i=0;i<equ2_icon.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", equ2_icon[i]);
            map.put("text", equ2_name[i]);
            data_list.add(map);
        }
        return data_list;
	}
}
