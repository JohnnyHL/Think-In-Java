package com.hl.magic.dp.policy.demo06;

/**
 * 红头鸭继承父类鸭子
 */
public class RedDuck extends Duck {
    /**
     * 无参构造方法
     * 多态方式
     */
    public RedDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观：红毛鸭");
    }
}
