package com.xmbb.android.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

import com.xmbb.android.demo.aidl.AIDLServerActivity;

public class MainActivity extends BaseActivity {
    private LinearLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootLayout = findViewById(R.id.root_layout);
        registerDemo("AIDL", AIDLServerActivity.class);
    }

    private void registerDemo(@NonNull String title, @NonNull final Class cls) {
        Button button = new Button(this);
        button.setText(title);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        int margin = getResources().getDimensionPixelOffset(R.dimen.button_margin);
        lp.setMargins(0, margin, 0, margin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, cls));
            }
        });
        rootLayout.addView(button, lp);
    }
}
