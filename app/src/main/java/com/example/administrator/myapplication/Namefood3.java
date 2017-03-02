package com.example.administrator.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 2/3/2560.
 */

public class Namefood3 extends RealmObject {
    @PrimaryKey
    String id;

    String namefood3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamefood3() {
        return namefood3;
    }

    public void setNamefood3(String namefood3) {
        this.namefood3 = namefood3;
    }
}
