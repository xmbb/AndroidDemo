package com.xmbb.android.base;

import android.content.Context;

import androidx.annotation.NonNull;

public class BaseEnv {
    @NonNull
    private Context context;

    public BaseEnv(@NonNull Context context) {
        this.context = context;
    }

    @NonNull
    public Context getContext() {
        return context;
    }
}
