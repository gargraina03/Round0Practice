package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
	nextSmallestPalindrome nsp = new nextSmallestPalindrome();
	long num = scn.nextLong();
	nsp.NSP(num);
    }
	
	public static long nextPalindrome(long origNum) {
        return nextPalindrome(origNum, origNum); // we pass 2 copies of the number so we can use one for comparison
                                                 // and one for changing, during recursive calls
    }

    private static long nextPalindrome(long origNum, long origNumCopy) {
        int numLength = (int) (Math.log10(origNumCopy) + 1); // find the length of the number
        String numberString = String.valueOf(origNumCopy);   // convert it to a String
        String halfString, oddMid = "";                      // we will store the middle digit in oddMid if it is of odd length

        if (numLength % 2 == 1) { // if its of odd length, store middle digit in oddMid
            oddMid = numberString.substring(numLength/2, numLength/2 + 1);
        }
        // take the first half and reverse and add it to the number
        halfString = numberString.substring(0, numLength/2);
        halfString = halfString + oddMid + strRev(halfString);

        // convert back to Long and check if it is bigger than original number
        long num2Check = Long.parseLong(halfString);
        if (num2Check > origNum) {
            return num2Check;  // if it is, return it
        } else { // else generate the next palindrome number using recursion
            long increment = (long) Math.pow(10.0, (int)(numLength/2));
            return nextPalindrome(origNum, origNum + increment);
        }
    }

    // basic function to reverse a String
    private static String strRev(String str) {
        StringBuilder rev = new StringBuilder(str);
        return rev.reverse().toString();
    }
}
