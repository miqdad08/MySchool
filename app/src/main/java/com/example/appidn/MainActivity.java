package com.example.appidn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, KelasActivity.class);
        startActivity(intent);
    }

    public void Pindah2(View view) {
        Intent intent = new Intent(MainActivity.this, AsramaActivity.class);
        startActivity(intent);
    }

    public void Pindah3(View view) {
        Intent intent = new Intent(MainActivity.this, JadwalActivity.class);
        startActivity(intent);
    }

    public void Pindah4(View view) {
        Intent intent = new Intent(MainActivity.this, TentangActivity.class);
        startActivity(intent);
    }

    public void Pindah5(View view) {
        Intent intent = new Intent(MainActivity.this, GuruActivity.class);
        startActivity(intent);
    }

    public void Pindah6(View view) {
        Intent intent = new Intent(MainActivity.this, MusyrifActivity.class);
        startActivity(intent);
    }
}
