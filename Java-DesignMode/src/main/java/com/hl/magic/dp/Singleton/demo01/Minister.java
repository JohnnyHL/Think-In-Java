package com.hl.magic.dp.Singleton.demo01;

/**
 * 定义大臣
 */
public class Minister {
    public static void main(String[] args){
        /**
         * 大臣连续上朝三天，见到都是同一个皇帝emperor
         */
        Emperor emperor = Emperor.getInstance();
        for (int day = 1; day <= 3; day++){
            emperor.emperorInfo();
        }
    }
}
