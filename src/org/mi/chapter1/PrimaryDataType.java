package org.mi.chapter1;

/**
 *  1. Java有8种基本数据类型
 *  2. 字节：计算机文件大小的基本计算单位
 *        说明：不是最小的，最小的叫位。但计算机最小存储的数据就是1个字节，不能是1位，1位也得按一个字节来存储，就是8位。
 *  3. 1byte = 8bit  记住！有助于理解变量的存储
 *
 *
 */
public class PrimaryDataType {
    public static void main(String[] args) {
        // 数值类型
        byte b = 10;// 占用1个字节，就是8位，取值范围为：-128~127
        short s = 10;// 占用2个字节，16位，一般不用，为了兼容老的机器
        int i = 4;// 占用4个字节，32位，取值大约21亿 (2147483647)
        //System.out.println(Integer.MAX_VALUE);
        long lon = 100L;// 不建议用l作为变量名 占用8个字节
        float f = 10.98F;// 占用4个字节
        double d = 10.123456D;// 占用8个字节

        char c = 'A';// 占用2个字节，取值范围为0~65535
        boolean bool = true; // 不确定   JVM虚拟机规范 根据不同的操作系统转成整数或者字节

        // 要记住这些类型所占的大小，为了要计算对象在内存中所占的大小！

        char c2 = 97;// ascii码表 ：计算机存储的时候都是按照0和1来存储的，所以键盘上所有的按键字符都有对应的数字来表示。
        System.out.println(c2);// 用数字去表示一个字符是可以的

    }
}
