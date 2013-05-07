package com.example.testflipper;

import android.os.Bundle;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	TextView tv1;
	Gallery  glr1;
	ImageSwitcher ImSw;
	ImageView im1;
	int myposition;
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
		
		glr1.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> adapter, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), position+"", Toast.LENGTH_SHORT).show();
				im1.setImageResource(ImageAdapter.ThumbsIds[position]);
				myposition = position;
			}
			
		});
		im1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bitmap mBitmap = BitmapFactory.decodeResource(getResources(),ImageAdapter.ThumbsIds[myposition]);
				WallpaperManager mwm = WallpaperManager.getInstance(getApplicationContext());
				try{
					mwm.setBitmap(mBitmap);
					Toast.makeText(getApplicationContext(), "Wallpaper set.", Toast.LENGTH_SHORT).show();
				}catch(Exception e){
					Toast.makeText(getApplicationContext(), "Wallpaper not set.", Toast.LENGTH_SHORT).show();
				};
				
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
