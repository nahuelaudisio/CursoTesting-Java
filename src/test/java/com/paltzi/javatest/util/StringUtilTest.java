package com.paltzi.javatest.util;



public class StringUtilTest {
    public static void main(String[] args) {

        String result = StringUtil.repeat("hola",3);
        if (result.equals("holaholahola")){
            System.out.println("OK");
        }

        String result2 = StringUtil.repeat("hola",1);
        if (result2.equals("hola")){
            System.out.println("OK");
        }

    }
}