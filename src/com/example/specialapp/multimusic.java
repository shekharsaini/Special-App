package com.example.specialapp;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class multimusic extends Activity {
	 Button play,stop,select,home;
	 Uri uri;
	 MediaPlayer shk;
	 boolean songfound;
     
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.multimusic);
		play=(Button)findViewById(R.id.play);
		stop=(Button)findViewById(R.id.stop);
		select=(Button)findViewById(R.id.select);
		home=(Button)findViewById(R.id.home);
		home.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				Intent k=new Intent(multimusic.this,MainActivity.class);  // for go to main activity
				startActivity(k);
			}
		});
	
	play.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		  shk.start();       //for  start  the song
			
			
		}
	});
	
	stop.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		 shk.stop();     //for stop the song	
		}
	});
	
	select.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i=new Intent(android.content.Intent.ACTION_GET_CONTENT);   //Make a Intent to call a activity that fetches the URI of the content
			i.setType("audio/*");      //Searches for only Audio type data
			startActivityForResult(i, 0);  //Starts the Activity for some result that we obtain in on ActivityResult()
		}
	});
	
	
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if(resultCode==RESULT_OK){
			uri= data.getData();
			shk=MediaPlayer.create(getApplicationContext(), uri);		//Creates a MediaPlayer with URI provided
			shk.setAudioStreamType(AudioManager.STREAM_MUSIC);			// Gets the Audio Control for the App
			songfound=true;
			}
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		shk.stop();		//Releases the Media player object
		shk.release();
		shk=null;
		
		
	}
	

	
	
	
}
