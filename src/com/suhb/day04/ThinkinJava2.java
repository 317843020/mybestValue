package com.suhb.day04;

import java.math.BigDecimal;
import java.math.BigInteger;

/***
 * thinking in java 4 number 2
 * @author su
 *@version 1.1
 *
 */
public class ThinkinJava2 {

    public static void main(String[] args) {
        int i = 4;
        //引用放在堆栈中，对象放在堆中。基本类型由于空间太小，简单。所以放在堆栈中。
        //任意精度的整数
        BigInteger ii = new BigInteger("2323");
        //任意精度的浮点数
        BigDecimal iii = new BigDecimal("434");

        // static 修饰的字段只会创建在类的空间，非static字段存在new 对象的空间


    }
}
