/*
Return the Highest and Lowest Numbers
Create a method that accepts a string of space separated numbers and returns the highest and lowest number (as a string).

Examples
highLow("1 2 3 4 5") ➞ "5 1"

highLow("1 2 -3 4 5") ➞ "5 -3"

highLow("1 9 3 4 -5") ➞ "9 -5"

highLow("13") ➞ "13 13"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
*/
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

    //Other solution
    public static String highLow(String s) {
        String[] tableString = s.split(" ");
          int[] tableInteger = new int[tableString.length];
          for(int i =0; i < tableString.length; i++){
              tableInteger[i]= Integer.valueOf(tableString[i]);
          }
          //Uses streams to use max an min function with get as int to convert string to int
          int max = Arrays.stream(tableInteger).max().getAsInt();
          int min = Arrays.stream(tableInteger).min().getAsInt();
          return max+" " + min;
      }
}

