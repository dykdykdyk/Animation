package com.example.eventdistribution;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;

public class MyView extends Button{
	//����View�����༯����Ҫ��������Input �ؼ���ViewGroup�����༯�ϰ������ֲ��ֿؼ���
	public MyView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	//Ĭ�Ϸ���ֵΪtrue
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		 Log.e(MainActivity.TAG, "MyView onTouchEvent."+ super.onTouchEvent(event));  
		return super.onTouchEvent(event);
//	        return false; 
	}
	//Ĭ�Ϸ���ֵΪtrue
	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		 Log.e(MainActivity.TAG, "MyView dispatchTouchEvent."+ super.onTouchEvent(event));   
		return super.dispatchTouchEvent(event);
		
	}
	

}