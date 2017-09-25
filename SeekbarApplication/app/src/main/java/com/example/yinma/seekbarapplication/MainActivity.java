package com.example.yinma.seekbarapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.R.id.progress;

public class MainActivity extends AppCompatActivity {
    TextView textViewobj;
    TextView numberobj;
    EditText editTextobj;
    SeekBar seekBarobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewobj = (TextView) findViewById(R.id.textView);
        editTextobj = (EditText) findViewById(R.id.editText);
        seekBarobj = (SeekBar) findViewById(R.id.seekBar);
        numberobj = (TextView) findViewById(R.id.numberid);

        seekBarobj.setMax(1000);
        seekBarobj.setProgress(progress);

        seekBarobj.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromuser) {
                String text = editTextobj.getText().toString();
                textViewobj.setText(text);
                textViewobj.setTextSize(progress);

                String num = "Number of Seekbar Progressing :";
                numberobj.setTextSize(progress);
                numberobj.setText( "Number of Seekbar Progressing :"+progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
