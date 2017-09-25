//Completed
//September 12 2017
package com.example.phokchanrithisak.layoutframedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout page1, page2, page3, page4, page5;
    Button prev, next;
//    FrameLayout fl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        fl = (FrameLayout) findViewById(R.id.framelayout);
//        int childCount = fl.getChildCount();
//        fl.getChildAt(0);


        page1 = (LinearLayout) findViewById(R.id.page1);
        page2 = (LinearLayout) findViewById(R.id.page2);
        page3 = (LinearLayout) findViewById(R.id.page3);
        page4 = (LinearLayout) findViewById(R.id.page4);
        page5 = (LinearLayout) findViewById(R.id.page5);
        prev = (Button) findViewById(R.id.prev);
        next = (Button) findViewById(R.id.next);

        page1.setVisibility (View.VISIBLE);
        page2.setVisibility(View.GONE);
        page3.setVisibility(View.GONE);
        page4.setVisibility(View.GONE);
        page4.setVisibility(View.GONE);


        prev.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                page1.setVisibility(View.VISIBLE);
                page2.setVisibility(View.GONE);
            }
        });
        next.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                page1.setVisibility(View.GONE);
                page2.setVisibility(View.VISIBLE);
            }
        });
    }
}

//int childCount = frameLayout.getChildCount();
//LinearLayout 1 = (LinearLayout) frameLayout.getChildAt(int position);