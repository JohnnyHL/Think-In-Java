package com.hl.magic.dp.common.dp1;

/**
 * 单一职责原则：应该且仅有一个原因引起类的变更。
 */
public interface IPhone {

    //bot拨通电话
    void dial(String pName);

    //通话
    void chat(Object o);

    //通话完毕，挂电话
   void hangup();
}
