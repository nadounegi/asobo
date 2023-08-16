package com.nakameguro.StringDemo;

import java.util.Random;
import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //１、キーボードから字符串を入力
        Scanner sc = new Scanner(System.in);
        System.out.println("字符串を入力してください");
        String str = sc.next();
        char[] arr = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i <arr.length ; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        String newStr = new String(arr);
        System.out.println(newStr);

    }
}
