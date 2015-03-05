package com.example.ngoapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity3);
		
		 ImageView img =(ImageView) findViewById(R.id.imageView1);
	        
	        TextView txt1 =(TextView) findViewById(R.id.textView1);
	        TextView txt2 =(TextView) findViewById(R.id.textView2);
	        TextView txt3 =(TextView) findViewById(R.id.textView3);
	        TextView txt4 =(TextView) findViewById(R.id.textView4);
	        
	        Button b1 = (Button)findViewById(R.id.button1);
	        Button b2 = (Button)findViewById(R.id.button2);
	        
	        b1.setOnClickListener(new OnClickListener() {
	        		 
	        		           

								@Override
								public void onClick(View v) {
									// TODO Auto-generated method stub
									Uri uri = Uri.parse("http://srks.org/volunteer.html");
									Intent intent = new Intent(Intent.ACTION_VIEW, uri);
									startActivity(intent);
								}
	        		        });
	        
	        
	        b2.setOnClickListener(new OnClickListener() {
	   		 
		           

				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), 
						    "End Of Application", Toast.LENGTH_LONG).show();
				}
	        });
	}

	
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
