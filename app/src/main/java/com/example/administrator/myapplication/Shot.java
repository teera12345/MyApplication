package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Shot extends AppCompatActivity {
TextView calshot;
TextView size;
    TextView torcarb;
EditText dekshot;


    Integer result1;
    Integer result2;
    Integer cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shot);

        calshot = (TextView)findViewById(R.id.txt_shotinsulin);
        dekshot = (EditText)findViewById(R.id.edt_shotinsulin);
        size = (TextView)findViewById(R.id.sizeinsulin);
        torcarb = (TextView)findViewById(R.id.carb);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.9),(int)(height*.5));

        DatabaseManager databaseManager = new DatabaseManager(this);
        CalShot calShot = databaseManager.getCalShot();

        DatabaseManager databaseManager3 = new DatabaseManager(this);
        InsulinDatabase insulinDatabase = databaseManager3.getInsulinDatabase();

        DatabaseManager databaseManager2 = new DatabaseManager(this);
        Person person = databaseManager2.getPerson();

        DatabaseManager databaseManager1 = new DatabaseManager(this);
        CalShot2 calShot2 = databaseManager1.getCalShot2();
        Integer min = person.getTarget1();
        Integer max = person.getTarget2();
        Integer numcheck = calShot.getCheckedblood();
        Integer numcarb4 = insulinDatabase.getCarb4();
        Integer numcarb = insulinDatabase.getCarb();
        Integer numcount = calShot2.getCountcarb();
        result1 = (numcheck - max) / numcarb4;
        result2 = numcount / numcarb;
        cal = result1 + result2;
        String test3 = String.valueOf(cal);
        calshot.setText(test3);

        size.setText(String.format(getString(R.string.format_sizeinsulin), insulinDatabase.getSizeinsulin()));
        int calcarb = insulinDatabase.getCarb();
        String txtcarb = String.valueOf(calcarb);
        torcarb.setText( txtcarb + " กรัม/ส่วน");


        findViewById(R.id.btn_record3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Shot.this,Menu.class);
                startActivity(i);
                finish();
                CalShot3 calShot3 = new CalShot3();
                calShot3.setId("2");
                calShot3.setCalshot(Integer.parseInt(calshot.getText().toString()));
                calShot3.setDekshot(Integer.parseInt(dekshot.getText().toString()));


                DatabaseManager databaseManager = new DatabaseManager(Shot.this);
                databaseManager.storeCalshot3(calShot3);
            }
        });
    }


}
