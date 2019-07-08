package com.jubayir;

public class StartUp {
    
    public static void main(String[] args) {
//        AndroidDev dev = new AndroidDev();
//        System.out.println("Salary " + dev.getSalary());
        
//        WebDev webDev = new WebDev();
//        System.out.println("WebDev_Salary: " + webDev.getSalary());
        
//        Developer developer = new AndroidDev();
//        System.out.println("Developer Salary : " + developer.getSalary());
        
        Developer developer = new AndroidDev(); // Reference of AndroidDev 
        AndroidDev ad =(AndroidDev)developer;
    }
    
}
