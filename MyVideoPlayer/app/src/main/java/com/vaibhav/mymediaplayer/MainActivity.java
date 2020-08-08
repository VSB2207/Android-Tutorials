package com.vaibhav.mymediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoplayer= findViewById(R.id.videoPlayer);
        videoplayer.setVideoPath("android.resource://"+ getPackageName() + "/" +  R.raw.myvideo);
        MediaController mediaController= new MediaController(this);
        videoplayer.setMediaController(mediaController);
        mediaController.setAnchorView(videoplayer);
        videoplayer.start();

    }
}
