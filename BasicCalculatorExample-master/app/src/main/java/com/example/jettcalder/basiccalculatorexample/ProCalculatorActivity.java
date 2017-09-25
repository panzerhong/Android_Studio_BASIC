package com.example.jettcalder.basiccalculatorexample;

import android.content.res.Configuration;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.jettcalder.basiccalculatorexample.databinding.ActivityProCalculatorBinding;

import java.util.Locale;

public class ProCalculatorActivity extends AppCompatActivity {
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    KhmerNumber khmerNumber = new KhmerNumber();
    private char CURRENT_ACTION;
    private double valueOne = Double.NaN;
    private double valueTwo = Double.NaN;
    private double backup_val = Double.NaN;
    private String history = "";
    private String lastResult = "";

    private ActivityProCalculatorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String languageToLoad = "km";
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.setLocale(locale);
        this.getResources().updateConfiguration(config, this.getResources().getDisplayMetrics());
        binding = DataBindingUtil.setContentView(this, R.layout.activity_pro_calculator);



        binding.proBtn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appendNum(0);
            }
        });
        binding.proBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appendNum(1);
            }
        });
        binding.proBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appendNum(2);
            }
        });
        binding.proBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appendNum(3);
            }
        });
        binding.proBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appendNum(4);
            }
        });
        binding.proBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appendNum(5);
            }
        });
        binding.proBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appendNum(6);
            }
        });
        binding.proBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appendNum(7);
            }
        });
        binding.proBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appendNum(8);
            }
        });
        binding.proBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appendNum(9);
            }
        });

        binding.proBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = ADDITION;
                updateVal("+");
            }
        });
        binding.proBtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = SUBTRACTION;
                updateVal("-");
            }
        });

        binding.proBtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = MULTIPLICATION;
                updateVal("*");
            }
        });

        binding.proBtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = DIVISION;
                updateVal("/");
            }
        });

        binding.proBtnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                if (!Double.isNaN(valueOne)) {
                    if (Double.isNaN(valueTwo)) {
                        binding.proTvTop.setText((String.format("%s", khmerNumber.parseKhNumber(valueOne))));
                        binding.proTvMid.setText(null);
                        backup_val = valueOne;
                        valueOne = Double.NaN;
                        CURRENT_ACTION = '0';
                    } else {
                        binding.proTvTop.setText(String.format("%s = %s", history + khmerNumber.parseKhNumber(valueTwo), khmerNumber.parseKhNumber(valueOne)));
                        lastResult = String.format("%s = %s", history + khmerNumber.parseKhNumber(valueTwo), khmerNumber.parseKhNumber(valueOne));
                        backup_val = valueOne;
                        valueOne = Double.NaN;
                        CURRENT_ACTION = '0';
                        binding.proTvMid.setText(null);
                    }
                } else {
                    if (!lastResult.isEmpty()) {
                        binding.proTvTop.setText(String.format("%s", lastResult));
                    }
                }
            }
        });

        binding.proBtnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
        binding.proBtnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.proTvBottom.setText(String.format("%s%s", binding.proTvBottom.getText(), "."));
            }
        });
//        TODO: 3.3 * 3 bug
    }

    private void reset() {
        valueOne = Double.NaN;
        valueTwo = Double.NaN;
        backup_val = Double.NaN;
        CURRENT_ACTION = '0';
        binding.proTvTop.setText("");
        binding.proTvMid.setText("");
        binding.proTvBottom.setText("");
        history = "";
        lastResult = "";
    }

    private void updateVal(String s) {
        if (!Double.isNaN(valueTwo)) {
            if (history.isEmpty()) {
                binding.proTvTop.setText(String.format("%s", khmerNumber.parseKhNumber(valueOne)));
            } else {
                binding.proTvTop.setText(String.format("%s%s = %s", history, khmerNumber.parseKhNumber(valueTwo), khmerNumber.parseKhNumber(valueOne)));
            }
            binding.proTvMid.setText(String.format("%s", s));
            history = String.format("%s %s ", khmerNumber.parseKhNumber(valueOne), s);
            binding.proTvBottom.setText(null);
        } else {
            binding.proTvTop.setText(String.format("%s", khmerNumber.parseKhNumber(valueOne)));
            binding.proTvMid.setText(String.format("%s", s));
            history = String.format("%s %s ", khmerNumber.parseKhNumber(valueOne), s);
            binding.proTvBottom.setText(null);
        }
    }

    private void appendNum(int i) {
        binding.proTvBottom.setText(String.format("%s%s", binding.proTvBottom.getText(), khmerNumber.getKhNum(i)));
    }

    private void computeCalculation() {
        if (!Double.isNaN(valueOne)) {
            String temp = binding.proTvBottom.getText().toString();
            if (!temp.isEmpty()) {
                valueTwo = Double.parseDouble(khmerNumber.parseEnNumber(binding.proTvBottom.getText().toString()));
                Toast.makeText(ProCalculatorActivity.this, String.valueOf(valueTwo), Toast.LENGTH_LONG).show();
                binding.proTvBottom.setText(null);

                if (CURRENT_ACTION == ADDITION)
                    valueOne = this.valueOne + valueTwo;
                else if (CURRENT_ACTION == SUBTRACTION)
                    valueOne = this.valueOne - valueTwo;
                else if (CURRENT_ACTION == MULTIPLICATION) {
                    valueOne = this.valueOne * valueTwo;
//                    valueOne = Double.parseDouble(new DecimalFormat("#.##").format(valueOne));
//                    Toast.makeText(ProCalculatorActivity.this, String.valueOf(new DecimalFormat("#.##").format(valueOne)), Toast.LENGTH_LONG).show();
                }
                else if (CURRENT_ACTION == DIVISION)
                    valueOne = this.valueOne / valueTwo;
            } else {
                valueTwo = Double.NaN;
            }
        } else {
            try {
                if (!Double.isNaN(backup_val)) {
                    valueOne = backup_val;
                } else {
                    valueOne = Double.parseDouble(khmerNumber.parseEnNumber(binding.proTvBottom.getText().toString()));
                    Toast.makeText(ProCalculatorActivity.this, String.valueOf(valueOne), Toast.LENGTH_LONG).show();
                }
            } catch (Exception e) {
            }
        }
    }
}
