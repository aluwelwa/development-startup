package com.sandi.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by tinashe on 2016/06/21.
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected abstract int getLayoutResId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        ButterKnife.bind(this);
    }
}
