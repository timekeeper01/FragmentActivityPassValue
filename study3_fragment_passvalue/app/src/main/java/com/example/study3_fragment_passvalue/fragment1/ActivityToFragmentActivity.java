package com.example.study3_fragment_passvalue.fragment1;
/**
 * activity向fragment传值
 */

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.study3_fragment_passvalue.R;

public class ActivityToFragmentActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private Button btnPass;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_fragment);
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.layout_content, new ResultFragment());
        fragmentTransaction.commit();

        editText = findViewById(R.id.et_content);

    }

    /**
     * 表示点击按钮将edittext中的数据传递到resultfragment中
     *
     * @param view
     */
    public void passValue(View view) {
        //使用trim函数去除多余空格
        String info = editText.getText().toString().trim();
        ResultFragment resultFragment = new ResultFragment();
        //创建bundle对象，将需要传递的数据存储到bundle中，然后调用fragment的setArguments方法传递bundle
        Bundle bundle = new Bundle();
        bundle.putString("info", info);
        resultFragment.setArguments(bundle);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.layout_content, resultFragment);
        fragmentTransaction.commit();
    }


}
