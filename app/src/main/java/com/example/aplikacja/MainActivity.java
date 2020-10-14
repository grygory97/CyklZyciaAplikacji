package com.example.aplikacja;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;


public class MainActivity extends AppCompatActivity {

    boolean isSecondFragment = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager().beginTransaction() //Coś do zmiany
                .add(R.id.fragment_container, new FirstFragment())
                .commit();
    }


    public void onReplaceBtnClick(View view) {
        if (isSecondFragment) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new SecondFragment())
                    .commit();
        } else {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new FirstFragment())
                    .commit();
        }
        isSecondFragment = !isSecondFragment;
    }
}