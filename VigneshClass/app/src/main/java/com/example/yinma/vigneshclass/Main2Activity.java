package com.example.yinma.vigneshclass;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;
public class Main2Activity extends AppCompatActivity {

    TextView userobj2;
    TextView passobj2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent(); // Inherit the object from the main activity and use this object to inherit the property from the MainActivity class and use it in this class

        userobj2 = (TextView)findViewById(R.id.textView);
        passobj2 = (TextView)findViewById(R.id.textView2);

        String username2 = i.getStringExtra("usernamekey").toString();
        String password2 = i.getStringExtra("passwordkey").toString();

        userobj2.setText(username2);
        passobj2.setText(password2);
    }
}
