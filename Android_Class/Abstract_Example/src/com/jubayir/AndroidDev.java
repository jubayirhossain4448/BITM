package com.jubayir;

public class AndroidDev extends Developer{
    public int salary = 40000;
    public int bonus = 1500;
    

    @Override
    public int getSalary() {
        return salary + bonus;
    }
    
    
}
