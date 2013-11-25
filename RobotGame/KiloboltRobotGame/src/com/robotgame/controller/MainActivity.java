package com.robotgame.controller;

import com.robotgame.robotgame.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button bt1 = (Button) findViewById(R.id.button1);
		bt1.setOnClickListener(new OnClickListener(){
 
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, SampleCirclesWithListener.class);
				startActivityForResult(i, 0);
			}
			
		});
		
		Button bt2 = (Button) findViewById(R.id.button2);
		bt2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				
				Intent i = new Intent();
 				i.setClassName(MainActivity.this, "com.robotgame.controller.FragmentDemoActivity");
 				
 				startActivity(i);
			}
			
		});
		
		
		Button bt3 = (Button) findViewById(R.id.button3);
		bt3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				
				Intent i = new Intent();
 				i.setClassName(MainActivity.this, "com.robotgame.robotgame.SampleGame");
 				
 				startActivity(i);
			}
			
		});
		
		Button bt4 = (Button) findViewById(R.id.button4);
		bt4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				 Dialog d=getInstanceMyDialog2();
				 d.getWindow().setBackgroundDrawable(new ColorDrawable(0));
				 d.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
			                WindowManager.LayoutParams.MATCH_PARENT);
				d.show();
			}
			
		});
	}

	
    private Dialog getInstanceMyDialog2() {
        final Dialog d= new Dialog(MainActivity.this);
        d.requestWindowFeature(Window.FEATURE_NO_TITLE);
        d.setContentView(R.layout.userguide);
       
        return d;
 	 }

}
