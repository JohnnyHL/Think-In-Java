package com.hl.magic.dp.policy.demo05;

/**
 * 定义好父类鸭子、行为接口、实现类后
 * 我们开始生产鸭子了，定义一只绿毛鸭子，动作是啥样暂且不管，预留着，将来成熟了在附加新技能进来
 */
public class MallarDuck extends Duck {
    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观：绿毛鸭");
    }
}
