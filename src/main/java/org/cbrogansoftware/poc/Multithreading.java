package org.cbrogansoftware.poc;

public class Multithreading {

    public static void main(String[] args){

        // Use start instead of run otherwise will execute sequentially
        for(int i=0;i<3;i++){ // CSB says control number of threads
            MultithreadThing multithreadThing = new MultithreadThing(i);
            Thread myThread = new Thread(multithreadThing);
            myThread.start();
        }


    }

}
