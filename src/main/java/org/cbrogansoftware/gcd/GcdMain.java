package org.cbrogansoftware.gcd;

import javafx.util.Pair;
import java.util.ArrayList;

public class GcdMain {
    public static void main(String[] args){

        FileProcessor fileProcessor = new FileProcessor();
        ArrayList<Pair> listOfPairs = new ArrayList<>();

        listOfPairs = fileProcessor.getIntPairsFromFile("pairs.txt");
        for(int i=0;i<listOfPairs.size();i++){
            GcdProcessor processor = new GcdProcessor(listOfPairs.get(i), i);
            Thread myThread = new Thread(processor);
            myThread.start();
        }
        // Note: For the above threading loop. Requirements specifically state:
        //  "Demonstrate concurrency by executing each calculation in a separate thread."
    }

}
