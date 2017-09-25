package com.example.yinma.swap;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener{

    TextView tv = null;
    GestureDetectorCompat compat = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tv);
        compat=new GestureDetectorCompat(this,this);// First this : is context this,
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        tv.setText("Single Tap");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        tv.setText("Double Tap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        tv.setText("On Double tap event");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        tv.setText("Down");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

        tv.setText("Show press");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float distanceX, float distanceY) {
        tv.setText("Scrolling : "+"X :"+distanceX +"Y : "+distanceY);
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        tv.setText("Long Press");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float velocityX, float velocityY) {
        tv.setText("Fling : velocityX : "+velocityX+" velocityY : "+velocityY);
        return false;

    }
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        this.compat.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
