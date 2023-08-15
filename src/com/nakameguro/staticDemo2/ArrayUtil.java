package com.nakameguro.staticDemo2;

public class ArrayUtil {
    //静的コンストラクタ
    //目的：インスタンス生成を禁止する
    private  ArrayUtil(){}
    //静的コンストラクタを定義　呼び出すため
    public static String printArr(int [] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        return  sum/ arr.length;
    }

    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5,6};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double [] arr2 = {3.5,7.9,8.4,3.2,9.8};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
