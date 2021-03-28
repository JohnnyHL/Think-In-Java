package com.hl.magic.dpattern.dpstrategy.demo06;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        //什么都不会做，不会叫
    }
}
