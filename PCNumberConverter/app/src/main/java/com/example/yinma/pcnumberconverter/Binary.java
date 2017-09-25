package com.example.yinma.pcnumberconverter;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;
import java.math.BigInteger;
import static java.lang.Math.pow;

public class Binary extends AppCompatActivity {
    Button btncal001obj;

    EditText binary001obj;
    TextView decimal001obj;
    TextView octal001obj;
    TextView hexa001obj;

    int binary001var;
    int deci0001var;
    int octal001var;
    String hexa001var;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);
        btncal001obj = (Button) findViewById(R.id.cal001);
        btncal001obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent ibinary = new Intent(Binary.this,MainActivity.class);
//                startActivity(ibinary);
            }
        });
    }

}
