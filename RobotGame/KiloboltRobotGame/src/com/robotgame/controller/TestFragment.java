package com.robotgame.controller;

import com.robotgame.robotgame.R;

import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.MaskFilterSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class TestFragment extends Fragment {
    private static final String KEY_CONTENT = "TestFragment:Content";

    public static TestFragment newInstance(String content) {
        TestFragment fragment = new TestFragment();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            builder.append(content).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        fragment.mContent = content;

        return fragment;
    }

    private String mContent = "???";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if ((savedInstanceState != null) && savedInstanceState.containsKey(KEY_CONTENT)) {
            mContent = savedInstanceState.getString(KEY_CONTENT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        TextView text = new TextView(getActivity());
//        text.setGravity(Gravity.CENTER);
//        text.setText(mContent);
//        text.setTextSize(20 * getResources().getDisplayMetrics().density);
//        text.setPadding(20, 20, 20, 20);
//        MainActivity m=new MainActivity();
//        
//        LinearLayout layout = new LinearLayout(getActivity());
//        layout.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
//        layout.setGravity(Gravity.CENTER);
//        layout.addView(text);
//        return layout;
      
        View view = inflater.inflate(R.layout.loginimage1,null);
        LinearLayout connectionLayer = ( LinearLayout) view.findViewById(R.id.loginimage1);
        String ss=mContent.substring(0, 1);
        
        if(ss.equals("I"))
        {
        	view = inflater.inflate(R.layout.loginimage2, null);
//        	view.addTouchables(views);
        	    LinearLayout connectionLayer1 = ( LinearLayout) view.findViewById(R.id.loginimage2);
//        	    SpannableString spanText = new SpannableString("人类遭受外星人进攻，导致卫星被毁");
//
//        	    int length = spanText.length();
//
//        	    //模糊(BlurMaskFilter)
//
//        	    MaskFilterSpan maskFilterSpan = new MaskFilterSpan(new BlurMaskFilter(3, Blur.OUTER));
//
//        	    spanText.setSpan(maskFilterSpan, 0, length - 10, Spannable.
//
//        	    SPAN_INCLUSIVE_EXCLUSIVE);
//        	    TextView tx1 = (TextView) view.findViewById(R.id.textView1);
//        	    tx1.setText(spanText);
             return connectionLayer1;
        }
        else if(ss.equals("A"))
        {
        	view = inflater.inflate(R.layout.loginimage3, null);
//        	view.addTouchables(views);
        	 LinearLayout connectionLayer2 = ( LinearLayout) view.findViewById(R.id.loginimage3);
             return connectionLayer2;
        }
      
        else
        {
        	return connectionLayer;
        }
       
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_CONTENT, mContent);
    }
}
