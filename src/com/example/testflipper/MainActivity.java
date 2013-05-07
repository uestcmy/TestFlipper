package com.example.testflipper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView tv1;
	Gallery  glr1;
	ImageSwitcher ImSw;
	ImageView im1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	    tv1 = (TextView)findViewById(R.id.TextView1);
		tv1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		        Intent intent = new Intent();
		        intent.setClass(MainActivity.this, WelcomeActivity.class);
		        MainActivity.this.startActivity(intent);
		        MainActivity.this.finish();
			}
		});
		
		glr1 = (Gallery)findViewById(R.id.gallery1);
		im1 = (ImageView)findViewById(R.id.imageView1);
		glr1.setAdapter(new ImageAdapter(this));
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
