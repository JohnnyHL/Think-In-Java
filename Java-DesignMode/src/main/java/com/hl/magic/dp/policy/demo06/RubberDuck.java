package com.hl.magic.dp.policy.demo06;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("外观：橡皮鸭");
    }
}
