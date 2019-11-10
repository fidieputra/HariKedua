package com.seahotel.harikedua;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class MultiMediaActivity extends AppCompatActivity {
    VideoView vv;
    MediaController mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_media);
        vv = findViewById(R.id.vv1);
        //full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        vv.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video));
        mc = new MediaController(this);
        mc.setAnchorView(vv);
        vv.setMediaController(mc);
        vv.start();
    }
}
