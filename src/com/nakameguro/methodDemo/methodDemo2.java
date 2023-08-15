package com.nakameguro.methodDemo;

public class methodDemo2 {
    public static void main(String[] args) {
        int max = getMax(3, 15, 8);
        System.out.println("最大値："+ max);
    }

    public static int getMax(int a,int b,int c){
        int temp = 0;
        int max = 0;
        if(a>b){
             temp = a;
        }else{
            temp = b;
        }
        if(temp>c){
            max = temp;
        }else {
            max = c;
        }
        return max;
    }
}
