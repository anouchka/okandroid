package kr.redrose.webimage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Loader image - will be shown before loading image
		int loader = R.drawable.loader;

		// Imageview to show
		ImageView image = (ImageView) findViewById(R.id.image);

		// Image url
		//String image_url = "http://api.androidhive.info/images/sample.jpg";
		String image_url = "http://cfile215.uf.daum.net/image/14124D01498CEB6B6B19E1";

		// ImageLoader class instance
		ImageLoader imgLoader = new ImageLoader(getApplicationContext());

		// whenever you want to load an image from url
		// call DisplayImage function
		// url - image url to load
		// loader - loader image, will be displayed before getting image
		// image - ImageView
		imgLoader.DisplayImage(image_url, loader, image);
	}
}
