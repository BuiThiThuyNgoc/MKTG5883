package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButtonRed;
    private RadioButton radioButtonGreen;
    private RadioButton radioButtonGray;
    private RadioButton radioButtonBlue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.radioGroup = (RadioGroup) this.findViewById(R.id.radioGroup);
        this.radioButtonRed = (RadioButton) this.findViewById(R.id.btnRed);
        this.radioButtonGreen = (RadioButton) this.findViewById(R.id.btnGreen);
        this.radioButtonBlue = (RadioButton) this.findViewById(R.id.btnBlue);
        this.radioButtonGray = (RadioButton) this.findViewById(R.id.btnGray);
    }


}