package com.nakameguro.methodDemo;

public class methodDemo1 {
    public static void main(String[] args) {
        double a = 5.64;
        double b = 2.32;
        System.out.println("最小値：" + getMin(a,b));
    }
    public static double getMin(double a,double b){
        double min = a;
        if(a<b){
            min = a;
        }else{
            min = b;
        }
        return min;
    }
}
