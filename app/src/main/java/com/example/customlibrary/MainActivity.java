package com.example.customlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.session.PlaybackState;
import android.os.Bundle;

import com.example.myfirstlibrary.MyCustomClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       int id =  MyCustomClass.div(20,10);
    }
}