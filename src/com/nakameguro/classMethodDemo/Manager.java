package com.nakameguro.classMethodDemo;

public class Manager {
    private String name;
    private int id;
    private int salary;
    private int bonus;

    public Manager(String name, int id, int salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public Manager() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    void work(){
        System.out.println("社員番号："+id+"給料："+salary+"円"+"賞与"+bonus+"円"+"のプロジェクトマネージャー"+name+"が働いています");
    }
}

