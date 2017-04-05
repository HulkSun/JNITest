package com.example.hellojni;

/**
 * Created by HULK on 2017/4/5.
 */

public class HelloJni {
    public native String stringFromJNI();

    static {
        System.loadLibrary("hello-jni");//此处注意加载库的名字
    }
}
