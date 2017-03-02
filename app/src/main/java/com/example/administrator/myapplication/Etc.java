package com.example.administrator.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 24/2/2560.
 */

public class Etc extends RealmObject {
    @PrimaryKey
    String id;

    String normal;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }





    public String getSick() {
        return sick;
    }

    public void setSick(String sick) {
        this.sick = sick;
    }



    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    String sick;

    String exercise;

}
