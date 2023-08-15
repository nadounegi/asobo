package com.nakameguro.methodDemo;

import java.util.Scanner;

public class methodDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一目整数を入力してください");
        int num1 = sc.nextInt();
        System.out.println("第二目整数を入力してください");
        int num2 = sc.nextInt();
        System.out.println("第三目整数を入力してください");
        int num3 = sc.nextInt();

        int max = getMax(num1, num2, num3);
        int min = getMin(num1, num2, num3);
        int mid = (num1 + num2 + num3) - max - min;

        System.out.println(max + " "+mid + " "+min + " ");
    }
    public static int getMax(int a,int b,int c){
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }
    public static int getMin(int a,int b,int c){
        int temp = a < b ? a : b;
        int min = temp < c ? temp : c;
        return min;
    }
}
