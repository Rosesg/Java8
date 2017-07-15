package org.mi.jdkbase.chapter1;

/**
 *  运算符
 *      1. 算术运算符
 *      2. 逻辑运算符    & | ^  && ||
 */
public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a/b);// /表示取整  结果为3
        System.out.println(a%b);// %表示取余数 结果为1
        a = b++;// 先赋值后自增
        System.out.println(a);// 3
        System.out.println(b);// 4

        a = ++b;// 先自增，后赋值
        System.out.println(a);// 5
        System.out.println(b);// 5
    }
}
