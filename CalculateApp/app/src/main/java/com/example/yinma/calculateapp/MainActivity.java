package com.example.yinma.calculateapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText num1 = null,num2=null;
    Button add = null,sub=null,mul=null,div=null,acobj = null;
    TextView answer = null;
    double inputnum1=0,inputnum2=0,result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.number1);
        num2= (EditText) findViewById(R.id.number2);
        add= (Button) findViewById(R.id.addid);
        sub = (Button) findViewById(R.id.minusid);
        mul = (Button) findViewById(R.id.multiplyid);
        div = (Button) findViewById(R.id.divideid);
        acobj = (Button) findViewById(R.id.acid);
        answer = (TextView) findViewById(R.id.textView);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputnum1 = Integer.parseInt(num1.getText().toString().trim());// Convert the input text to the value and store it in the variable " inputnum1"
                inputnum2 = Integer.parseInt(num2.getText().toString().trim());
                result=inputnum1+inputnum2;// Get the input value from variable "inputnum1" and "inputnum2" do th add operation

                answer.setText(String.valueOf(result));// convert the value from variable to String and set the answerobject of the text view to those result value

                answer.setText(inputnum1+"+"+inputnum2+"="+result);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputnum1= Integer.parseInt(num1.getText().toString().trim());
                inputnum2 = Integer.parseInt(num2.getText().toString().trim());
                result = inputnum1 - inputnum2;

                answer.setText(inputnum1+"-"+inputnum2+"="+result);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputnum1= Integer.parseInt(num1.getText().toString().trim());
                inputnum2= Integer.parseInt(num2.getText().toString().trim());
                result = inputnum1 * inputnum2;

                answer.setText(inputnum1+"x"+inputnum2+"="+result);

            }
        });

            div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                inputnum1= Integer.parseInt(num1.getText().toString().trim());
                inputnum2= Integer.parseInt(num2.getText().toString().trim());

                    try
                    {
                        result = inputnum1 / inputnum2;
                        if((result+"").equals("Infinity"))
                        {
                            answer.setText("Canno divided by Zero");
                        }
                        else
                        answer.setText(inputnum1+"/"+inputnum2+"="+result);
                    }catch (ArithmeticException e)
                    {
                        answer.setText("Cannot divide by zero in catch block");
                    }
            }
        });

        acobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputnum1 = 0;
                inputnum2 = 0;
                num1.setText("");
                num2.setText("");
                answer.setText("");
            }
        });
    }
}
