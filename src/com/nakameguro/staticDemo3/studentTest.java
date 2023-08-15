package com.nakameguro.staticDemo3;

import java.util.ArrayList;

public class studentTest {
    public static void main(String[] args) {
        //１、集合を作成
        ArrayList<student> list = new ArrayList<>();
        //２、3つ学生インスタンス生成
        student stu1 = new student("ゲゲゲの鬼太郎",500,"男");
        student stu2 = new student("犬夜叉",700,"男");
        student stu3 = new student("伊之助",18,"男");

        //３、学生対象を集合に格納
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //４、ツールメソッド　最大値求めメソッドを呼び出す
        int  maxAge = studentUtil.getMaxAgeStudent(list);
        System.out.println(maxAge);
    }
}
