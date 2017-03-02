package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Date;

import io.realm.Realm;

public class Count extends AppCompatActivity {
    EditText countcarb;
    TextView namefood;
    Spinner spiner;
    ArrayAdapter adapter;
    String food;
    String food2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_count);
        spiner = (Spinner)  findViewById(R.id.spinner20);
        adapter = ArrayAdapter.createFromResource(this,R.array.spiner_item,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner.setAdapter(adapter);
        DatabaseManager databaseManager1 = new DatabaseManager(this);
        final CalShot2 calShot2 = databaseManager1.getCalShot2();
        DatabaseManager databaseManager2 = new DatabaseManager(this);
        final Namefood2 namefood2 = databaseManager2.getNamefood2();

        /*DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .9), (int) (height * .5));*/

        countcarb = (EditText)findViewById(R.id.editText41);
        namefood = (TextView) findViewById(R.id.editText43);
        final TextView txtnamefood2 = (TextView) findViewById(R.id.txt_namefood2);
        txtnamefood2.setVisibility(View.GONE);
        TextView namefood3 = (TextView)findViewById(R.id.txt_namefood3);
        namefood3.setVisibility(View.GONE);


        findViewById(R.id.button11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Count.this, Menu.class);

                startActivity(i);
                finish();
                final CalShot2 calShot2 = new CalShot2();
                calShot2.setId("2");
                calShot2.setNamefood(namefood.getText().toString());
                calShot2.setCountcarb(Integer.parseInt(countcarb.getText().toString()));
                calShot2.setGum(spiner.getSelectedItem().toString());



               DatabaseManager databaseManager = new DatabaseManager(Count.this);
                databaseManager.storeCalshot2(calShot2);



            }
        });
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Count.this, ChoosetypeFood.class);
                startActivity(i);
                if (calShot2 != null) {
                    txtnamefood2.setVisibility(View.VISIBLE);
                    TextView txtnamefood2 = (TextView) findViewById(R.id.txt_namefood2);
                    final Namefood2 namefood2 = new Namefood2();
                    namefood2.setId("2");
                    namefood2.setNamefood2(txtnamefood2.getText().toString());
                    if (namefood2 != null) {

                        food2 = namefood2.getNamefood2();
                        txtnamefood2.setText(food2);
                    }
                }


            }
        });

        if (calShot2 != null) {
            food = calShot2.getNamefood();
            namefood.setText(food);
        }


    }

    }



