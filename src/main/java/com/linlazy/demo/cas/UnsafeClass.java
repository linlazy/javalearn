package com.linlazy.demo.cas;


public class UnsafeClass extends AbstractClass {

    private boolean isReady = false;


    public void doSomething(){

        if(!isReady){
            // 准备工作只做一次，但这种写法多线程环境下并不能保证
            System.out.println(Thread.currentThread().getId() + "something is preparing...");
            isReady = true;
        }else {
            System.out.println(Thread.currentThread().getId() + "something is ready...");
        }
    }

}
