package com.example.study3_fragment_passvalue.fragment3;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.study3_fragment_passvalue.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment {

    private Button btnPass;
    private EditText editText;

    public LeftFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_left, container, false);
        btnPass=view.findViewById(R.id.btn_pass);
        editText=view.findViewById(R.id.et_content);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string=editText.getText().toString();
                /**
                 * 方式1：调用findfragmentbyid获取fragment对象，调用该对象中的方法进行赋值
                 */
//                RightFragment rightFragment= (RightFragment) getFragmentManager().
//                        findFragmentById(R.id.fragment_right);
//                rightFragment.setTextView(string);

                /**
                 * 方式2：先调用getFragmentmanager()获得fragmentmanager对象，
                 * 然后调用findfragmentbyid获取右侧fragment对象，
                 * 在调用getview获得右侧fragment的view对象，
                 * 最后调用view的findviewbyid获得右侧赋值的控件
                */
//                RightFragment rightFragment= (RightFragment) getFragmentManager().
//                        findFragmentById(R.id.fragment_right);
//                view=rightFragment.getView();
//                TextView textView=view.findViewById(R.id.tv_value);
//                textView.setText(string);
                /**
                 *方式3:先调用getactivity获取所属的activity对象，然后调用findviewbtid获取目标控件
                 */
                TextView textView=getActivity().findViewById(R.id.tv_value);
                textView.setText(string);
            }
        });
    }
}
