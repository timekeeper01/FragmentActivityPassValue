package com.example.study3_fragment_passvalue.fragment2;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.study3_fragment_passvalue.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResourceFragment extends Fragment {

    private EditText editText;
    private Button btnPass;
    private PassValueListener passValueListener;

    public ResourceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //通过getactivity创建接口子类对象，activity实现了接口，是其子类
        passValueListener= (PassValueListener) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_resource,container,false);
        editText=view.findViewById(R.id.et_content);
        btnPass=view.findViewById(R.id.btn_pass);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击按钮时获取edittext中的值传递到activity
                String info=editText.getText().toString();
                //此时的passvalue对象是接口子类，即activity的对象，此方法相当于调用了activity中的sendmessage方法
                passValueListener.sendMessage(info);
            }
        });
    }

    //定义接口，接口中定义回传数据的函数
    public interface PassValueListener{
        public abstract void sendMessage(String str);
    }
}
