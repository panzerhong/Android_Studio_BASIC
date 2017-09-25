package com.example.yinma.mvcdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText uid,uname;Button signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         uid = (EditText) findViewById(R.id.userId);
         uname = (EditText) findViewById(R.id.userName);
         signIn = (Button) findViewById(R.id.signIn);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int userId = Integer.parseInt(uid.getText().toString().trim());
                String userName = uname.getText().toString();

                StudentModel sm1 = new StudentModel("XYZ",1234);
                Intent i;
                if(userId == sm1.getUserId()&& userName.equals(sm1.getUserName()))
                {
                    i = new Intent(MainActivity.this,SuccessActivity.class);
                    i.putExtra("userId",userId);
                    i.putExtra("userName",userId);
                }
                else
                {
                    i = new Intent(MainActivity.this,FailureActivity.class);
                }
                startActivity(i);

            }
        });

    }
}
