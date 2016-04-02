package com.example.specialapp;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallAndSmsSend extends Activity {
	Button read,call,sma,home;
	EditText num;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.callandsmssend);
        
        read=(Button)findViewById(R.id.button1);
         call= (Button)findViewById(R.id.button2);
        sma=(Button)findViewById(R.id.button3);
        num=(EditText)findViewById(R.id.editText1);
        
        home=(Button)findViewById(R.id.button4);
        
        
       home.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),MainActivity.class);
				startActivity(i);
			}
		});
        
        
        read.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Intent read1=new Intent();
				//read1.setAction(android.content.Intent.ACTION_VIEW);
				
				//read1.setData(ContactsContract.Contacts.CONTENT_URI);
				//startActivity(read1);
				//num.setText((CharSequence) read1);
			  Intent i=new Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI);
			  
			startActivityForResult(i, 1001);
			}
		});
 call.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent call1=new Intent();
				call1.setAction(android.content.Intent.ACTION_CALL).setData(Uri.parse("tel:"+num.getText()));
				startActivity(call1);	
			}
		});
        sma.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent sms=new Intent();
				sms.setAction(android.content.Intent.ACTION_VIEW);
				sms.setData(Uri.parse("smsto:"+num.getText().toString()));
				startActivity(sms);	
			}
		});
        
    }
	@Override
	protected void onActivityResult(int requestCode, int resultode, Intent data) {
		int resultCode = 0;
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);

	switch(resultCode)
	{
	case 1001:
		if(resultCode==Activity.RESULT_OK)
		{
			Cursor s=getContentResolver().query(Phone.CONTENT_URI,null,null,null,null);
			
			
			
			if(s.moveToFirst())
			{
				String phone=s.getString(s.getColumnIndex(Phone.NUMBER));
				num.setText(phone);
			}
		}
	}
	
	
	
	
	}
}