package com.example.specialapp;

import java.util.Locale;

import android.os.Bundle;
import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterFile extends Activity {
TextView tv1,tv2,tv3;
Button b1,b2;
int a=0;
TextToSpeech tell;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.counterfile);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
	   

        tell=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
 			
 			@Override
 			public void onInit(int status) {
 				// TODO Auto-generated method stub
 				if(status!=TextToSpeech.ERROR)
 				{
 					tell.setLanguage(Locale.UK);
 					
 				}
 			}
 		});
        
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				a--;
				tv2.setText("your result:"+a);
				
			if(a%2==0 && a!=0)
			{
				tv3.setText("Even number");
                String s=tv3.getText().toString();
				
				tell.speak(s,TextToSpeech.QUEUE_FLUSH,null);
				
			}
			else if(a%2!=0 && a!=0)
			{
				tv3.setText("odd number");
                String s=tv3.getText().toString();
				
				tell.speak(s,TextToSpeech.QUEUE_FLUSH,null);
			}
			else
			{
				tv3.setText("the number is either even or odd");
                String s=tv3.getText().toString();
				
				tell.speak(s,TextToSpeech.QUEUE_FLUSH,null);
			}
			}
		});
        
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				a++;
				tv2.setText("your result:"+a);
				
				if(a%2==0 && a!=0)
				{
					tv3.setText("Even number");
					String s=tv3.getText().toString();
					
					tell.speak(s,TextToSpeech.QUEUE_FLUSH,null);
				}
				else if(a%2!=0 && a!=0)
				{
					tv3.setText("odd number");
					String s=tv3.getText().toString();
					
					tell.speak(s,TextToSpeech.QUEUE_FLUSH,null);
				}
				else
				{
					tv3.setText("the number is either even or odd");
					String s=tv3.getText().toString();
					
					tell.speak(s,TextToSpeech.QUEUE_FLUSH,null);
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
