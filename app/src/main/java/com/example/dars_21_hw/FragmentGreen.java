package com.example.dars_21_hw;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentGreen extends Fragment implements View.OnClickListener {
    Button btnIncreaseRight;
    TextView tvCounterRight;
    int counter = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
      View v=  inflater.inflate(R.layout.fragment2, container, false);
        btnIncreaseRight = v.findViewById(R.id.btn_count_right);
        tvCounterRight = v.findViewById(R.id.tv_right);
        btnIncreaseRight.setOnClickListener(this);
        return v;

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        counter++;
        tvCounterRight.setText("Count: " + counter);
    }
}
