package com.xmbb.android.demo;

import com.xmbb.android.base.BaseApp;

public class App extends BaseApp<Env> {
    private Env env;

    @Override
    public Env getEnv() {
        return env;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        env = new Env(this);
    }
}
