package com.example.study3_fragment_passvalue.fragment3;
/**
 * fragment间的传值
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.study3_fragment_passvalue.R;

public class FragmentToFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fra_to_fra);
    }
}
