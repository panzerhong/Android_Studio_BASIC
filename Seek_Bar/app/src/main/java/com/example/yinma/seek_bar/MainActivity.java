package com.example.yinma.seek_bar;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
    int red=0,green=0,blue=0,alpha=0;

    SeekBar redobj;
    SeekBar greenobj;
    SeekBar blueobj;
    SeekBar opacityobj;

    Button summitobj;


    TextView redtxtobj;
    TextView bluetxtobj;
    TextView greentxtobj;
    TextView opacitytxtobj;
    Random r;
    public ConstraintLayout lly;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    redobj = (SeekBar) findViewById(R.id.redid);
    greenobj = (SeekBar) findViewById(R.id.greenid);
    blueobj = (SeekBar) findViewById(R.id.blueid);
    opacityobj =(SeekBar) findViewById(R.id.opacityid);
    summitobj = (Button) findViewById(R.id.summitid);
    redtxtobj =(TextView) findViewById(R.id.redtxtid);
    greentxtobj =(TextView) findViewById(R.id.greentxtid);
    bluetxtobj =(TextView) findViewById(R.id.bluetxtid);
    opacitytxtobj = (TextView) findViewById(R.id.opacitytxtid);

    lly = (ConstraintLayout)findViewById(R.id.layout);
    r=new Random();

    redobj.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            red = i;
            redtxtobj.setText(String.valueOf(red));
            updateColor();
//            int redcolor = Color.argb(255,r.nextInt(256),r.nextInt(256),r.nextInt(256));
//            lly.setBackgroundColor(redcolor);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });

    blueobj.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            blue=i;
            bluetxtobj.setText(String.valueOf(blue));
            updateColor();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });

    greenobj.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            green=i;
            greentxtobj.setText(String.valueOf(red));
            updateColor();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });

    opacityobj.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            alpha=i;
            opacitytxtobj.setText(String.valueOf(alpha));
            updateColor();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });
    }

    private void updateColor(){
        getWindow().getDecorView().setBackgroundColor(Color.argb(alpha,red,green,blue));
    }

    public void summitOnClick(View view)
    {
        getWindow().getDecorView().setBackgroundColor(Color.argb(alpha,red,green,blue));
    }
}
