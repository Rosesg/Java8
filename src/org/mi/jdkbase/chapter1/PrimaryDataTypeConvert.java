package org.mi.jdkbase.chapter1;

/**
 *  基本数据类型的转换
 *  1. 自动类型转换：容量小的类型自动转换成容量大的数据类型
 *  2. 强制类型转换：容量大  ——>   容量小  要加强制转换符，强转有可能造成精度的降低或数据的溢出，使用时要小心。
 *  3. boolean 类型不能转换成任何类型的基本数据类型
 */
public class PrimaryDataTypeConvert {
    public static void main(String[] args) {
        // ----------------------自动转换---------------------- \\
        byte b = 10;
        short s = b;// 把一个字节赋值给一个短整型变量，自动转换
        int i = s;// 把一个短整型赋值给一个整型变量，自动转换
        long lon = i;

        // char -> int 自动转换
        char sex = '男';//2个字节 ascii码 30007
        int sex2 = sex;
        System.out.println(sex2);

        float f = 10F;
        double d = f;
        System.out.println(d);//10.0
        // float 和 double 属于近似值，byte short int long 属于精确值，精确值转近似值时有可能丢失精度
        int num = 2147483000;
        float num2 = num;
        // 如果用于表示货币值，不建议使用float和double
        System.out.println(num2);//2.14748301E9 E9表示10的9次方

        // ----------------------byte short int 计算的时候自动转成int---------------------- \\
        //面试题
        //short s1 = 10;
        //s1 = s1 + 1; //1为int 类型    结果应该用int类型接收
        //System.out.println(s1);
        //面试题
        //short s1 = 10;
        //byte b2 = 1;
        //s1 = s1 + b2;  s1 + b2 结果也应该用int类型的变量接收
        //System.out.println(s1);

        //---------------------------强转---------------------------------\\
        short s1 = 10;
        byte b2 = 1;
        s1 = (short) (s1 + b2);  //s1 + b2 结果也应该用int类型的变量接收
        System.out.println(s1);
        // 强制转换的意义：比如long lon = 10L; 虽然是long类型，但是比较小，会浪费空间
    }
}
