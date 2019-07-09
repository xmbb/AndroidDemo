package com.xmbb.android.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<T extends BaseEnv> extends AppCompatActivity {
    private T env;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        env = ((T) ((BaseApp) getApplication()).getEnv());
    }

    protected T getEnv() {
        return env;
    }
}
