package com.example.administrator.myapplication;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.View;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmMigrationNeededException;

/**
 * Created by Administrator on 2/2/2560.
 */

public class DatabaseManager {
    RealmConfiguration realmConfiguration;

    public DatabaseManager(Context context) {
        Realm.init(context);
        realmConfiguration = new RealmConfiguration.Builder().build();

    }

    private Realm getRealm() {
        try {
            return Realm.getInstance(realmConfiguration);
        } catch (RealmMigrationNeededException e) {
            Realm.deleteRealm(realmConfiguration);
            return Realm.getInstance(realmConfiguration);
        }
    }

    public void storePerson(Person person) {
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(person);
        realm.commitTransaction();
        realm.close();
    }

    public Person getPerson() {
        Person person = null;
        Realm realm = getRealm();
        realm.beginTransaction();
        Person realmPerson = realm.where(Person.class).findFirst();
        if (realmPerson != null){
            person = realm.copyFromRealm(realmPerson);
        }
        realm.commitTransaction();
        realm.close();
        return person;
    }

    public void storeInsulin(InsulinDatabase insulinDatabase){
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(insulinDatabase);
        realm.commitTransaction();
        realm.close();
    }
    public InsulinDatabase getInsulinDatabase() {
        InsulinDatabase insulinDatabase = null;
        Realm realm = getRealm();
        realm.beginTransaction();
        InsulinDatabase realmInsulin = realm.where(InsulinDatabase.class).findFirst();
        if (realmInsulin != null){
            insulinDatabase = realm.copyFromRealm(realmInsulin);
        }
        realm.commitTransaction();
        realm.close();
        return insulinDatabase;
    }

    public void storeCalshot(CalShot calShot){
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(calShot);
        realm.commitTransaction();
        realm.close();
    }
    public CalShot getCalShot() {
        CalShot calShot = null;
        Realm realm = getRealm();
        realm.beginTransaction();
        CalShot realmCalshot = realm.where(CalShot.class).findFirst();
        if (realmCalshot != null){
            calShot = realm.copyFromRealm(realmCalshot);
        }
        realm.commitTransaction();
        realm.close();
        return calShot;
    }
    public void storeCalshot2(CalShot2 calShot2){
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(calShot2);
        realm.commitTransaction();
        realm.close();
    }
    public CalShot2 getCalShot2() {
        CalShot2 calShot2 = null;
        Realm realm = getRealm();
        realm.beginTransaction();
        CalShot2 realmCalshot2 = realm.where(CalShot2.class).findFirst();
        if (realmCalshot2 != null){
            calShot2 = realm.copyFromRealm(realmCalshot2);
        }
        realm.commitTransaction();
        realm.close();
        return calShot2;
    }
    public void storeCalshot3(CalShot3 calShot3){
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(calShot3);
        realm.commitTransaction();
        realm.close();
    }
    public CalShot3 getCalShot3() {
        CalShot3 calShot3 = null;
        Realm realm = getRealm();
        realm.beginTransaction();
        CalShot3 realmCalshot3 = realm.where(CalShot3.class).findFirst();
        if (realmCalshot3 != null){
            calShot3 = realm.copyFromRealm(realmCalshot3);
        }
        realm.commitTransaction();
        realm.close();
        return calShot3;
    }
    public void storeEtc(Etc etc){
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(etc);
        realm.commitTransaction();
        realm.close();
    }
    public Etc getEtc() {
        Etc etc = null;
        Realm realm = getRealm();
        realm.beginTransaction();
        Etc realmEtc = realm.where(Etc.class).findFirst();
        if (realmEtc != null){
            etc = realm.copyFromRealm(realmEtc);
        }
        realm.commitTransaction();
        realm.close();
        return etc;
    }
    public void storeNamefood2(Namefood2 namefood2){
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(namefood2);
        realm.commitTransaction();
        realm.close();
    }
    public Namefood2 getNamefood2() {
        Namefood2 namefood2 = null;
        Realm realm = getRealm();
        realm.beginTransaction();
        Namefood2 realmNamefood2 = realm.where(Namefood2.class).findFirst();
        if (realmNamefood2 != null){
            namefood2 = realm.copyFromRealm(realmNamefood2);
        }
        realm.commitTransaction();
        realm.close();
        return namefood2;
    }
    public void storeNamefood3(Namefood3 namefood3){
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(namefood3);
        realm.commitTransaction();
        realm.close();
    }
    public Namefood3 getNamefood3() {
        Namefood3 namefood3 = null;
        Realm realm = getRealm();
        realm.beginTransaction();
        Namefood3 realmNamefood3 = realm.where(Namefood3.class).findFirst();
        if (realmNamefood3 != null){
            namefood3 = realm.copyFromRealm(realmNamefood3);
        }
        realm.commitTransaction();
        realm.close();
        return namefood3;
    }


}
