package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

import io.realm.Realm;
import io.realm.RealmResults;

public class Setting extends AppCompatActivity implements View.OnClickListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        TextView name = (TextView) findViewById(R.id.textView73);
        TextView date = (TextView) findViewById(R.id.textView79);
        TextView hight = (TextView) findViewById(R.id.textView80);
        TextView weight = (TextView) findViewById(R.id.textView81);
        TextView target1 = (TextView) findViewById(R.id.txt_target);
        TextView target2 = (TextView) findViewById(R.id.textView83);
        TextView nameinsulin = (TextView) findViewById(R.id.txt_nameinsulin);
        TextView sizeinsulin = (TextView) findViewById(R.id.textView88);
        TextView carb = (TextView) findViewById(R.id.textView89);
        TextView nameinsulin4 = (TextView) findViewById(R.id.txt_nameinsulin2);
        TextView sizeinsulin4 = (TextView) findViewById(R.id.txt_sizeinsulin2);
        TextView carb4 = (TextView) findViewById(R.id.txt_carb2);
        TextView nameinsulinbase1 = (TextView) findViewById(R.id.txt_nameinsulinbase1);
        TextView sizeinsulinbase1 = (TextView) findViewById(R.id.txt_sizeinsulinbase1);
        TextView sizeinsulinbase2 = (TextView) findViewById(R.id.txt_sizeinsulinbase2);
        TextView morningtime = (TextView) findViewById(R.id.txt_morningtime);
        TextView aftersleeptime = (TextView) findViewById(R.id.txt_aftersleeptime);


        Button backButton = (Button) findViewById(R.id.back_button);
        Button editButton = (Button) findViewById(R.id.edit_button);
        backButton.setOnClickListener(this);
        editButton.setOnClickListener(this);

        DatabaseManager databaseManager = new DatabaseManager(this);
        Person person = databaseManager.getPerson();
        name.setText(String.format(getString(R.string.format_name), person.getName()));
        date.setText(String.format(getString(R.string.format_date), person.getBirthdate()));
        hight.setText(String.format(getString(R.string.format_hight), person.getHeight()));
        weight.setText(String.format(getString(R.string.format_weight), person.getWeight()));
        int min = person.getTarget1();
        String targetmin = String.valueOf(min);
        target1.setText("น้ำตาลเป้าหมาย : " + targetmin );
        int max = person.getTarget2();
        String targetmax = String.valueOf(max);
        target2.setText(" "+targetmax);

        DatabaseManager databaseManager1 = new DatabaseManager(this);
        InsulinDatabase insulinDatabase = databaseManager1.getInsulinDatabase();
        nameinsulin.setText(String.format(getString(R.string.format_nameinsulin), insulinDatabase.getNameinsulin()));
        sizeinsulin.setText(String.format(getString(R.string.format_sizeinsulin), insulinDatabase.getSizeinsulin()));
        int calcarb = insulinDatabase.getCarb();
        String txtcarb = String.valueOf(calcarb);
        carb.setText( txtcarb + " กรัม/ส่วน");


        nameinsulin4.setText(String.format(getString(R.string.format_nameinsulin4), insulinDatabase.getNameinsulin4()));
        sizeinsulin4.setText(String.format(getString(R.string.format_sizeinsulin4), insulinDatabase.getSizeinsulin4()));
        int calcarb4 = insulinDatabase.getCarb4();
        String txtcarb4 = String.valueOf(calcarb4);
        carb4.setText(txtcarb4 + " มิลลิกรัม/เดซิลิตร");


        nameinsulinbase1.setText(String.format(getString(R.string.format_nameinsulinbase1), insulinDatabase.getNameinsulinbase1()));
        sizeinsulinbase1.setText(String.format(getString(R.string.format_sizeinsulinbase1), insulinDatabase.getSizeinsulinbase1()));
        sizeinsulinbase2.setText(String.format(getString(R.string.format_sizeinsulinbase2), insulinDatabase.getSizeinsulinbase2()));
        morningtime.setText(String.format(getString(R.string.format_morningtime), insulinDatabase.getMorningtime1()));
        aftersleeptime.setText(String.format(getString(R.string.format_aftersleeptime), insulinDatabase.getAftersleeptime1()));

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_button:
                finish();
                break;
            case R.id.edit_button:
                Intent intent = new Intent(Setting.this, EditActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
