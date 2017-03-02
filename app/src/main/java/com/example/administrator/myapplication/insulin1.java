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

public class insulin1 extends AppCompatActivity {





    RadioButton nameinsulin;
    RadioButton nameinsulin2;
    RadioButton nameinsulin4;
    RadioButton nameinsulin5;
    RadioButton nameinsulinbase1;
    RadioButton other;
    RadioButton other2;

    EditText sizeinsulin;
    EditText carb;
    EditText sizeinsulin2;
    EditText carb2;
    EditText sizeinsulin4;
    EditText carb4;
    EditText nameinsulin3;
    EditText sizeinsulin3;
    EditText carb3;
    EditText sizeinsulin5;
    EditText carb5;
    EditText nameinsulin6;
    EditText sizeinsulin6;
    EditText carb6;
    EditText sizeinsulinbase1;
    EditText sizeinsulinbase2;
    EditText morningtime1;
    EditText aftersleeptime1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insulin1);

        nameinsulin = (RadioButton) findViewById(R.id.novorapid);
        nameinsulin2 = (RadioButton)findViewById(R.id.humulinR);
        other = (RadioButton)findViewById(R.id.radioButton3);
        other2 = (RadioButton)findViewById(R.id.radioButton6);
        nameinsulin4 = (RadioButton)findViewById(R.id.novorapid2);
        nameinsulin5 = (RadioButton)findViewById(R.id.humulinR2);
        nameinsulinbase1 = (RadioButton)findViewById(R.id.radioButton7);

        sizeinsulin = (EditText) findViewById(R.id.editText10);
        carb = (EditText) findViewById(R.id.editText11);
        sizeinsulin2 = (EditText)findViewById(R.id.editText12);
        carb2 = (EditText)findViewById(R.id.editText20);
        nameinsulin3 = (EditText)findViewById(R.id.editText28);
        sizeinsulin3 = (EditText)findViewById(R.id.editText18);
        carb3 = (EditText)findViewById(R.id.editText21);
        sizeinsulin4 =(EditText)findViewById(R.id.editText23);
        carb4 = (EditText)findViewById(R.id.editText24);
        sizeinsulin5 = (EditText)findViewById(R.id.editText17);
        carb5 = (EditText)findViewById(R.id.editText19);
        nameinsulin6 = (EditText)findViewById(R.id.editText39);
        sizeinsulin6 =(EditText)findViewById(R.id.editText22);
        carb6 = (EditText)findViewById(R.id.editText25);
        sizeinsulinbase1 =(EditText)findViewById(R.id.editText26);
        morningtime1 = (EditText)findViewById(R.id.editText27);
        sizeinsulinbase2 = (EditText)findViewById(R.id.editText29);
        aftersleeptime1 = (EditText)findViewById(R.id.editText30);






        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(insulin1.this, Menu.class);
                startActivity(i);
                finish();
                InsulinDatabase insulinDatabase = new InsulinDatabase();
                if (nameinsulin.isChecked()) {
                    insulinDatabase.setId("1");
                    insulinDatabase.setNameinsulin(nameinsulin.getText().toString());
                    insulinDatabase.setSizeinsulin(sizeinsulin.getText().toString());
                    insulinDatabase.setCarb(Integer.parseInt(carb.getText().toString()));

                }
                if (nameinsulin2.isChecked()) {
                    insulinDatabase.setId("1");
                    insulinDatabase.setNameinsulin(nameinsulin2.getText().toString());
                    insulinDatabase.setSizeinsulin(sizeinsulin2.getText().toString());
                    insulinDatabase.setCarb(Integer.parseInt(carb2.getText().toString()));
                }
                if (other.isChecked()) {
                    insulinDatabase.setId("1");
                    insulinDatabase.setNameinsulin(nameinsulin3.getText().toString());
                    insulinDatabase.setSizeinsulin(sizeinsulin3.getText().toString());
                    insulinDatabase.setCarb(Integer.parseInt(carb3.getText().toString()));
                }
                if (nameinsulin4.isChecked()){
                    insulinDatabase.setId("1");
                    insulinDatabase.setNameinsulin4(nameinsulin4.getText().toString());
                    insulinDatabase.setSizeinsulin4(sizeinsulin4.getText().toString());
                    insulinDatabase.setCarb4(Integer.parseInt(carb4.getText().toString()));
                }
                if (nameinsulin5.isChecked()){
                    insulinDatabase.setId("1");
                    insulinDatabase.setNameinsulin4(nameinsulin5.getText().toString());
                    insulinDatabase.setSizeinsulin4(sizeinsulin5.getText().toString());
                    insulinDatabase.setCarb4(Integer.parseInt(carb5.getText().toString()));
                }
                if (other2.isChecked()) {
                    insulinDatabase.setId("1");
                    insulinDatabase.setNameinsulin4(nameinsulin6.getText().toString());
                    insulinDatabase.setSizeinsulin4(sizeinsulin6.getText().toString());
                    insulinDatabase.setCarb4(Integer.parseInt(carb6.getText().toString()));
                }
                if (nameinsulinbase1.isChecked()){
                    insulinDatabase.setId("1");
                    insulinDatabase.setNameinsulinbase1(nameinsulinbase1.getText().toString());
                    insulinDatabase.setSizeinsulinbase1(sizeinsulinbase1.getText().toString());
                    insulinDatabase.setSizeinsulinbase2(sizeinsulinbase2.getText().toString());
                    insulinDatabase.setMorningtime1(morningtime1.getText().toString());
                    insulinDatabase.setAftersleeptime1(aftersleeptime1.getText().toString());
                }



                DatabaseManager databaseManager = new DatabaseManager(insulin1.this);
                databaseManager.storeInsulin(insulinDatabase);





            }

        });











        final EditText et = (EditText) findViewById(R.id.editText10);
        et.setVisibility(View.GONE);
        final EditText et2 = (EditText) findViewById(R.id.editText11);
        et2.setVisibility(View.GONE);
        final EditText et3 = (EditText) findViewById(R.id.editText12);
        et3.setVisibility(View.GONE);
        final EditText et4 = (EditText) findViewById(R.id.editText20);
        et4.setVisibility(View.GONE);
        final EditText et5 = (EditText) findViewById(R.id.editText18);
        et5.setVisibility(View.GONE);
        final EditText et6 = (EditText) findViewById(R.id.editText21);
        et6.setVisibility(View.GONE);
        final EditText et7 = (EditText) findViewById(R.id.editText23);
        et7.setVisibility(View.GONE);
        final EditText et8 = (EditText) findViewById(R.id.editText24);
        et8.setVisibility(View.GONE);
        final EditText et9 = (EditText) findViewById(R.id.editText17);
        et9.setVisibility(View.GONE);
        final EditText et10 = (EditText) findViewById(R.id.editText19);
        et10.setVisibility(View.GONE);
        final EditText et11 = (EditText) findViewById(R.id.editText22);
        et11.setVisibility(View.GONE);
        final EditText et12 = (EditText) findViewById(R.id.editText25);
        et12.setVisibility(View.GONE);
        final EditText et13 = (EditText) findViewById(R.id.editText26);
        et13.setVisibility(View.GONE);
        final EditText et14 = (EditText) findViewById(R.id.editText27);
        et14.setVisibility(View.GONE);
        final EditText et15 = (EditText) findViewById(R.id.editText29);
        et15.setVisibility(View.GONE);
        final EditText et16 = (EditText) findViewById(R.id.editText30);
        et16.setVisibility(View.GONE);
        final EditText et17 = (EditText) findViewById(R.id.editText31);
        et17.setVisibility(View.GONE);
        final EditText et18 = (EditText) findViewById(R.id.editText32);
        et18.setVisibility(View.GONE);
        final EditText et19 = (EditText) findViewById(R.id.editText33);
        et19.setVisibility(View.GONE);
        final EditText et20 = (EditText) findViewById(R.id.editText34);
        et20.setVisibility(View.GONE);
        final EditText et21 = (EditText) findViewById(R.id.editText35);
        et21.setVisibility(View.GONE);
        final EditText et22 = (EditText) findViewById(R.id.editText36);
        et22.setVisibility(View.GONE);
        final EditText et23 = (EditText) findViewById(R.id.editText37);
        et23.setVisibility(View.GONE);
        final EditText et24 = (EditText) findViewById(R.id.editText38);
        et24.setVisibility(View.GONE);
        final EditText et25 = (EditText) findViewById(R.id.editText28);
        et25.setVisibility(View.GONE);
        final EditText et26 = (EditText) findViewById(R.id.editText39);
        et26.setVisibility(View.GONE);


        final TextView txt = (TextView) findViewById(R.id.textView25);
        txt.setVisibility(View.GONE);
        final TextView txt2 = (TextView) findViewById(R.id.textView26);
        txt2.setVisibility(View.GONE);
        final TextView txt4 = (TextView) findViewById(R.id.textView29);
        txt4.setVisibility(View.GONE);
        final TextView txt5 = (TextView) findViewById(R.id.textView30);
        txt5.setVisibility(View.GONE);
        final TextView txt6 = (TextView) findViewById(R.id.textView36);
        txt6.setVisibility(View.GONE);
        final TextView txt8 = (TextView) findViewById(R.id.textView43);
        txt8.setVisibility(View.GONE);
        final TextView txt9 = (TextView) findViewById(R.id.textView39);
        txt9.setVisibility(View.GONE);
        final TextView txt10 = (TextView) findViewById(R.id.textView40);
        txt10.setVisibility(View.GONE);
        final TextView txt11 = (TextView) findViewById(R.id.textView44);
        txt11.setVisibility(View.GONE);
        final TextView txt12 = (TextView) findViewById(R.id.textView51);
        txt12.setVisibility(View.GONE);
        final TextView txt13 = (TextView) findViewById(R.id.textView52);
        txt13.setVisibility(View.GONE);
        final TextView txt14 = (TextView) findViewById(R.id.textView53);
        txt14.setVisibility(View.GONE);
        final TextView txt15 = (TextView) findViewById(R.id.textView23);
        txt15.setVisibility(View.GONE);
        final TextView txt16 = (TextView) findViewById(R.id.textView27);
        txt16.setVisibility(View.GONE);
        final TextView txt17 = (TextView) findViewById(R.id.textView28);
        txt17.setVisibility(View.GONE);
        final TextView txt18 = (TextView) findViewById(R.id.textView37);
        txt18.setVisibility(View.GONE);
        final TextView txt19 = (TextView) findViewById(R.id.textView38);
        txt19.setVisibility(View.GONE);
        final TextView txt20 = (TextView) findViewById(R.id.textView41);
        txt20.setVisibility(View.GONE);
        final TextView txt21 = (TextView) findViewById(R.id.textView47);
        txt21.setVisibility(View.GONE);
        final TextView txt22 = (TextView) findViewById(R.id.textView48);
        txt22.setVisibility(View.GONE);
        final TextView txt23 = (TextView) findViewById(R.id.textView49);
        txt23.setVisibility(View.GONE);
        final TextView txt24 = (TextView) findViewById(R.id.textView56);
        txt24.setVisibility(View.GONE);
        final TextView txt25 = (TextView) findViewById(R.id.textView57);
        txt25.setVisibility(View.GONE);
        final TextView txt26 = (TextView) findViewById(R.id.textView58);
        txt26.setVisibility(View.GONE);
        final TextView txt27 = (TextView) findViewById(R.id.textView59);
        txt27.setVisibility(View.GONE);
        final TextView txt28 = (TextView) findViewById(R.id.textView60);
        txt28.setVisibility(View.GONE);
        final TextView txt29 = (TextView) findViewById(R.id.textView61);
        txt29.setVisibility(View.GONE);
        final TextView txt30 = (TextView) findViewById(R.id.textView62);
        txt30.setVisibility(View.GONE);
        final TextView txt31 = (TextView) findViewById(R.id.textView63);
        txt31.setVisibility(View.GONE);
        final TextView txt32 = (TextView) findViewById(R.id.textView64);
        txt32.setVisibility(View.GONE);



        final RadioButton radioButton = (RadioButton) findViewById(R.id.novorapid);

        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButton.isChecked()) {
                    et.setVisibility(View.VISIBLE);
                    et2.setVisibility(View.VISIBLE);
                    txt.setVisibility(View.VISIBLE);
                    txt2.setVisibility(View.VISIBLE);

                    txt4.setVisibility(View.VISIBLE);

                }


            }
        });
        final RadioButton radioButton2 = (RadioButton) findViewById(R.id.humulinR);
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButton2.isChecked()) {
                    et3.setVisibility(View.VISIBLE);
                    et4.setVisibility(View.VISIBLE);
                    txt5.setVisibility(View.VISIBLE);
                    txt6.setVisibility(View.VISIBLE);

                    txt8.setVisibility(View.VISIBLE);

                }
            }
        });
        final RadioButton radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButton3.isChecked()) {
                    et5.setVisibility(View.VISIBLE);
                    et6.setVisibility(View.VISIBLE);
                    et25.setVisibility(View.VISIBLE);
                    txt9.setVisibility(View.VISIBLE);
                    txt10.setVisibility(View.VISIBLE);
                    txt11.setVisibility(View.VISIBLE);

                }
            }
        });
        final RadioButton radioButton4 = (RadioButton) findViewById(R.id.novorapid2);
        radioButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButton4.isChecked()) {
                    et7.setVisibility(View.VISIBLE);
                    et8.setVisibility(View.VISIBLE);
                    txt12.setVisibility(View.VISIBLE);
                    txt13.setVisibility(View.VISIBLE);
                    txt14.setVisibility(View.VISIBLE);

                }
            }
        });
        final RadioButton radioButton5 = (RadioButton) findViewById(R.id.humulinR2);
        radioButton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButton5.isChecked()) {
                    et9.setVisibility(View.VISIBLE);
                    et10.setVisibility(View.VISIBLE);
                    txt15.setVisibility(View.VISIBLE);
                    txt16.setVisibility(View.VISIBLE);
                    txt17.setVisibility(View.VISIBLE);

                }
            }

        });
        final RadioButton radioButton6 = (RadioButton) findViewById(R.id.radioButton6);
        radioButton6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButton6.isChecked()) {
                    et11.setVisibility(View.VISIBLE);
                    et12.setVisibility(View.VISIBLE);
                    et26.setVisibility(View.VISIBLE);
                    txt18.setVisibility(View.VISIBLE);
                    txt19.setVisibility(View.VISIBLE);
                    txt20.setVisibility(View.VISIBLE);

                }
            }

        });
        final RadioButton radioButton7 = (RadioButton) findViewById(R.id.radioButton7);
        radioButton7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButton7.isChecked()) {
                    et13.setVisibility(View.VISIBLE);
                    et14.setVisibility(View.VISIBLE);
                    et15.setVisibility(View.VISIBLE);
                    et16.setVisibility(View.VISIBLE);
                    txt21.setVisibility(View.VISIBLE);
                    txt22.setVisibility(View.VISIBLE);
                    txt23.setVisibility(View.VISIBLE);
                    txt24.setVisibility(View.VISIBLE);
                }
            }

        });
        final RadioButton radioButton8 = (RadioButton) findViewById(R.id.radioButton8);
        radioButton8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButton8.isChecked()) {
                    et17.setVisibility(View.VISIBLE);
                    et18.setVisibility(View.VISIBLE);
                    et19.setVisibility(View.VISIBLE);
                    et20.setVisibility(View.VISIBLE);
                    txt25.setVisibility(View.VISIBLE);
                    txt26.setVisibility(View.VISIBLE);
                    txt27.setVisibility(View.VISIBLE);
                    txt28.setVisibility(View.VISIBLE);
                }
            }

        });
        final RadioButton radioButton9 = (RadioButton) findViewById(R.id.radioButton9);
        radioButton9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButton9.isChecked()) {
                    et21.setVisibility(View.VISIBLE);
                    et22.setVisibility(View.VISIBLE);
                    et23.setVisibility(View.VISIBLE);
                    et24.setVisibility(View.VISIBLE);
                    txt29.setVisibility(View.VISIBLE);
                    txt30.setVisibility(View.VISIBLE);
                    txt31.setVisibility(View.VISIBLE);
                    txt32.setVisibility(View.VISIBLE);
                }
            }

        });

    }


    public void Onclick2(View view){
       /* EditText edt1 =(EditText)findViewById(R.id.editText10);
        String txtin1 = edt1.getText().toString();
        EditText edt1_2 = (EditText)findViewById(R.id.editText11);
        String txtin1_2 = edt1_2.getText().toString();
        EditText edt2 = (EditText)findViewById(R.id.editText23);
        String txtin2 = edt2.getText().toString();
        EditText edt2_2 = (EditText)findViewById(R.id.editText24);
        String txtin2_2 = edt2_2.getText().toString();
        Intent intent = new Intent();

        intent.putExtra("name", text);
        intent.putExtra("birdday",text2);
        intent.putExtra("hight", text3);
        intent.putExtra("weight", text4);
        intent.putExtra("taget",text5);
        intent.putExtra("taget2",text6);


        intent.putExtra("insulin1",txtinsulin1);
        intent.putExtra("insulin2",txtinsulin2);

        intent.putExtra("size1",txtin1);
        intent.putExtra("carb1",txtin1_2);
        intent.putExtra("size2",txtin2);
        intent.putExtra("carb2",txtin2_2);
        Intent intent = new Intent(insulin1.this,Menu.class);
        startActivity(intent);*/
    }


}
