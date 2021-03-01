package com.hl.magic.dp.policy.demo05;

/**
 * quack接口的一个实现类：鸭子啥都不会做，就是不会叫
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        //什么都不会做，不会叫
    }
}
