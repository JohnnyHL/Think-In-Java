package com.hl.magic.dp.policy.demo05;

/**
 * fly接口的一个实现类：鸭子盘旋着飞
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("会飞，盘旋着飞");
    }
}
