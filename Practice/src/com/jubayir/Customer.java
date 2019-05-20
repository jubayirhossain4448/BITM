package com.jubayir;

public class Customer {

    String customerName;
    String customerEmail;
    int customerPhone;

//    public void display() {
//        
//        customerName = "Md. Jubayir Hossain";
//        customerEmail = "jubayir@gmail.com";
//        customerPhone = 200;
//    }

    public Customer() {
    }
    
    public Customer(String customerName, String customerEmail, int customerPhone) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

}
