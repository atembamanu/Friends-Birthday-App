package com.example.atemba.plus365opportunities;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    VideoView videov;
    MediaController mediac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.playvideo);
        videov = (VideoView) findViewById(R.id.videoview);
        mediac = new MediaController(this);
    }

    public void videoplay(View v) {
        String videopath = "android.resource://com.example.atemba.plus365opportunities/"+R.raw.sample;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediac);
        mediac.setAnchorView(videov);
        videov.start();

    }
}