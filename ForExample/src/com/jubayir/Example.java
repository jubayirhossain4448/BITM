package com.jubayir;

import java.util.ArrayList;

public class Example {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("vimal");
        list.add("sonoo");
        list.add("ratan");

        for (String s : list) {
            System.out.println(s);
        }

    }

}
