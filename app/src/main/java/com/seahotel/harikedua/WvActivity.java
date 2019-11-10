package com.seahotel.harikedua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WvActivity extends AppCompatActivity {

    WebView wvYoutube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wv);
        wvYoutube = findViewById(R.id.wv_youtube1);
        wvYoutube.loadUrl("https://www.youtube.com");
        wvYoutube.getSettings().setJavaScriptEnabled(true);
        //wvYoutube.setWebChromeClient(new WebChromeClient());
        wvYoutube.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(wvYoutube.canGoBack())
            wvYoutube.goBack();
        else
            super.onBackPressed();
    }
}
