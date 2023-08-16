package com.nakameguro.objectDemo;

import java.util.Scanner;

public class objectDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("搭乗券の金額を入力してください");
        int ticket = sc.nextInt();
        System.out.println("月を入力してください");
        int month = sc.nextInt();
        System.out.println("席種類を選んでください。０：ファストクラス、１：エコノミークラス");
        int seat = sc.nextInt();

        if(month >= 5 &&month<=10){
           ticket = getTIcket(ticket, seat, 0.9, 0.85);
        }else if((month >= 1 && month <= 4) || (month >= 11 && month <= 12)){
            ticket = getTIcket(ticket,seat,0.7,0.65);
        }else{
            System.out.println("月が間違いだ");
        }
        System.out.println("搭乗券の金額："+ticket+"円");
    }
    public static int getTIcket(int ticket,int seat,double d1,double d2){
        if(seat == 0){
            ticket = (int)(ticket*d1);
        }else if(seat == 1){
            ticket =  (int)(ticket*d2);
        }else{
            System.out.println("この席種類が不存在");
        }
        return ticket;
    }
}
