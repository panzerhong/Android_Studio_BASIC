package com.example.admin.radioandrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameText = null;
    RadioGroup group = null;
    RadioButton male = null;
    RadioButton female = null;
    RadioButton others = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = (EditText)findViewById(R.id.editText);
        group = (RadioGroup)findViewById(R.id.gender);
        male  = (RadioButton) findViewById(R.id.male);
        female  = (RadioButton) findViewById(R.id.female);
        others  = (RadioButton) findViewById(R.id.others);

        String name = nameText.getText().toString();

//        if(male.isChecked())
//        {
//            Toast.makeText(this,"Welcome Mr. "+name+"You are a male",Toast.LENGTH_LONG);
//        }
//        else if(female.isChecked())
//        {
//            Toast.makeText(this,"Welcome Ms. "+name+"You are a Female",Toast.LENGTH_LONG);
//
//        }
//        else if(others.isChecked())
//        {
//            Toast.makeText(this,"Welcome Mr/Ms. "+name+"You are a male/female",Toast.LENGTH_LONG);
//
//        }
//        else
//        {
//            Toast.makeText(this,"Pls choose any gender we can't conclude",Toast.LENGTH_LONG);
//
//        }

        int id = group.getCheckedRadioButtonId();
        RadioButton gen = (RadioButton)findViewById(id);

        Toast.makeText(this,"Welcome "+name+" You are "+gen.getText(),Toast.LENGTH_LONG);
    }
}
