package com.jubayir;

import java.util.ArrayList;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        List<Object> stu = new ArrayList();

        stu.add("Md. Jubayir Hossain");
        stu.add("Dhaka College");
        stu.add("Mohammadpur");
        stu.add("Magura");
        stu.remove(3);
        

//        System.out.println("Array List: " + stu);
        for(Object i : stu){
            System.out.println("Array List for each: " + i);
        }
    }

}
