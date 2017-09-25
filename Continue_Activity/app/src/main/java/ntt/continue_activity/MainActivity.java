package ntt.continue_activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnobj1 = null;
    Button btnobj2 = null;
    Button btnobj3 = null;
    Button btnobj4 = null;
    Button btnobj5 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnobj1=(Button) findViewById(R.id.button1);
        btnobj2 = (Button) findViewById(R.id.button2);
        btnobj3 = (Button) findViewById(R.id.button3);
        btnobj4 = (Button) findViewById(R.id.button4);
        btnobj5 = (Button) findViewById(R.id.button5);

        /*When the button 1 is pressed for the new screen of Activity*/
        btnobj1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v1)
            {
                Intent i1 = new Intent(MainActivity.this,Activity1.class);
                startActivity(i1);
            }
        });

        btnobj2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v2)
            {
                Intent i2 = new Intent(MainActivity.this,Activity_2.class);
                startActivity(i2);
            }
        });

        btnobj3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v3)
            {
                Intent i3 = new Intent(MainActivity.this, Activity_3.class);
                startActivity(i3);
            }
        });

        btnobj4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v4)
            {
                Intent i4= new Intent(MainActivity.this,activity_4.class);
                startActivity(i4);
            }

        });

        btnobj5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v4)
            {
                Intent i5 = new Intent(MainActivity.this,Activity_5.class);
                startActivity(i5);
            }

        });
    }


}
