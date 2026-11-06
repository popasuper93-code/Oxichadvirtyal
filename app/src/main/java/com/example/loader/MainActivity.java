package com.example.loader;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("Лоудер работает!");
        textView.setTextSize(20);
        textView.setPadding(50, 50, 50, 50);
        setContentView(textView);
    }
}
