package com.example.aplikacja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        text += "onCreate()\n";
        updateTextView();
    }

    @Override
    protected void onPause() {
        super.onPause();
        text += "onPause()\n";
        updateTextView();
    }

    @Override
    protected void onStart() {
        super.onStart();
        text += "onStart()\n";
        updateTextView();
    }

    @Override
    protected void onStop() {
        super.onStop();
        text += "onStop()\n";
        updateTextView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        text += "onResume()\n";
        updateTextView();
    }

    private void updateTextView() {
        textView.setText(text);
    }

    public void onStartBtnClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}