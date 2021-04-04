package com.hl.magic.letcode.dpattern.dpstrategy.demo06;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("外观：诱饵鸭");
    }
}
