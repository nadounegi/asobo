package com.nakameguro.classMethodDemo;

public class girlFriend {
    private String name;
    private double height;
    private double weight;

    public girlFriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public girlFriend() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    void washCloth(){
        System.out.println(name+"帮我洗衣服");
    }
    void cooking(){
        System.out.println(name +"在做饭");
    }
    void show(){
        System.out.println("私の彼女は"+name+",身長"+height+"cm,体重"+weight+"kg");
    }
    public static void main(String[] args) {
        girlFriend gf = new girlFriend();
        gf.setName("天海祐希");
        gf.setHeight(171);
        gf.setWeight(55);

        gf.show();
        gf.washCloth();
        gf.cooking();
    }
}
