package org.mi.chapter1;

/**
 *  位运算符：效率最高的
 *      书接上文，面试题：&与&&的区别？
 *   面试说区别的时候，把两个分开说，分别说出各自是怎么回事，区别自然明了
 *      答：&在算术运算符中表示分别计算表达式两边的结果，再作与运算，在做位运算的时候，表示按位与
 *         &&表示短路与运算，先计算左边的表达式，如果为false，则不计算右边，直接返回false，效率更高。
 *
 *   << 左移  越来越大，最后就变负数，所有不用考虑符号位
 *   >> 带符号右移  需要补原来的符号位
 *   >>> 无符号右移 最高位补0
 */
public class BitOperator {
    public static void main(String[] args) {
        System.out.println(~10); // 按一个字节算： 00001010   11110101
        // 面试题：以最快的速度算出 8*4 的结果
        // 0000 0100  4
        // 0001 0000 32
        System.out.println(8 << 2);
        // 面试题：不通过第三个变量，如何交换两个数？1.通过表达式
        int a = 1;
        int b =2;
        a = a+b-(b=a);
        System.out.println(a);
        System.out.println(b);
        //2. 通过+- 或者 */  可能出现溢出
        int x =1;
        int y =2;
        //x=x+y;
        //y=x-y;
        //x=x-y;
        //System.out.println(x);
        //System.out.println(y);
        //3. 最快  使用^   结论：异或三次就交换了！前提是a和b不相同
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x);
        System.out.println(y);
        //4. 最靠谱的还是通过第三者
    }
}
