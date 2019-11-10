package com.seahotel.harikedua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class WvActivity extends AppCompatActivity {

    WebView wvYoutube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wv);
        wvYoutube = (WebView) findViewById(R.id.wv_youtube);
        wvYoutube.loadUrl("https://m.youtube.com");
        wvYoutube.getSettings().setJavaScriptEnabled(true);
        wvYoutube.setWebChromeClient(new WebChromeClient());
    }
}
