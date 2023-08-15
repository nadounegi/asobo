package com.nakameguro.listDemo;

public class listDemo5 {
    public static void main(String[] args) {
        int [] arr = {72,89,65,87,91,82,71,93,76,68};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        int ave = sum / arr.length;
        System.out.println("合計：" + sum);
        System.out.println("平均：" + ave);
    }
}
