package org.mi.chapter1;

/**
 * 变量：系统为程序分配的一块内存单元，用来存储各种类型的数据
*          内存：存储数据，如果去表达某一块内存中的数据？ 比如：10在内存里面，如果称呼这个10，或者如何找到这个10呢？
*          答案：起名！名字指向这个数据（也就是这块内存单元）
 *      按所属类型划分：基本数据类型变量（8种）、引用数据类型变量
 *      按声明位置：局部变量、成员变量
 */
public class Variable {
    public static void main(String[] args) {
        int num = 10; //局部变量
        System.out.println(num);
    }
}
