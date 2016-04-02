package com.example.specialapp;

import java.util.Locale;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class texttospeech extends Activity {
	Button speak,home;
	EditText edit;
	TextToSpeech tell;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.texttospeech);
		
		speak=(Button)findViewById(R.id.bt1);
		edit=(EditText)findViewById(R.id.et1);
		home=(Button)findViewById(R.id.button2);
		
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
		
		speak.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String s=edit.getText().toString();
				
				tell.speak(s,TextToSpeech.QUEUE_FLUSH,null);
				
			}
		});
		home.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			  Intent k=new Intent(getApplicationContext(),MainActivity.class);	
			  startActivity(k);
			}
		});
		
	}

}
