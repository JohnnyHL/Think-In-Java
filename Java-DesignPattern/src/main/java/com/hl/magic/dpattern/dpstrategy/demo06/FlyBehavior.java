package com.hl.magic.dpattern.dpstrategy.demo06;

/**
 * 将鸭子飞的行为剥离出来，作为fly接口，提供两种子类
 * 1.会飞，盘旋着飞
 * 2.不会飞，打死也不会飞
 */
public interface FlyBehavior {
    void fly();
}
