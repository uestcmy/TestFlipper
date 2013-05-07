package com.example.testflipper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;

public class ImageAdapter extends BaseAdapter implements SpinnerAdapter {
	private Context context;
	
	
	public ImageAdapter(Context context){
		this.context = context;
		
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return ThumbsIds.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView im1 = null;
		if( convertView == null ){
			im1 = new ImageView(context);
			im1.setLayoutParams(new Gallery.LayoutParams(115,100));
			im1.setPadding(5, 5, 5, 5);
		}else{
			im1 = (ImageView)convertView;
		}
		im1.setImageResource(ThumbsIds[position]);
		return im1;
	}
	
	public static Integer[] ThumbsIds ={
			R.drawable.logo1,
			R.drawable.logo2,
			R.drawable.movie1,
			R.drawable.weibo1,
			R.drawable.weibo2,
			R.drawable.weibo3,
			R.drawable.photo1
	};
}
