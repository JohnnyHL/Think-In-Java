package com.hl.magic.dp.policy.demo05;

/**
 * 将鸭子飞的行为剥离出来，作为fly接口，并提供两个子类
 * (也可以是多个子类，只要飞的方式不一样就可以作为实现类来实现本接口)
 * 1.会飞，盘旋着飞
 * 2.不会飞，打死也不会飞
 */
public interface FlyBehavior {
    void fly();
}
