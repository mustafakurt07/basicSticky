package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
Button button;
Button  button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button1=findViewById(R.id.button1);
    }

    public void baslat(View view) {
        Intent intent=new Intent(this,StickyService.class);
        startService(intent);

    }

    public void durdur(View view) {
        Intent intent=new Intent(this,StickyService.class);
        stopService(intent);
    }
}
