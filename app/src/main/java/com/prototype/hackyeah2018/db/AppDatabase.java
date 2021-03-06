package com.prototype.hackyeah2018.db;

import com.prototype.hackyeah2018.dao.MedicineDao;
import com.prototype.hackyeah2018.dao.PharmacyDao;
import com.prototype.hackyeah2018.dao.PharmacyWithMedicinesDao;
import com.prototype.hackyeah2018.model.Medicine;
import com.prototype.hackyeah2018.model.Pharmacy;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {
        Pharmacy.class,
        Medicine.class,
},
        version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public static final String DATABASE_NAME = "APP";

    public abstract PharmacyDao getPharmacyDao();

    public abstract MedicineDao getMedicineDao();

    public abstract PharmacyWithMedicinesDao getPharmacyWithMedicinesDao();

    public static AppDatabase getInstance(final Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, DATABASE_NAME).build();
    }
}
