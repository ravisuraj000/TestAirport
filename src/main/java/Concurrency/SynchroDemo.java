package Concurrency;

public class SynchroDemo {


    synchronized void test(){
        try{
            wait();
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
