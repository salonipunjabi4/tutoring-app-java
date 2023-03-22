package com.sp.pythontutor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class spActivity extends AppCompatActivity {

    ImageView iv1;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);

        iv1 = findViewById(R.id.iv1);
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.a1);
        iv1.startAnimation(animation);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent a = new Intent(spActivity.this,MainActivity.class);
                startActivity(a);
                finish();
            }
        }).start();
    }
}
