package com.example.study3_fragment_passvalue.fragment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.study3_fragment_passvalue.R;

public class FragmentToActivity extends AppCompatActivity implements ResourceFragment.PassValueListener {

    private TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_to);
        tvShow=findViewById(R.id.tv_show);
    }

    @Override
    public void sendMessage(String str) {
        if(str!=null){
            tvShow.setText(str);
        }
    }
}
