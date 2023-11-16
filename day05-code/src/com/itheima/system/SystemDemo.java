package com.itheima.system;

public class SystemDemo {
    /*
        System类常见方法:

            1.Public static void exit(int status):终止当前运行Java虚拟机，非零表示一场终止。
            2.Public static long currenTimeMillis():返回当前系统的时间毫秒值i形式
            3.Public static void arraycopy(Object src,int srcPos,Object dest,int desrPos,int length)

                                1.数据源数组
                                2.起始索引
                                3.目的地数组
                                4.起始索引
                                5.拷贝的个数
     */
    public static void main(String[] args) {

        int[] arr ={11,22,33,44,55};
        int[] destArr = new int[3];

        System.arraycopy(arr,0,destArr,0,3);

        for (int i = 0; i < destArr.length; i++) {
            System.out.println(destArr[i]);
        }
    }

    private static void method() {
        long start = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += i;
        }
        System.out.println(s);

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
