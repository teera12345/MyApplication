package com.example.administrator.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 20/2/2560.
 */

public class CalShot3 extends RealmObject {
    @PrimaryKey
    String Id;

    int calshot;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getCalshot() {
        return calshot;
    }

    public void setCalshot(int calshot) {
        this.calshot = calshot;
    }

    public int getDekshot() {
        return dekshot;
    }

    public void setDekshot(int dekshot) {
        this.dekshot = dekshot;
    }

    int dekshot;
}
