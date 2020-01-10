package com.example.study3_fragment_passvalue;
/**
 * activity向fragment传值
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.study3_fragment_passvalue.fragment1.ActivityToFragmentActivity;
import com.example.study3_fragment_passvalue.fragment2.FragmentToActivity;
import com.example.study3_fragment_passvalue.fragment3.FragmentToFragmentActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnActToFra,btnFraToAct,btnFraToFra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activity向fragment传值页面
        btnActToFra=findViewById(R.id.btn_activity_to_fragment);
        btnActToFra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityToFragmentActivity.class));
            }
        });
        //fragment向activity传值页面
        btnFraToAct=findViewById(R.id.btn_fragment_to_activity_);
        btnFraToAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FragmentToActivity.class));
            }
        });
        //fragment向fragment传值页面
        btnFraToFra=findViewById(R.id.btn_fragment_to_fragment);
        btnFraToFra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FragmentToFragmentActivity.class));
            }
        });
    }

}
