package com.jubayir;

import android.graphics.Bitmap;

public class Expense {
    private int amount, id;
    private String type, date, time;
    private Bitmap imageDocument;

    public Expense(int amount, int id, String type, String date, String time, Bitmap imageDocument) {
        this.amount = amount;
        this.id = id;
        this.type = type;
        this.date = date;
        this.time = time;
        this.imageDocument = imageDocument;
    }

    public int getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public Bitmap getImageDocument() {
        return imageDocument;
    }
}
