package com.example.yinma.fragment_tutorial;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements display_3.visalinterface{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setText(String num) {
        display_2 display_2obj = (display_2)getFragmentManager().findFragmentById(R.id.fragment_2);
        display_2obj.setNamepase(num);

    }
}
