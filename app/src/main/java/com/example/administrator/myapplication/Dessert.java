package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Dessert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        String[] list = { "สับปะรด 8  = 1 คาร์บ","ลูกเกด 2 ช้อนโต๊ะ(22 กรัม) = 1 คาร์บ","ส้มโอ 2 - 3 กลีบกลาง(120 กรัม) = 1 คาร์บ","มะละกอสุก 8 ชิ้นคำ(125 กรัม) = 1 คาร์บ"};

        int[] resId = { R.drawable.somo
                , R.drawable.lokgrad ,R.drawable.somo
                , R.drawable.malagorsuk };
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(),list, resId);

        final ListView listView = (ListView)findViewById(R.id.listView2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            }
        });
    }
}


