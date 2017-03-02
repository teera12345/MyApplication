package com.example.administrator.myapplication;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {
    EditText birthdate;
    EditText name, hight, weight;
    EditText target1,target2;
    Integer caltarget1,caltarget2,calall;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.editText2);
        hight = (EditText) findViewById(R.id.editText4);
        weight = (EditText) findViewById(R.id.editText5);
        birthdate = (EditText) findViewById(R.id.editText3);
        target1 = (EditText) findViewById(R.id.editText);
        target2 = (EditText)findViewById(R.id.editText42);

        birthdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                birthdate.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year + 543));
                            }

                        },mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });
        DatabaseManager databaseManager = new DatabaseManager(this);
        Person person = databaseManager.getPerson();
        if(person != null) {
            Intent intent = new Intent(this,Menu.class);
            startActivity(intent);
            finish();
        }

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, insulin1.class);
                startActivity(intent);


                Person person = new Person();
                person.setId("1");
                person.setName(name.getText().toString());
                person.setBirthdate(birthdate.getText().toString());
                person.setHeight(hight.getText().toString());
                person.setWeight(weight.getText().toString());
                person.setTarget1(Integer.parseInt(target1.getText().toString()));
                person.setTarget2(Integer.parseInt(target2.getText().toString()));



                DatabaseManager databaseManager = new DatabaseManager(MainActivity.this);
                databaseManager.storePerson(person);




            }
        });


    }

    public void Onclick1(View view) {
        /*EditText et1 = (EditText)findViewById(R.id.editText2);
        String text = et1.getText().toString();
        EditText et2 = (EditText)findViewById(R.id.editText3);
        String text2 = et2.getText().toString();
        EditText et3 = (EditText)findViewById(R.id.editText4);
        String text3 = et3.getText().toString();
        EditText et4 = (EditText)findViewById(R.id.editText5);
        String text4 = et4.getText().toString();
        EditText et5 = (EditText)findViewById(R.id.editText);
        String text5 = et5.getText().toString();
        EditText et6 = (EditText)findViewById(R.id.editText42);
        String text6 = et6.getText().toString();

        intent.putExtra("name", text);
        intent.putExtra("birdday", text2);
        intent.putExtra("hight", text3);
        intent.putExtra("weight", text4);
        intent.putExtra("taget", text5);
        intent.putExtra("taget2", text6);*/
        Intent intent = new Intent(MainActivity.this, insulin1.class);
        startActivity(intent);

    }
}






