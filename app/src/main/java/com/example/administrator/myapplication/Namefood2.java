package com.example.administrator.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 2/3/2560.
 */

public class Namefood2 extends RealmObject {
    @PrimaryKey
    String id;

    String namefood2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamefood2() {
        return namefood2;
    }

    public void setNamefood2(String namefood2) {
        this.namefood2 = namefood2;
    }
}
