package Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolModel {

    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(100);
        List<String> al=new ArrayList<>();

        for(int i=0;i<10;i++){
            al.add("XXXX"+i);
        }

        for(int i=0;i<al.size();i++){
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    try{
                        Thread.sleep(20000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });
        }
        service.shutdown();
    }
}
