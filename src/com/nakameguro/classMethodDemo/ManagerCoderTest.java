package com.nakameguro.classMethodDemo;

public class ManagerCoderTest {
    public static void main(String[] args) {
        Manager m = new Manager("バチェー田",1,230000,100000);
        m.work();

        coder c = new coder("有吉弘行",2,300000,150000);
        c.work();

    }
}
