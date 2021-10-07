package com.company;

import java.util.Scanner;

public class Main {

    public static int Func(int sum, int a){
        sum += a;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        int res = 0;
        for(int i = 0; i < b; i++){
            sum = Func(sum, a);
            res += sum;
        }
        System.out.println(res);
    }
}