package com.example.bitm_project_01dailyexpensenote;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ExpenseDataOpenHelper extends SQLiteOpenHelper {


    public static String DATABASE_NAME = "Expense.db";
    public static String TABLE_NAME = "Expense";
    public static String COL_ID = "Id";
    public static String COL_Type = "Type";
    public static String COL_AMOUNT = "Amount";
    public static String COL_DATE = "Date";
    public static String COL_TIME = "Time";
    public String CREATE_TABLE = "create table Expense(Id integer primary key, Type text, Amount int, Date text, Time text)";
    public static int VERSION = 1;


    public ExpenseDataOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


    public long insertExpenseData(String type, int amount, String date, String time) {

        ContentValues contV = new ContentValues();
        contV.put(COL_Type, type);
        contV.put(COL_AMOUNT, amount);
        contV.put(COL_DATE, date);
        contV.put(COL_TIME, time);
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        long id = sqLiteDatabase.insert(TABLE_NAME, null, contV);
        sqLiteDatabase.close();
        return id;

    }
    public Cursor showExpenseData(){

        String show_all = "select * from " + TABLE_NAME;

        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(show_all,null);
        return cursor;
    }

}
