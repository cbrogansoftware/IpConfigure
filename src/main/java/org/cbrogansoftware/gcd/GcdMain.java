package org.cbrogansoftware.gcd;

import javafx.util.Pair;
import java.util.ArrayList;

public class GcdMain {
    public static void main(String[] args){

        FileProcessor fileProcessor = new FileProcessor();
        String file = "pairs.txt"; // Default file is in this project folder.
        ArrayList<Pair> listOfPairs = fileProcessor.getIntPairsFromFile(file);

        // Note: For the below demo loop... Requirements specifically state:
        //  "Demonstrate concurrency by executing each calculation in a separate thread."
        //  No file size restrictions have been implemented.  Use caution if using very large files.
        for(int i=0;i<listOfPairs.size();i++){
            GcdProcessor processor = new GcdProcessor(listOfPairs.get(i), i);
            Thread myThread = new Thread(processor);
            myThread.start();
        }
    }

}
