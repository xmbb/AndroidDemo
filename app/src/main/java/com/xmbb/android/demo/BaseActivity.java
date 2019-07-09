package com.xmbb.android.demo;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.xmbb.android.base.AbsBaseActivity;

public abstract class BaseActivity extends AbsBaseActivity<Env> {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
