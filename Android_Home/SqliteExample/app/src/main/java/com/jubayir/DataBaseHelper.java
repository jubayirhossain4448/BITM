package com.jubayir;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper { // database er name, field er name and version er name er jonno ei khane field gulo nite hobe

    private static String DATABASE_NAME = "User.db";
    private static String TABLE_NAME = "User";
    private static  String COL_ID = "Id";
    private static  String COL_NAME = "Name";
    private static  String COL_AGE = "Age";
    private static String CREATE = "Create table "+TABLE_NAME+" (Id INTEGER PRIMARY KEY, NAME TEXT, AGE TEXT)"; // Table make korar jonno query likte hobe
    private static int VERSION = 1;


    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION); // CONTEXT ER PORER TA DATABASE ER NAME HOBE
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) { // Table create korte hobe here
        sqLiteDatabase.execSQL(CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
