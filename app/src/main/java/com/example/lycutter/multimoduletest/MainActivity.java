package com.example.lycutter.multimoduletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.openDebug();
        ARouter.init(getApplication());
        mButton = findViewById(R.id.btn_jump);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/secondview/testActivity").navigation();
                finish();
//                Toast.makeText(MainActivity.this, "点击成功", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
