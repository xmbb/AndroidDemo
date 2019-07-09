package com.xmbb.android.base;

import android.app.Application;

public abstract class BaseApp<T extends BaseEnv> extends Application {
    public abstract T getEnv();
}
