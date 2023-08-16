package com.nakameguro.methodDemo;

import java.util.Scanner;

public class methodDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("整数を入力してください");
        int a = sc.nextInt();
        System.out.println(a+"は"+getlength(a)+"桁数");
    }
    public static int getlength(int a){
        int count = 0;
        while (a != 0){
            a = a / 10;
            count++;
        }
        return count;
    }

}
