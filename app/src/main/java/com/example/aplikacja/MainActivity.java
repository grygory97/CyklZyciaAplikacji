package com.example.aplikacja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textView;
    private String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onStartBtnClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class); //inicjalizacja nowej intencji
        EditText editText = (EditText) findViewById(R.id.editView);
        String text = String.valueOf(editText.getText());
        intent.putExtra(SecondActivity.KEY_TEXT, text); //przesłanie naszej danej do 2 activity pierwszy parametr klucz 2 arg dana
        startActivity(intent);
    }
}