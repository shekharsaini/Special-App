package com.example.specialapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
Button clc,counter,speech,music,smcl,multimusic;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
       clc=(Button)findViewById(R.id.button1);
       counter=(Button)findViewById(R.id.button2);
	  speech=(Button)findViewById(R.id.button3);
       music=(Button)findViewById(R.id.button4);
	  smcl=(Button)findViewById(R.id.button5);
	  multimusic=(Button)findViewById(R.id.button6);
	  
	  
	  clc.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		   Intent i=new Intent(getApplicationContext(),Calculater.class);
		   startActivity(i);
		}
	});
       counter.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		   Intent j=new Intent(getApplicationContext(),CounterFile.class);
		   startActivity(j);
		}
	});
       speech.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		   Intent f=new Intent(getApplicationContext(),texttospeech.class);
		   startActivity(f);
		}
	});
       music.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		   Intent g=new Intent(getApplicationContext(),music.class);
		   startActivity(g);
		}
	});
       smcl.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		    Intent k=new Intent(getApplicationContext(),CallAndSmsSend.class);	
		    startActivity(k);
		}
	});
       
       multimusic.setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   		    Intent l=new Intent(getApplicationContext(),multimusic.class);	
   		    startActivity(l);
   		}
   	});
       
	
	}
}
