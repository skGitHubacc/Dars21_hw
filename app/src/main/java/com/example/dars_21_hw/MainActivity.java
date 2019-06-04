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

    Button btnLeft, btnRight;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();


        btnLeft.setOnClickListener(this);
        btnRight.setOnClickListener(this);


    }

    private void bindViews() {
        btnLeft = findViewById(R.id.btn_left);
        btnRight = findViewById(R.id.btn_right);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

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
                .add(container, fragment)
                .commit();
    }
}
