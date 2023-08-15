package com.nakameguro.staticDemo1;

public class Student {
    //１、属性　名前　年齢　性別
    //２、新増　先生の名前
    private  String name;
    public static String teacherName;
    private int age;
    private  String gender;

    public Student() {
    }
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public  void study(){
        System.out.println(name+"勉強中");
    }

    public void show(){
        System.out.println(name+","+age+","+gender+","+teacherName);
    }
    public static void main(String[] args) {
        //１、学生インスタンス１生成
        Student.teacherName ="直己先生";
        Student s1 = new Student();
        s1.setName("青山陸");
        s1.setAge(28);
        s1.setGender("男");
//        s1.teacherName ="直己先生";

        s1.study();
        s1.show();
        //２、学生インスタンス２生成
        Student s2 = new Student();
        s2.setName("吉野北人");
        s2.setAge(26);
        s2.setGender("男");

        s2.study();
        s2.show();
    }
}
