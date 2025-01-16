package com.example.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {

    Button buttonScrollUp, buttonScrollDown, buttonScrollToTop;
    ScrollView myScroll;


    /**
     * Called when the activity is first created.
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonScrollUp = (Button) findViewById(R.id.scrollup);
        buttonScrollDown = (Button) findViewById(R.id.scrolldown);
        buttonScrollToTop = (Button) findViewById(R.id.scrolltotop);
        myScroll = (ScrollView) findViewById(R.id.myview);

        buttonScrollUp.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                myScroll.scrollBy(0, +20);
            }
        });

        buttonScrollDown.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                myScroll.scrollBy(0, -20);
            }
        });

        buttonScrollToTop.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                myScroll.scrollTo(0, 0);
            }
        });
    }
}