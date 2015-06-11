package com.nanodegree.tadeuaraujo.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mainAppsOnClickEvent(View v) {
        Button btn = (Button) v;

        String text = String.format(getString(R.string.toast_message_template), btn.getText().toString());

        Toast.makeText(this, text,Toast.LENGTH_SHORT).show();
    }
}
