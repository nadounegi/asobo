package com.nakameguro.op_extendsDemo1;

public class AnimalsTest {
    public static void main(String[] args) {
        //インスタンス生成
        //１、ラグドール対象を作成
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drinkWater();
        rd.catchMouse();

        System.out.println("------------------------------------------------");
        //２、ハスキー対象を作成
        Husky h = new Husky();
        h.eat();
        h.drinkWater();
        h.homeGuard();
        h.destroyHome();
    }
}
