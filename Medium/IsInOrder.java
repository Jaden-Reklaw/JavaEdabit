/*
Is the String in Order?
Create a function that takes a string and returns true or false, depending on whether the characters are in order or not.

Examples
isInOrder("abc") ➞ true

isInOrder("edabit") ➞ false

isInOrder("123") ➞ true

isInOrder("xyzz") ➞ true
Notes
You don't have to handle empty strings.
*/

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isInOrder("123"));
    }

    public static boolean isInOrder(String str){
        // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        //Sort the char array
        Arrays.sort(ch);

        //Change Char Array into String
        String answer = new String(ch);
        return str.equals(answer);
    }

    //Other solution
    public static boolean isInOrder(String str) {
        //split method separates string into an arr of String
        String[] strArr = str.split("");
        //Arrays.sort will sort an array you give it
        Arrays.sort(strArr);
        //String.join will join the string array into single string
        return String.join("", strArr).equals(str);
    }
}
