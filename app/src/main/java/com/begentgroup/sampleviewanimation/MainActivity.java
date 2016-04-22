package com.begentgroup.sampleviewanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animationView = (ImageView)findViewById(R.id.image_animation);

        Button btn = (Button)findViewById(R.id.btn_translate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_scale);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_rotate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_alpha);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_set1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.set1);
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_left_out);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.left_out);
                anim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        animationView.setVisibility(View.GONE);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                animationView.startAnimation(anim);
            }
        });
        btn = (Button)findViewById(R.id.btn_left_in);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.left_in);
                animationView.setVisibility(View.VISIBLE);
                animationView.startAnimation(anim);
            }
        });
        btn = (Button)findViewById(R.id.btn_custom);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = new CustomAnimation();
                anim.setDuration(1000);
                animationView.startAnimation(anim);
            }
        });

    }
}
