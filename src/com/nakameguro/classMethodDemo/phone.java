package com.nakameguro.classMethodDemo;

public class phone {
    private String brand;
    private int price;
    private String color;

    public phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void call() {
        System.out.println("正在使用"+"价格为" + price + "円"+color+"的"+brand+"的手机打电话");
    }
    void sendMessage(){
        System.out.println("正在使用"+"价格为" + price + "円"+color+"的"+brand+"的手机发短信");
    }

        public static void main(String[] args) {
            phone p = new phone();
            p.setBrand("アップル");
            p.setColor("水色");
            p.setPrice(15000);

            p.call();
            p.sendMessage();
        }
    }
