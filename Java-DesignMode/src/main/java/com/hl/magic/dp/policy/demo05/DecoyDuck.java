package com.hl.magic.dp.policy.demo05;
/**
 * 我们开又定义了一只诱饵鸭子，动作是啥样暂且不管，预留着，将来成熟了在附加新技能进来
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("外观：诱饵鸭");
    }
}
