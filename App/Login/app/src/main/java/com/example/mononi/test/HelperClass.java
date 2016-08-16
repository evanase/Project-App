package com.example.mononi.test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Evanase on 7/14/2016.
 */
public class HelperClass extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "data.db";
    private static final int DATABASE_VERSION = 1;
    private Context myContext;

    public HelperClass(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.myContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQLText = "CREATE TABLE student(" +
                "stu_id TEXT PRIMARY KEY," +
                "stu_pass INTEGER," +
                "stu_date DATE," +
                "stu_name TEXT," +
                "stu_age INTEGER," +
                "stu_depart TEXT," +
                "stu_tier TEXT," +
                "stu_aca TEXT );";
        db.execSQL(SQLText);

        SQLText = "CREATE TABLE techer(" +
                "tec_id TEXT PRIMARY KEY," +
                "tec_pass INTEGER," +
                "tec_date DATE," +
                "tec_name TEXT," +
                "tec_age INTEGER," +
                "tec_depart TEXT," +
                "tec_target TEXT," +
                "tec_aca TEXT );";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO student (stu_id, stu_pass, stu_date, stu_name, stu_age, stu_depart, stu_tier, stu_aca)" +
                "VALUES('1', '5839010039', '19/12/2539', 'ศุภการณ์ สมนึก', 20, 'IT', 'ปวส.2', 'วิทยาลัยเทคนิคเชียงใหม่');";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO techer (stu_id, stu_pass, stu_date, stu_name, stu_age, stu_depart, stu_target, stu_aca)" +
                "VALUES('1', '4639010039', '20/10/2546', 'เซ็นเซย์ ซามะ', 30, 'IT', 'ครูประจำวิชา', 'วิทยาลัยเทคนิคเชียงใหม่');";
        db.execSQL(SQLText);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int olderVersion, int newVersion){
        String sqlText = "DROP TABLE IF EXISTS student;";
        db.execSQL(sqlText);

        sqlText = "DROP TABLE IF EXISTS techer;";
        db.execSQL(sqlText);

        onCreate(db);
    }
}
