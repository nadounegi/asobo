package com.nakameguro.listDemo;

public class listDemo7 {
    public static void main(String[] args) {
        int [] arr = {25,43,21,16,76};
        int [] arr2 = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                arr2[right] =arr[i];
                right --;
            }else {
                arr2[left] = arr[i];
                left++;
            }
        }
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
