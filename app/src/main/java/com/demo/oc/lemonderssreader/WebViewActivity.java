package com.demo.oc.lemonderssreader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by Erwan on 16/04/2016.
 */
public class WebViewActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        Intent intent = getIntent();
        String webContent = intent.getStringExtra("WEB_CONTENT");

        WebView webView = (WebView) findViewById(R.id.webView);

        webView.loadData(webContent, "text/html; charset=UTF-8", null);
    }

}
