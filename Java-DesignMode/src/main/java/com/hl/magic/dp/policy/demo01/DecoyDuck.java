package com.hl.magic.dp.policy.demo01;

/**
 * 又增加了一个子类鸭子
 */
public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("外观：诱饵鸭");
    }

    @Override
    public void quack() {
        //不会叫
    }
}
