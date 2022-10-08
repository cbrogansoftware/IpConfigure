package org.cbrogansoftware.poc;

public class MultithreadThing implements Runnable{

    private int threadNumber;
    public MultithreadThing (int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(i + " from thread " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
