package com.example.study3_fragment_passvalue.fragment1;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.study3_fragment_passvalue.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {

    private TextView tvShow;

    public ResultFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_result,container,false);
        tvShow=view.findViewById(R.id.tv_show);
        //先调用getarguments方法获取bundle对象中根据key获取传递的数据，展示在textview中
        //在fragment自己的部分修改edittext内容
        Bundle bundle=getArguments();
        if(bundle!=null){
            String info=bundle.getString("info");
            tvShow.setText(info);
        }
        return view;
    }

}
