package Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockingDemo {
    private static final Lock mylock=new ReentrantLock();
     void test(){
        try{
           // mylock.tryLock(5, TimeUnit.SECONDS);
            mylock.lock();
            Thread.sleep(1000);
            mylock.unlock();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SynchroDemo demo=new SynchroDemo();
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                demo.test();
            }
        });
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                demo.test();
            }
        });
        t.start();
        t1.start();

    }
}
