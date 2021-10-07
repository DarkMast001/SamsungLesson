package com.company;

import java.util.Scanner;

public class Main {

    public static int maxVal(int a, int b, int c){
        if(a > b && a > c) return a;
        else if(b > a && b > c) return b;
        else if(c > a && c > b) return c;
        else return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(maxVal(a, b, c));
    }
}