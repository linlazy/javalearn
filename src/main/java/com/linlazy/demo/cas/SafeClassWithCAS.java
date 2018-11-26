package com.linlazy.demo.cas;


import java.util.concurrent.atomic.AtomicBoolean;

public class SafeClassWithCAS extends AbstractClass {

    private AtomicBoolean isReady = new AtomicBoolean(false);


    public void doSomething(){

        if(isReady.compareAndSet(false,true)){
            // 准备工作只做一次
            System.out.println(Thread.currentThread().getId() + "something is preparing...");
        }else {
            System.out.println(Thread.currentThread().getId() + "something is ready...");
        }
    }

}
