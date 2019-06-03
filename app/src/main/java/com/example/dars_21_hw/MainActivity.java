package com.example.dars_21_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnIncreaseLeft, btnIncreaseRight;
    TextView tvCounterLeft, tvCounterRight;
    int counterLeft=0;
    int counterRight = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIncreaseLeft = findViewById(R.id.btn_count_left);
        btnIncreaseRight = findViewById(R.id.btn_count_right);
        tvCounterLeft = findViewById(R.id.tv_left);
        tvCounterRight = findViewById(R.id.tv_right);

        btnIncreaseLeft.setOnClickListener(this);
        btnIncreaseRight.setOnClickListener(this);


    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_count_left:
                counterLeft++;
                tvCounterLeft.setText("Count: "+ counterLeft);
                break;
            case R.id.btn_count_right:
                counterRight++;
                tvCounterRight.setText("Count: "+ counterRight);
                break;
        }

    }
}
