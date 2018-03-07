package yummylau.sourcetest;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import yummylau.sourcetest.databinding.ActivityMainBinding;
import yummylau.sourcetest.touch.TouchTestActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initListener();
    }

    private void initListener() {
        mBinding.touchTestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TouchTestActivity.class));
            }
        });
    }
}
