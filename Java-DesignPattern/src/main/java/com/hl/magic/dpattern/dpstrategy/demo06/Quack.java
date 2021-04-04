package com.hl.magic.letcode.dpattern.dpstrategy.demo06;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱的叫");
    }
}
