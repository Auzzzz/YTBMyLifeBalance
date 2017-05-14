package com.inducesmile.androidmultiquiz.database;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class Database extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "quiz";
    private static final int DATABASE_VERSION = 1;



    public Database(Context context) {
        
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
