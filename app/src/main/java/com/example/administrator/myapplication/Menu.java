package com.example.administrator.myapplication;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import io.realm.Realm;
import io.realm.RealmResults;

public class Menu extends AppCompatActivity {


    Integer resultcheck;
    Integer resultcount;
    Integer resultshot;
    Integer dekchad;
    Integer min;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        TextView checkedblood = (TextView) findViewById(R.id.textView90);
        TextView namefood = (TextView) findViewById(R.id.textView91);
        TextView countcarb = (TextView) findViewById(R.id.txt_carb);
        TextView jor = (TextView)findViewById(R.id.jor);
        TextView nub = (TextView)findViewById(R.id.nub);
        TextView chad = (TextView)findViewById(R.id.chad);
        TextView test = (TextView)findViewById(R.id.textView8);
        TextView dekshot = (TextView)findViewById(R.id.txt_dekshot);
        TextView datetime = (TextView)findViewById(R.id.txt_datetime);
        TextView emotion = (TextView)findViewById(R.id.txt_emotion);
        TextView sick = (TextView)findViewById(R.id.txt_sick);
        TextView exercise = (TextView)findViewById(R.id.txt_exercise);
        TextView other = (TextView)findViewById(R.id.other);
        TextView level = (TextView)findViewById(R.id.txt_level);
        TextView txtgum = (TextView)findViewById(R.id.txt_gum);

        String date = DateFormat.getDateInstance().format(new Date());
        DateFormat df = new SimpleDateFormat("HH:mm");
        String time = df.format(Calendar.getInstance().getTime());
        datetime.setText("วันที่ " + date + " เวลา " + time);


        DatabaseManager databaseManager = new DatabaseManager(this);
        CalShot calShot = databaseManager.getCalShot();

        DatabaseManager databaseManager3 = new DatabaseManager(this);
        InsulinDatabase insulinDatabase = databaseManager3.getInsulinDatabase();

        DatabaseManager databaseManager2 = new DatabaseManager(this);
        Person person = databaseManager2.getPerson();

        DatabaseManager databaseManager1 = new DatabaseManager(this);
        CalShot2 calShot2 = databaseManager1.getCalShot2();



        DatabaseManager databaseManager4 = new DatabaseManager(this);
        CalShot3 calShot3 = databaseManager4.getCalShot3();

        DatabaseManager databaseManager5 = new DatabaseManager(this);
        Etc etc = databaseManager5.getEtc();

        min = person.getTarget1();
        Integer max = person.getTarget2();



        if (etc != null) {
            emotion.setText(String.format(getString(R.string.format_emotion), etc.getNormal()));
            emotion.setText(String.format(getString(R.string.format_stress), etc.getNormal()));
            sick.setText(String.format(getString(R.string.format_nosick),etc.getSick()));
            sick.setText(String.format(getString(R.string.format_sick),etc.getSick()));
            exercise.setText(String.format(getString(R.string.format_noexercise),etc.getExercise()));
            exercise.setText(String.format(getString(R.string.format_exercise),etc.getExercise()));
        }
        else {
            emotion.setVisibility(View.GONE);
            sick.setVisibility(View.GONE);
            exercise.setVisibility(View.GONE);
            other.setVisibility(View.GONE);
        }



        if (calShot != null) {
            resultcheck = calShot.checkedblood;
            min = person.getTarget1();
            max = person.getTarget2();
            String check = String.valueOf(resultcheck);
            checkedblood.setText("ระดับน้ำตาลในเลือด : " + check + " (มก%)");
            jor.setVisibility(View.VISIBLE);
            nub.setVisibility(View.GONE);

            if (resultcheck < min){
                level.setText("ระดับน้ำตาลในเลือดต่ำ");
                level.setTextColor(Color.parseColor("#FF040DC1"));
                resultshot = calShot3.getCalshot();
                String shot = String.valueOf(resultshot);

                test.setText("อินซูลินที่คำนวณ : 0  ยูนิต");
                dekchad = calShot3.getDekshot();
                String dek = String.valueOf(dekchad);
                dekshot.setText("น้องฉีด : " + dek + " ยูนิต");
            }
            if (resultcheck <= max && resultcheck >= min){
                level.setText("ปกติ");
                level.setTextColor(Color.parseColor("#FF017309"));
            }
            if (resultcheck > max){
                level.setText("ระดับน้ำตาลในเลือดสูง");
                level.setTextColor(Color.parseColor("#FFE60918"));
            }



        } else {
            checkedblood = (TextView) findViewById(R.id.textView90);
            checkedblood.setVisibility(View.GONE);
            namefood = (TextView) findViewById(R.id.textView91);
            namefood.setVisibility(View.GONE);
            countcarb = (TextView) findViewById(R.id.txt_carb);
            countcarb.setVisibility(View.GONE);
            jor.setVisibility(View.GONE);
            nub.setVisibility(View.GONE);
            emotion.setVisibility(View.GONE);
            sick.setVisibility(View.GONE);
            exercise.setVisibility(View.GONE);
            other.setVisibility(View.GONE);

        }


        if (calShot2 != null) {
            String food = calShot2.getNamefood();
            namefood.setText(food);
            resultcount = calShot2.getCountcarb();
            String count = String.valueOf(resultcount);
            String gum = calShot2.getGum();
            countcarb.setText("จำนวนคาร์บ : " + count );
            txtgum.setText(gum);
            nub.setVisibility(View.VISIBLE);

        } else {

            namefood = (TextView) findViewById(R.id.textView91);
            namefood.setVisibility(View.GONE);
            countcarb = (TextView) findViewById(R.id.txt_carb);
            countcarb.setVisibility(View.GONE);
            nub.setVisibility(View.GONE);
            emotion.setVisibility(View.GONE);
            sick.setVisibility(View.GONE);
            exercise.setVisibility(View.GONE);
            other.setVisibility(View.GONE);
            txtgum.setVisibility(View.GONE);
        }
        if (calShot3 != null) {

            resultshot = calShot3.getCalshot();
            String shot = String.valueOf(resultshot);
            test.setText("อินซูลินที่คำนวณ : " + shot + " ยูนิต");
            dekchad = calShot3.getDekshot();
            String dek = String.valueOf(dekchad);
            dekshot.setText("น้องฉีด : " + dek + " ยูนิต");

        }
        else {
            test.setVisibility(View.GONE);
            chad.setVisibility(View.GONE);
            dekshot.setVisibility(View.GONE);
            emotion.setVisibility(View.GONE);
            sick.setVisibility(View.GONE);
            exercise.setVisibility(View.GONE);
            other.setVisibility(View.GONE);
        }









            Button btn6 = (Button)findViewById(R.id.button6);
            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Menu.this,Setting.class));
                }
            });


            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Menu.this, Check.class));
                }
            });

            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Menu.this, Count.class);
                    startActivity(intent);
                }
            });

            Button btn9 = (Button)findViewById(R.id.button9);
            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Menu.this,Shot.class);
                    startActivity(i);
                }
            });

            Button btnother = (Button)findViewById(R.id.btn_other);
            btnother.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Menu.this,Other.class);
                    startActivity(i);
                }
            });
        }



    }







