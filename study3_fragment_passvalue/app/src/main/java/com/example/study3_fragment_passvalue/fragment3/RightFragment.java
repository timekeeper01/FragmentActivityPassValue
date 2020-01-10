package com.example.study3_fragment_passvalue.fragment3;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.study3_fragment_passvalue.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {

    private TextView textView;

    public RightFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_right, container, false);
        textView=view.findViewById(R.id.tv_value);
        return view;
    }

    //定义函数给textview赋值
    public void setTextView(String string){
        textView.setText(string);
    }
}
