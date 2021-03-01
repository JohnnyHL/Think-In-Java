package com.hl.magic.dp.policy.demo03;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("外观：诱饵鸭");
    }

    @Override
    public void quack() {
        //不会叫
    }

    @Override
    public void fly() {
        //不会飞
    }
}
