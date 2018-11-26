package com.linlazy.demo.cas;

public class CasRunnable implements Runnable {

    private AbstractClass clazz;

    CasRunnable(AbstractClass clazz) {
        this.clazz = clazz;
    }

    @Override
    public void run() {
        clazz.doSomething();
    }
}
