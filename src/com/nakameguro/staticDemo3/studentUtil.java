package com.nakameguro.staticDemo3;

import java.util.ArrayList;

public class studentUtil {
    private studentUtil(){}

    public static int getMaxAgeStudent(ArrayList<student>list){
        int max = list.get(0).getAge();
        //集合を巡る
        for (int i = 1; i <list.size() ; i++) {
            //maxとgetAgeでもらった年齢と比較
            int tempAge = list.get(i) .getAge();
            if(list.get(i) .getAge() > max){
                max = tempAge;
            }
        }
        return max;
    }

}
