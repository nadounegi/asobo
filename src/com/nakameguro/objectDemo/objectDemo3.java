package com.nakameguro.objectDemo;

import java.util.Random;

public class objectDemo3 {
    public static void main(String[] args) {
        //１、大字母と小字母
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //小字母
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else {
                chs[i]=(char)(65 + i -26);
            }
        }
            //最終結果を格納ための変量
            String result = "";
            //２、四つ乱数を生成
            Random r = new Random();
            for (int j = 0; j < 4; j++) {
                // 乱数インデックスを利用して要素をゲット
                int randomIndex = r.nextInt(chs.length);
                result = result + chs[randomIndex];
            }
            //0~9乱数をゲット
            int num = r.nextInt(10);
            result = result + num;

            System.out.println(result);

    }
}
