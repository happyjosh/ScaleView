package com.jph.scaleview.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jph.scaleview.ScaleImageView;
import com.jph.scaleview.ScaleViewProxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScaleImageView img = findViewById(R.id.main_img_3);
        img.setModelBy(ScaleViewProxy.BY_WIDTH);
        img.setMultiple(0.5f);
    }
}
