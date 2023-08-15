package com.nakameguro.methodDemo;

import java.util.Scanner;

public class methodDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("小数を入力してください");
        double num = sc.nextDouble();
        double abs = getAbs(num);

        System.out.println("絶対値:"+ abs);
    }
    public static double getAbs(double a){
        double abs = 0;
        if(a<0){
            abs = -a;
        }else{
            abs =  a;
        }
        return  abs;
    }
}
