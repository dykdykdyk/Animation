package dyk.viewpagerdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import dyk.viewpagerdemo.R;

/**
 * Created by dengyangkang on 2017/5/4.
 */

public class Fragment_Main_Health_Blood_Oxygen extends LinearLayout {
    public Fragment_Main_Health_Blood_Oxygen(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.item_home_blood_oxygen,this);
    }
}
