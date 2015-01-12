package com.zy.util;

import com.zy.tofree.R;
import com.zy.tofree.TabActivityHome;
import com.zy.tofree.TabActivitySetting;
import com.zy.tofree.TabActivityShopping;
import com.zy.tofree.TabActivityUserCenter;

public class Constants {
	
	public static final class ConstantValues{
		//Tabѡ���ͼ��
		public static int tabImageViewArray[] = {
			R.drawable.tabwidget_home,
			R.drawable.tabwidget_shopping,
			R.drawable.tabwidget_usercenter,
			R.drawable.tabwidget_setting
		};
		//Tabѡ�������
		public static String tabTextViewArray[] = {
			"��ҳ", "�Ƽ�", "�ҵ�", "����"
		};
		//Tab��Ӧ��ÿ��Activity
		public static Class tabClassArray[] = {
			TabActivityHome.class,
			TabActivityShopping.class,
			TabActivityUserCenter.class,
			TabActivitySetting.class
		};
		
		public static String IP = "115.29.45.115";
		
	}
	
	
}