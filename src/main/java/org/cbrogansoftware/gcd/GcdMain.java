package org.cbrogansoftware.gcd;

import javafx.util.Pair;
import org.cbrogansoftware.poc.MultithreadThing;

import java.math.BigInteger;
import java.util.ArrayList;

public class GcdMain {
    public static void main(String[] args){

        FileProcessor fileProcessor = new FileProcessor();
        ArrayList<Pair> listOfPairs = new ArrayList<>();

        listOfPairs = fileProcessor.getIntPairsFromFile("pairs.txt");
        for(int i=0;i<listOfPairs.size();i++){ // CSB says control number of threads
            //GcdProcessor processor = new GcdProcessor(listOfPairs, i);
            GcdProcessor processor = new GcdProcessor(listOfPairs.get(i), i);
            Thread myThread = new Thread(processor);
            myThread.start();
        }

//        for(int i=0;i<1;i++){ // CSB says control number of threads
//            GcdProcessor processor = new GcdProcessor(listOfPairs, i);
//            Thread myThread = new Thread(processor);
//            myThread.start();
//        }

//        for(int i=0;i < listOfPairs.size(); i++){
//            Pair<String, String> outPairs = listOfPairs.get(i);
//
//            System.out.println(outPairs.getKey() + "|" + outPairs.getValue());
//        }

    }

}
