package com.example.testflipper;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeActivity extends Activity {
	ImageView img;
	@Override

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
       
        TextView tv1 = (TextView)findViewById(R.id.welcome_text);
		tv1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		        Intent intent = new Intent();
		        intent.setClass(WelcomeActivity.this, MainActivity.class);
		        WelcomeActivity.this.startActivity(intent);
		        WelcomeActivity.this.finish();
			}
		});
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

}
