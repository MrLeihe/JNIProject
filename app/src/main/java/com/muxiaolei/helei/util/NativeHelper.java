package com.muxiaolei.helei.util;

/**
 * @author HeLei
 * @date 2018/3/13 14:10
 */

public class NativeHelper {

    static {
        System.loadLibrary("calculate");
    }

    private NativeHelper(){
        //not allow create instance
    }

    //计算两个数之和
    public static native int calculateSum(int number, int other);
}
