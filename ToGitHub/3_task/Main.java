package com.company;

import java.util.Scanner;

public class Main {

    public static int Func(int a, int b){
        int sum = 0;
        int res = 0;
        for(int i = 0; i < b; i++){
            sum += a;
            res += sum;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(Func(a, b));
    }
}