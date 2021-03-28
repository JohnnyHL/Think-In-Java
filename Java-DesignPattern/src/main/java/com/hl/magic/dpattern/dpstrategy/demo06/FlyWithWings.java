package com.hl.magic.dpattern.dpstrategy.demo06;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("会飞，盘旋着飞");
    }
}
