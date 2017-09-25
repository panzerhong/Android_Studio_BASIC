package com.example.yinma.vigneshclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    EditText userobj = null;   // Create the object for the omponent
    EditText passobj = null;
    Button loginobj = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userobj =(EditText)findViewById(R.id.username);//Attach the object of the component to the ID of the compoent
        passobj = (EditText) findViewById(R.id.password);
        loginobj = (Button) findViewById(R.id.signing);


        loginobj.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String username = userobj.getText().toString().trim();
                String password = passobj.getText().toString().trim();

                if(username.equals("XYZ")&&password.equals("12345"))
                {
                    Intent i = new Intent(MainActivity.this,Main2Activity.class);// the syntax to move to new activity when the button is clicked
                    i.putExtra("usernamekey",username);
                    i.putExtra("passwordkey",password);// pass the value from String password to the key "passwordkey"
                    startActivity(i);
                }
                else
                {

                    Toast.makeText(MainActivity.this, "Wrong username or password Try again later",Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}
