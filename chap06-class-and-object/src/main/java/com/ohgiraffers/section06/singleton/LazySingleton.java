package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    private static LazySingleton lazy = new LazySingleton();

    private LazySingleton(){
        System.out.println("lazy 생성됨");

    }
    public static LazySingleton getSInstance() {

        if (lazy == null) {
            lazy = new LazySingleton();
        }
        return lazy;
    }
}
