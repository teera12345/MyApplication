package com.example.administrator.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 3/2/2560.
 */

public class InsulinDatabase extends RealmObject {
    @PrimaryKey
    String id;


    String nameinsulin6;
    String sizeinsulin6;

    public String getNameinsulin6() {
        return nameinsulin6;
    }

    public void setNameinsulin6(String nameinsulin6) {
        this.nameinsulin6 = nameinsulin6;
    }

    public String getSizeinsulin6() {
        return sizeinsulin6;
    }

    public void setSizeinsulin6(String sizeinsulin6) {
        this.sizeinsulin6 = sizeinsulin6;
    }

    public int getCarb6() {
        return carb6;
    }

    public void setCarb6(int carb6) {
        this.carb6 = carb6;
    }

    int carb6;

    String nameinsulin3;

    public String getNameinsulin3() {
        return nameinsulin3;
    }

    public void setNameinsulin3(String nameinsulin3) {
        this.nameinsulin3 = nameinsulin3;
    }

    public String getSizeinsulin3() {
        return sizeinsulin3;
    }

    public void setSizeinsulin3(String sizeinsulin3) {
        this.sizeinsulin3 = sizeinsulin3;
    }

    public int getCarb3() {
        return carb3;
    }

    public void setCarb3(int carb3) {
        this.carb3 = carb3;
    }

    String sizeinsulin3;
    int carb3;
    String nameinsulin4;
    String sizeinsulin4;
    String nameinsulin5;
    String nameinsulinbase1;
    String sizeinsulinbase1;
    String sizeinsulinbase2;

    public String getNameinsulinbase1() {
        return nameinsulinbase1;
    }

    public void setNameinsulinbase1(String nameinsulinbase1) {
        this.nameinsulinbase1 = nameinsulinbase1;
    }

    public String getSizeinsulinbase1() {
        return sizeinsulinbase1;
    }

    public void setSizeinsulinbase1(String sizeinsulinbase1) {
        this.sizeinsulinbase1 = sizeinsulinbase1;
    }

    public String getSizeinsulinbase2() {
        return sizeinsulinbase2;
    }

    public void setSizeinsulinbase2(String sizeinsulinbase2) {
        this.sizeinsulinbase2 = sizeinsulinbase2;
    }

    public String getMorningtime1() {
        return morningtime1;
    }

    public void setMorningtime1(String morningtime1) {
        this.morningtime1 = morningtime1;
    }

    public String getAftersleeptime1() {
        return aftersleeptime1;
    }

    public void setAftersleeptime1(String aftersleeptime1) {
        this.aftersleeptime1 = aftersleeptime1;
    }

    String morningtime1;
    String aftersleeptime1;

    public String getSizeinsulin5() {
        return sizeinsulin5;
    }

    public void setSizeinsulin5(String sizeinsulin5) {
        this.sizeinsulin5 = sizeinsulin5;
    }

    String sizeinsulin5;

    public String getNameinsulin5() {
        return nameinsulin5;
    }

    public void setNameinsulin5(String nameinsulin5) {
        this.nameinsulin5 = nameinsulin5;
    }

    public int getCarb5() {
        return carb5;
    }

    public void setCarb5(int carb5) {
        this.carb5 = carb5;
    }

    int carb5;

    public String getNameinsulin4() {
        return nameinsulin4;
    }

    public void setNameinsulin4(String nameinsulin4) {
        this.nameinsulin4 = nameinsulin4;
    }

    public String getSizeinsulin4() {
        return sizeinsulin4;
    }

    public void setSizeinsulin4(String sizeinsulin4) {
        this.sizeinsulin4 = sizeinsulin4;
    }

    public int getCarb4() {
        return carb4;
    }

    public void setCarb4(int carb4) {
        this.carb4 = carb4;
    }

    int carb4;
    String nameinsulin;


    public String getNameinsulin2() {
        return nameinsulin2;
    }

    public void setNameinsulin2(String nameinsulin2) {
        this.nameinsulin2 = nameinsulin2;
    }

    public String getSizeinsulin2() {
        return sizeinsulin2;
    }

    public void setSizeinsulin2(String sizeinsulin2) {
        this.sizeinsulin2 = sizeinsulin2;
    }

    public int getCarb2() {
        return carb2;
    }

    public void setCarb2(int carb2) {
        this.carb2 = carb2;
    }

    String nameinsulin2;
    String sizeinsulin2;
    int carb2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    String sizeinsulin;

    public String getNameinsulin() {
        return nameinsulin;
    }

    public void setNameinsulin(String nameinsulin) {
        this.nameinsulin = nameinsulin;
    }

    public String getSizeinsulin() {
        return sizeinsulin;
    }

    public void setSizeinsulin(String sizeinsulin) {
        this.sizeinsulin = sizeinsulin;
    }

    public int getCarb() {
        return carb;
    }

    public void setCarb(int carb) {
        this.carb = carb;
    }

    int carb;
}
