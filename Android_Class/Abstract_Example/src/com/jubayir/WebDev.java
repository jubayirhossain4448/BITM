package com.jubayir;

public class WebDev extends Developer{
    public int salary = 35000;
    public int extra = 500;

    @Override
    public int getSalary() {
        return salary + extra;
    }
    
    
}
