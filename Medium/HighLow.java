package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
        System.out.println(highLow("1 2 3 4 5"));
    }

    public static String highLow(String str) {
        //create variables for high and low
        int high;
        int low;

        //split method separates string into an arr of String
        String[] strArr = str.split(" ");

        //Assign High Low to vars
        high = Integer.parseInt(strArr[0]);
        low = Integer.parseInt(strArr[0]);

        //Start at next number and compare for high or low
        for(int i=1; i < strArr.length; i++) {
            if(Integer.parseInt(strArr[i]) > high) {
                high = Integer.parseInt(strArr[i]);
            } else if(Integer.parseInt(strArr[i]) < low) {
                low = Integer.parseInt(strArr[i]);
            }
        }

        //return String of high and low
        return high + " " + low;
    }
}

