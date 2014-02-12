package com.example.androidwebview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

//import android.webkit.WebView;



public class WebViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view);
		
		WebView myWebView = (WebView) findViewById(R.id.webview);
       myWebView.getSettings().setJavaScriptEnabled(true);
       //Toast.makeText(this, "about to load page", Toast.LENGTH_LONG).show();
       //myWebView.loadUrl("http://www.google.com");
       myWebView.loadUrl("http://192.168.2.2/server3.php"); //url of html form goes here
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web_view, menu);
		return true;
	}

}
