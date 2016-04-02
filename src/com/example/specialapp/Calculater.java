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

import android.widget.TextView;

import android.widget.Toast;

public class Calculater extends Activity {
EditText et1,et2;
TextView tv;
Button add,sub,div,mul,module;
Button back;
TextToSpeech tell;  
     @Override
    protected void onCreate(Bundle savedInstanceState) {
    
       super.onCreate(savedInstanceState);
  
       setContentView(R.layout.calculater);
 
       add=(Button)findViewById(R.id.add);
 
       sub=(Button)findViewById(R.id.sub);
   
       div=(Button)findViewById(R.id.div);
   
       mul=(Button)findViewById(R.id.mul);
   
       module=(Button)findViewById(R.id.module);
  
       et1=(EditText)findViewById(R.id.edit1);
   
       et2=(EditText)findViewById(R.id.edit2);
   
       tv=(TextView)findViewById(R.id.tv1);

       back=(Button)findViewById(R.id.back1);
       tell=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
			
			@Override
			public void onInit(int status) {
				// TODO Auto-generated method stub
				if(status!=TextToSpeech.ERROR)
				{
					tell.setLanguage(Locale.ENGLISH);
					
				}
			}
		});
      
   
       add.setOnClickListener(new View.OnClickListener() {
		
    	     @Override
		
          public void onClick(View v) {
	
           // TODO Auto-generated method stub
	
		
		
    	    	 
    	   int i,j,h;
	      try
		{
		
	     i=Integer.parseInt(et1.getText().toString().trim());
		
	     j=Integer.parseInt(et2.getText().toString().trim());
		
	     h=i+j;
		
	        tv.setText("Result"+h);
	        String s=tv.getText().toString();
	        tell.speak(s,TextToSpeech.QUEUE_FLUSH, null);
	        }
			catch(Exception e)
	        {
	       
				Toast.makeText(getApplicationContext(), "fill the value", Toast.LENGTH_LONG).show();
			
	        }
	      
	   }
		
       });
   
   
 sub.setOnClickListener(new View.OnClickListener() {

		
  		@Override
  
		public void onClick(View v) {
 
 
			
  			// TODO Auto-generated method stub
 

  			
  			
  	    	    	 
  			
  			
  int i,j,h;
  		
	try
  			
{
  			
i=Integer.parseInt(et1.getText().toString().trim());
  	
		j=Integer.parseInt(et2.getText().toString().trim());
  	
		h=i-j;
  		
	tv.setText("Result"+h);
	String s=tv.getText().toString();
	tell.speak(s,TextToSpeech.QUEUE_FLUSH, null);
  		
	}
  			
catch(Exception e)
	
		{
	
			Toast.makeText(getApplicationContext(), "fill the value", Toast.LENGTH_LONG).show();

	
		}
  	
	}
  
	});
     
 
   div.setOnClickListener(new View.OnClickListener() {
	
	
  		@Override
  	
	public void onClick(View v) {
  	
		
  			// TODO Auto-generated method stub
  		

  			
  			
  	        int i,j,h;
  	
		    try
  		
	         {
  			
      i=Integer.parseInt(et1.getText().toString().trim());
  		
	  j=Integer.parseInt(et2.getText().toString().trim());
  		
	  h=i/j;
  		
	  tv.setText("Result"+h);
	  String s=tv.getText().toString();
	  tell.speak(s,TextToSpeech.QUEUE_FLUSH, null);
  	
		}
  		
	catch(Exception e)
		
	    {
			
	Toast.makeText(getApplicationContext(), "fill the value", Toast.LENGTH_LONG).show();
	
		}
  	
	}
  	
});
 
   mul.setOnClickListener(new View.OnClickListener() {
		

  		@Override
  	
	   public void onClick(View v) {
  	
		
  			// TODO Auto-generated method stub
  		

  			
  			
  	    	    	 
  			
int i,j,h;
  		
	try
  		
	{
  		
	i=Integer.parseInt(et1.getText().toString().trim());
  		

	j=Integer.parseInt(et2.getText().toString().trim());
  		
	h=i*j;
  		
	tv.setText("Result"+h);
	String s=tv.getText().toString(); 
	tell.speak(s,TextToSpeech.QUEUE_FLUSH, null);
  		
	}
  		
	catch(Exception e)
		
	{
			
	Toast.makeText(getApplicationContext(), "fill the value", Toast.LENGTH_LONG).show();
	
		}
  	
	}
  	
});
     
  
  module.setOnClickListener(new View.OnClickListener() {
	
	
  		@Override
  		
public void onClick(View v) {
  			

  			// TODO Auto-generated method stub
  	

  			
  			
  	    	    	 int i,j,h;
  		
	try
  		
	{
  		
	i=Integer.parseInt(et1.getText().toString().trim());
  		
	j=Integer.parseInt(et2.getText().toString().trim());
  		
	h=i%j;
  		
	tv.setText("Result"+h);
	String s=tv.getText().toString();
	tell.speak(s,TextToSpeech.QUEUE_FLUSH, null);
  	
	}
  	
	catch(Exception e)
	
	{
			
Toast.makeText(getApplicationContext(), "fill the value", Toast.LENGTH_LONG).show();
	
	}
  		
}
  	
});
  back.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	  Intent intent=new Intent(Calculater.this,MainActivity.class);	
	  startActivity(intent);
	}
});
     
}
   }

