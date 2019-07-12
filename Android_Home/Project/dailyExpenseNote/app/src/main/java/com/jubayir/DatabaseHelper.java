package com.jubayir;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static String DB_NAME = "Expenses.db";
    private static String TABLE_NAME = "Expense";

    public static String COL_TYPE = "Type";
    public static String COL_Amount = "Amount";
    public static String COL_Date = "Date";
    public static String COL_TIME = "Time";
    public static String COL_Document = "Document";
    public static String COL_ID = "Id";

    private String DROAP_TABLE = "drop table if exists " + TABLE_NAME;
    private static String CREATE_TABLE = "create table " + TABLE_NAME + "( Id INTEGER primary key AUTOINCREMENT ,Type TEXT,Amount INTEGER,Date INTEGER,Time TEXT,Document TEXT)";
    private static int VERSION = 7;
    private Context context;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        try {
            db.execSQL(DROAP_TABLE);
            onCreate(db);
        } catch (Exception e) {
            Toast.makeText(context, "exception : " + e, Toast.LENGTH_SHORT).show();
        }

    }

    // To insert Data into the field we need to take this method
    public long insertData(String type, int amount, long date, String time, String document) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_TYPE, type);
        contentValues.put(COL_Amount, amount);
        contentValues.put(COL_Date, date);
        contentValues.put(COL_TIME, time);
        contentValues.put(COL_Document, document);
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        long id = sqLiteDatabase.insert(TABLE_NAME, null, contentValues);
        sqLiteDatabase.close();
        return id;

    }

    //long fromDate,long toDate,String type
    public Cursor showAllData() {
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select * from " + TABLE_NAME, null);
        return cursor;
    }

    //delete
    public void deleteData(int id) {
        getWritableDatabase().delete(TABLE_NAME, "Id=?", new String[]{String.valueOf(id)});
    }

    //update

    public void update(String id, String type, int amount, long date, String time, String document) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_TYPE, type);
        contentValues.put(COL_Amount, amount);
        contentValues.put(COL_Date, date);
        contentValues.put(COL_TIME, time);
        contentValues.put(COL_Document, document);
        sqLiteDatabase.update(TABLE_NAME, contentValues, "Id=?", new String[]{id});


    }
}
