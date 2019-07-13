package com.example.bitm_project_01dailyexpensenote;

public class Expense  {
    private int id;
    private String expenseName;
    private int expenseAmount;
    private String date;
    private String time;

    public Expense(int id, String expenseName, int expenseAmount, String date, String time) {
        this.id = id;
        this.expenseName = expenseName;
        this.expenseAmount = expenseAmount;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public int getExpenseAmount() {
        return expenseAmount;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
