package com.example.dars_21_hw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final int leftContainer = R.id.left_container;
    private final int rightContainer = R.id.right_container;

    private Button btnIncreaseLeft, btnIncreaseRight;
    private Button btnLeft, btnRight;
    private TextView tvCounterLeft, tvCounterRight;
    private int counterLeft = 0;
    private int counterRight = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();

        btnIncreaseLeft.setOnClickListener(this);
        btnIncreaseRight.setOnClickListener(this);
        btnLeft.setOnClickListener(this);
        btnRight.setOnClickListener(this);


    }

    private void bindViews() {
        btnIncreaseLeft = findViewById(R.id.btn_count_left);
        btnIncreaseRight = findViewById(R.id.btn_count_right);
        tvCounterLeft = findViewById(R.id.tv_left);
        tvCounterRight = findViewById(R.id.tv_right);
        btnLeft = findViewById(R.id.btn_left);
        btnRight = findViewById(R.id.btn_right);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_count_left:
                counterLeft++;
                tvCounterLeft.setText("Count: " + counterLeft);
                break;
            case R.id.btn_count_right:
                counterRight++;
                tvCounterRight.setText("Count: " + counterRight);
                break;
            case R.id.btn_left:
                addFragmentToContainer(leftContainer, new FragmentYellow());
                break;
                case R.id.btn_right:
                addFragmentToContainer(rightContainer, new FragmentGreen());
                break;

        }

    }

    private void addFragmentToContainer(int container, Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(container,fragment)
                .commit();
    }
}
