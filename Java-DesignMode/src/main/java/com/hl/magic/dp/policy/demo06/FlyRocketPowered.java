package com.hl.magic.dp.policy.demo06;

/**
 * 鸭子想用火箭飞的方式，那么直接定义一个火箭飞实现类即可
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("这只鸭子要用火箭飞");
    }
}
