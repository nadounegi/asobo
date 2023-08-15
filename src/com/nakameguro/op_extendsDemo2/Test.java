package com.nakameguro.op_extendsDemo2;

public class Test {
    public static void main(String[] args) {
        //引数なしコンストラクタを利用して息子インスタンス生成
        Zi z1 = new Zi();
        //引数ありコンストラクタを利用して息子インスタンス生成
        Zi z2 = new Zi("zhangsan",32);
    }
}
    class Fu{
        String  name;
        int age;

        public Fu(){}
        public Fu(String name,int age){
            this.name = name;
            this.age = age;
        }
    }
    class Zi extends Fu{
//息子クラスは親父クラスのコンストラクタを継承できない
        public Zi(String zhangsan, int i) {
        }

        public Zi() {

        }
    }
