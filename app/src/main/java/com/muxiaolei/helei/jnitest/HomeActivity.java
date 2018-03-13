package com.muxiaolei.helei.jnitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.muxiaolei.helei.util.NativeHelper;

public class HomeActivity extends AppCompatActivity {

    private EditText et_first_number;
    private EditText et_second_number;
    private TextView tv_result_sum;
    private TextView btn_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initView();
    }

    private void initView() {
        et_first_number = findViewById(R.id.et_first_number);
        et_second_number = findViewById(R.id.et_second_number);
        tv_result_sum = findViewById(R.id.tv_result_sum);
        btn_calculate = findViewById(R.id.btn_calculate);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
            }
        });
    }

    private void check() {
        String numberOne = et_first_number.getText().toString().trim();
        String numberSecond = et_second_number.getText().toString().trim();
        if(TextUtils.isEmpty(numberOne)) {
            Toast.makeText(this, "请输入第一个加数", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(numberSecond)) {
            Toast.makeText(this, "请输入第二个加数", Toast.LENGTH_SHORT).show();
            return;
        }
        int result = NativeHelper.calculateSum(Integer.parseInt(numberOne), Integer.parseInt(numberSecond));
        tv_result_sum.setText(String.valueOf(result));
    }

}
