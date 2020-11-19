/*
Histogram Function
Write a function that creates histograms. Every bar needs to be on a new line and its length corresponds to the numbers in the array passed as an argument. The second argument represents the symbol to be used to represent the bar.

Examples
histogram([1, 3, 4], "#") ➞ "#\n###\n####"

#
###
####

histogram([6, 2, 15, 3], "=") ➞ "======\n==\n===============\n==="

======
==
===============
===

histogram([1, 10], "+") ➞ "+\n++++++++++"

+
++++++++++
Notes
For better understanding try printing out the result.
*/

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(histogram(new int[]{1, 3, 4}, "#"));
        System.out.println("Is there space");
    }

    public static String histogram(int[] arr, String chr) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer.append(chr);
            }
            if(i != arr.length -1) {
                answer.append("\n");
            }
        }
        return answer.toString();
    }

    public static String histogram(int[] r, String c) {
		return IntStream.of(r).mapToObj(n -> new String(new char[n])
			.replace("\0", c) + (n == r[r.length-1] ? "" : "\n")).reduce(String::concat).get();
	}
}