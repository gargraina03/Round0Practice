package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
	nextSmallestPalindrome nsp = new nextSmallestPalindrome();
	long num = scn.nextLong();
	nsp.NSP(num);
    }
}
