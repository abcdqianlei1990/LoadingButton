package com.channey.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.channey.loadingbutton.LoadingButton;

public class MainActivity extends AppCompatActivity{
    private LoadingButton mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (LoadingButton) findViewById(R.id.loadingButton);
        mButton.setBtnOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mButton.startLoading();
                mButton.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mButton.loadingComplete();
                    }
                },2000);
            }
        });
    }
}
