package com.example.administrator.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 31/1/2560.
 */

public class Person extends RealmObject {
    @PrimaryKey
    String id;

    String name;
    String birthdate;
    String height;
    String weight;


    public Integer getTarget1() {
        return target1;
    }

    public void setTarget1(Integer target1) {
        this.target1 = target1;
    }

    public Integer getTarget2() {
        return target2;
    }

    public void setTarget2(Integer target2) {
        this.target2 = target2;
    }

    int target1;
    int target2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
