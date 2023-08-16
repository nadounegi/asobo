package com.nakameguro.methodDemo;

import java.util.Arrays;

public class methodDemo7 {
    public static void main(String[] args) {
        int[]arr = {2,3,7,9};
        int value = 5;
        System.out.println("オリジナル："+ Arrays.toString(arr));
        fill(arr,value);
        System.out.println("アフターフィリン；"+ Arrays.toString(arr));
    }

    public static void fill(int[]arr,int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }

}
