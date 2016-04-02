package com.example.specialapp;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class music extends Activity {
Button start,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);
        start=(Button)findViewById(R.id.button1);
        stop=(Button)findViewById(R.id.button2);
        start.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		   Intent i=new Intent(music.this,secmusic.class);	
		   startService(i);
		}
	  });
        stop.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i=new Intent(music.this,secmusic.class);	
			stopService(i);
		}
	});
    }
    
}
