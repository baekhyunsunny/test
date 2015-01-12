package com.zy.tofree;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.zy.util.Constants.ConstantValues;

public class MainActivity extends TabActivity {
	private TabHost tabHost;
	private LayoutInflater layoutInflater;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.setContentView(R.layout.main_activity);
		
		tabHost = getTabHost();
		layoutInflater = LayoutInflater.from(this);
		int activityCount = ConstantValues.tabClassArray.length;
		for(int i = 0; i < activityCount; i++){	
			//为每一个Tab按钮设置图标、文字和内容
			TabSpec tabSpec = tabHost.newTabSpec(ConstantValues.tabTextViewArray[i])
					.setIndicator(getTabItemView(i)).setContent(getTabItemIntent(i));
			//将Tab按钮添加进Tab选项卡中
			tabHost.addTab(tabSpec);
			//设置Tab按钮的背景
//			tabHost.getTabWidget().getChildAt(i)
//					.setBackgroundResource(R.drawable.selector_tab_background);
//			tabHost.getTabWidget().getChildAt(i).setBackgroundColor(0x333333);
		}
		
	}

	//给每个Tab设置图标和文字
	private View getTabItemView(int index){
		View view = layoutInflater.inflate(R.layout.tab_item_view, null);
		ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
		if (imageView != null){
			imageView.setImageResource(ConstantValues.tabImageViewArray[index]);
		}		
//			TextView textView = (TextView) view.findViewById(R.id.textview);
//			textView.setText(ConstantValues.tabTextViewArray[index]);
//			textView.setTextColor(getResources().getColor(R.color.textviewcolor));
		return view;
	}
	//给每个Tab设置跳转的Activity
	private Intent getTabItemIntent(int index){
		Intent intent = new Intent(this, ConstantValues.tabClassArray[index]);
		return intent;
	}

}
