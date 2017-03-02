package com.example.administrator.myapplication;

import android.content.Intent;
import android.media.ExifInterface;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;

import io.realm.Realm;

public class Check extends AppCompatActivity {
EditText checkedblood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        checkedblood = (EditText) findViewById(R.id.editText40);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.9),(int)(height*.5));



        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Check.this, Menu.class);
                startActivity(i);
                finish();
              CalShot calShot = new CalShot();
              calShot.setId("2");
              calShot.setCheckedblood(Integer.parseInt(checkedblood.getText().toString()));




        DatabaseManager databaseManager = new DatabaseManager(Check.this);
        databaseManager.storeCalshot(calShot);


            }
        });
    }






        }


