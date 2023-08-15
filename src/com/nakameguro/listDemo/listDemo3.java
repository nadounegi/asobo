package com.nakameguro.listDemo;

import java.util.Random;

public class listDemo3 {
    public static void main(String[] args) {
        //乱数をインポート
        Random r = new Random();
        //長さ６のリストを作成
        int[]arr = new int[6];
        //リストを巡る
        for (int i = 0; i < arr.length ; i++) {
            //範囲０～１００の乱数をリストに格納
            int num = r.nextInt(100);
            arr[i] = num;
            System.out.print(arr[i] +" ");
        }
        System.out.println("\n");
        //合計の初期化
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum+= arr[i];
        }
        System.out.println("合計は"+sum);
    }
}
