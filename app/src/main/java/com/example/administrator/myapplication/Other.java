package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Other extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        final TextView txtsick = (TextView) findViewById(R.id.txt_typesick);
        txtsick.setVisibility(View.GONE);
        final EditText edtsick = (EditText) findViewById(R.id.edt_typesick);
        edtsick.setVisibility(View.GONE);
        final TextView txtexercise = (TextView) findViewById(R.id.txt_infoexercise);
        txtexercise.setVisibility(View.GONE);
        final EditText edtexercise = (EditText) findViewById(R.id.edt_infoexercise);
        edtexercise.setVisibility(View.GONE);
        final RadioButton rdbnormal = (RadioButton) findViewById(R.id.rdb_normal);
        final RadioButton rdbstress = (RadioButton) findViewById(R.id.rdb_stress);

        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                final RadioButton rdbsick = (RadioButton) findViewById(R.id.rdb_sick);
                rdbsick.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (rdbsick.isChecked()) {
                            txtsick.setVisibility(View.VISIBLE);
                            edtsick.setVisibility(View.VISIBLE);
                        }

                    }
                });
            }
        });
        final RadioButton rdbsick = (RadioButton) findViewById(R.id.rdb_sick);
        rdbsick.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (rdbsick.isChecked()) {
                    txtsick.setVisibility(View.VISIBLE);
                    edtsick.setVisibility(View.VISIBLE);
                }

            }
        });
        final RadioButton rdbnosick = (RadioButton) findViewById(R.id.rdb_nosick);
        rdbnosick.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (rdbnosick.isChecked()) {
                    txtsick.setVisibility(View.GONE);
                    edtsick.setVisibility(View.GONE);
                }

            }
        });

        final RadioButton rdbexercise = (RadioButton) findViewById(R.id.rdb_exercise);
        rdbexercise.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (rdbexercise.isChecked()) {
                    txtexercise.setVisibility(View.VISIBLE);
                    edtexercise.setVisibility(View.VISIBLE);
                }
            }
        });
        final RadioButton rdbnoexercise = (RadioButton) findViewById(R.id.rdb_noexercise);
        rdbnoexercise.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (rdbnoexercise.isChecked()) {
                    txtexercise.setVisibility(View.GONE);
                    edtexercise.setVisibility(View.GONE);
                }

            }
        });


      findViewById(R.id.btn_record).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(Other.this, Menu.class);
                startActivity(i);
                finish();
               Etc etc = new Etc();
                if (rdbnormal.isChecked()){
                    etc.setId("3");
                    etc.setNormal(rdbnormal.getText().toString());
                }
                if (rdbstress.isChecked()){
                    etc.setId("3");
                    etc.setNormal(rdbstress.getText().toString());
                }
                if (rdbnosick.isChecked()){
                    etc.setId("3");
                    etc.setSick(rdbnosick.getText().toString());
                }
                if (rdbsick.isChecked()){
                    etc.setId("3");
                    etc.setSick(edtsick.getText().toString());
                }
                if (rdbnoexercise.isChecked()){
                    etc.setId("3");
                    etc.setExercise(rdbnoexercise.getText().toString());
                }
                if (rdbexercise.isChecked()){
                    etc.setId("3");
                    etc.setExercise(edtexercise.getText().toString());
                }
                DatabaseManager databaseManager = new DatabaseManager(Other.this);
                databaseManager.storeEtc(etc);

            }
        });
    }
    }



