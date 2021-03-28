package com.hl.magic.dpattern.dpfactory.demo01;

import java.util.List;

/**
 * 人类工厂
 */
public class HumanFactory {

    public static Human createHuman(Class c){
        Human human = null;
        try {
            human = (Human)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误");
        } catch (ClassNotFoundException e) {
            System.out.println("指定的人类找不到");
        }
        return human;
    }

    public static Human createHuman(){
        Human human = null;
        //获得有多少个实现类，多少个人类
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
        return  null;
    }
}
