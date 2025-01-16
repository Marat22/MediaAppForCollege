package com.example.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    VideoView videoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        videoPlayer = findViewById(R.id.videoPlayer);
        Uri myVideoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoPlayer.setVideoURI(myVideoUri);

        ViewGroup.LayoutParams defaultParams = videoPlayer.getLayoutParams();

        videoPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams currentParams = videoPlayer.getLayoutParams();

                if (currentParams.width != defaultParams.width && currentParams.height != defaultParams.height) {
                    videoPlayer.setLayoutParams(defaultParams);
                } else {
                    videoPlayer.setLayoutParams(
                            new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,

                                    ViewGroup.LayoutParams.MATCH_PARENT));
                }
            }

        });
        videoPlayer.start();
    }

    public void play(View view) {
//        R.id.pause
        videoPlayer.start();
    }

    public void pause(View view) {
        videoPlayer.pause();
    }

    public void stop(View view) {
        videoPlayer.stopPlayback();
        videoPlayer.resume();
    }
}