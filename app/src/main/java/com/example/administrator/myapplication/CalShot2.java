package com.example.administrator.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 7/2/2560.
 */

public class CalShot2 extends RealmObject {
    @PrimaryKey
    String Id;

    String gum;

    public String getGum() {
        return gum;
    }

    public void setGum(String gum) {
        this.gum = gum;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNamefood() {
        return namefood;
    }

    public void setNamefood(String namefood) {
        this.namefood = namefood;
    }

    public int getCountcarb() {
        return countcarb;
    }

    public void setCountcarb(int countcarb) {
        this.countcarb = countcarb;
    }

    String namefood;
    int countcarb;
}
