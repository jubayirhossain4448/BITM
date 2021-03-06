package tania.com.sqlitedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    private static String DATABASE_NAME = "User.db";  // database er name create korte hobe
    private static String TABLE_NAME = "User";
    private static String COL_ID = "Id";
    private static String COL_NAME = "Name";
    private static String COL_AGE = "Age";
    private static String CREATE = "Create table " + TABLE_NAME + " (Id INTEGER PRIMARY kEY, NAME_TEXT, AGE_TEXT)";
    private static int VERSION = 1;

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public long insertData(String name, String age){

        ContentValues values = new ContentValues();
        values.put(COL_NAME, name);
        values.put(COL_AGE, age);
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        long id = sqLiteDatabase.insert(TABLE_NAME, null, values);
        sqLiteDatabase.close();
        return id;
    }
}
