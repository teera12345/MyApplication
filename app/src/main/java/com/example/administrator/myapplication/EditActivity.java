package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {
EditText name;
    EditText birthday;
    EditText hight;
    EditText weight;
    EditText target1;
    EditText target2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        name = (EditText)findViewById(R.id.editname);
        birthday = (EditText)findViewById(R.id.editbirthday);
        hight = (EditText)findViewById(R.id.edithight);
        weight = (EditText)findViewById(R.id.editweight);
        target1 = (EditText)findViewById(R.id.editsugartarget);
        target2 = (EditText)findViewById(R.id.editsugartarget2);
        findViewById(R.id.button_edit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditActivity.this, insulin1.class);
                startActivity(intent);

                Person person = new Person();
                person.setId("1");
                person.setName(name.getText().toString());
                person.setBirthdate(birthday.getText().toString());
                person.setHeight(hight.getText().toString());
                person.setWeight(weight.getText().toString());
                person.setTarget1(Integer.parseInt(target1.getText().toString()));
                person.setTarget2(Integer.parseInt(target2.getText().toString()));


                DatabaseManager databaseManager = new DatabaseManager(EditActivity.this);
                databaseManager.storePerson(person);


            }
        });
    }




}
