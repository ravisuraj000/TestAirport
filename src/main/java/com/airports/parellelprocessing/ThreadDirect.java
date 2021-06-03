package com.airports.parellelprocessing;

public class ThreadDirect {

    public static void main(String[] args) {
        for (int i = 0 ;i<2000; i++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                   try{
                       Thread.sleep(1003);
                   }catch(Exception e){

                   }
                    System.out.println(Thread.currentThread().getName());
                }
            });
            t.start();

        }

    }
}
