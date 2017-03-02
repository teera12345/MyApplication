package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.InputQueue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Foods extends AppCompatActivity {
String food1;
    TextView f1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);
        DatabaseManager databaseManager1 = new DatabaseManager(this);
        final CalShot2 calShot2 = databaseManager1.getCalShot2();
        DatabaseManager databaseManager2 = new DatabaseManager(this);
        final Namefood2 namefood2 = databaseManager2.getNamefood2();

         final String[] listfood = { "สับปะรด 8 ชิ้นคำ(125 กรัม) = 1 คาร์บ","ลูกเกด 2 ช้อนโต๊ะ(22 กรัม) = 1 คาร์บ","ส้มโอ 2 - 3 กลีบกลาง(120 กรัม) = 1 คาร์บ","มะละกอสุก 8 ชิ้นคำ(125 กรัม) = 1 คาร์บ"};

        int[] resId = { R.drawable.pineapple
                , R.drawable.lokgrad ,R.drawable.somo
                , R.drawable.malagorsuk };
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(),listfood, resId);


        final ListView listView = (ListView)findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                for (int i = 0 ;i < listfood.length; i++){
                    if (arg2 ==i){
                        calShot2.setId("2");
                        calShot2.setNamefood(listfood[i].toString());
                        Intent intent = new Intent(listView.getContext(),Count.class);
                        startActivityForResult(intent,i);
                        DatabaseManager databaseManager = new DatabaseManager(Foods.this);
                        databaseManager.storeCalshot2(calShot2);
                        break;
                    }
                    if (arg2 ==i){
                        namefood2.setId("2");
                        namefood2.setNamefood2(listfood[i].toString());
                        Intent intent = new Intent(listView.getContext(),Count.class);
                        startActivityForResult(intent,i);
                        DatabaseManager databaseManager = new DatabaseManager(Foods.this);
                        databaseManager.storeNamefood2(namefood2);
                        break;
                    }

                }
                }

        });
    }
}




