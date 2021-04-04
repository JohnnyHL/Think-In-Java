package com.hl.magic.letcode.dpattern.dpstrategy.demo05;

/**
 * fly接口的一个实现类：鸭子不会飞
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        //不会飞，打死都不会飞的
    }
}
