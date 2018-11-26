package com.linlazy.demo.cas;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 我们的目标是准备工作只做一次，即使在多线程环境下
 */
public class CasDemo {




    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //不安全的做法
        UnsafeClass unsafeClass = new UnsafeClass();
        for(int i = 1; i < 20;i++){
            executorService.submit(new CasRunnable(unsafeClass));
        }



        //安全的做法
        SafeClassWithCAS safeClassWithCAS = new SafeClassWithCAS();
        for(int i = 1; i < 20;i++){
            executorService.submit(new CasRunnable(safeClassWithCAS));
        }
    }
}
