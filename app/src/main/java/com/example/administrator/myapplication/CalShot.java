package com.example.administrator.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 6/2/2560.
 */

public class CalShot extends RealmObject {
    @PrimaryKey
    String Id;



    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getCheckedblood() {
        return checkedblood;
    }

    public void setCheckedblood(int checkedblood) {
        this.checkedblood = checkedblood;
    }

    int checkedblood;


}
