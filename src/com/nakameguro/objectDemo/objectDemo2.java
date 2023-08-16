package com.nakameguro.objectDemo;

public class objectDemo2 {
    public static void main(String[] args) {
        System.out.println("質数は"+zhisu()+"個");
    }
    public static int zhisu(){
        int count = 0;
        for (int i = 101; i <200 ; i++) {
            boolean flag = true;
            for (int j = 2; j <i ; j++) {
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("質数："+ i);
                count++;
            }
        }
        return count;
    }
}
