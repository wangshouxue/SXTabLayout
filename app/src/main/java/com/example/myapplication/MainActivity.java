package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_commonTab,tv_slideTab,tv_segmentTab;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_commonTab=findViewById(R.id.tv_commonTab);
        tv_slideTab=findViewById(R.id.tv_slideTab);
        tv_segmentTab=findViewById(R.id.tv_segmentTab);

        tv_commonTab.setOnClickListener(this);
        tv_slideTab.setOnClickListener(this);
        tv_segmentTab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_commonTab:
                startActivity(new Intent(this,CommonTabActivity.class));
                break;
            case R.id.tv_slideTab:
                startActivity(new Intent(this, SlidingTabActivity.class));
                break;
            case R.id.tv_segmentTab:
                startActivity(new Intent(this, SegmentTabActivity.class));
                break;
        }
    }
}
