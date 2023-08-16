package com.nakameguro.methodDemo;

public class methodDemo6 {
    public static void main(String[] args) {
        int [] arr1 = {2,5,8,9,10};
        int [] arr2 = {2,5,8,9,10};
        int [] arr3 = {2,5,8,9,10,11};

        System.out.println("arr1 equals arr2:"+" "+equals(arr1,arr2));
        System.out.println("arr1 equals arr3:"+" "+equals(arr1,arr3));

    }
    public static boolean equals(int[]arr1,int[]arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr2.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
