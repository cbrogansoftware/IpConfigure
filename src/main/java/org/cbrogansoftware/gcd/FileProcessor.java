package org.cbrogansoftware.gcd;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileProcessor {

    public ArrayList<Pair> getIntPairsFromFile(String filename){
        String line;
        ArrayList<Pair> listOfPairs = new ArrayList<>();
        BufferedReader reader = null;
        Pair<String, String> inPairs;

        try {
            reader = new BufferedReader(new FileReader(filename));
            while (true){
                try {
                    if (!((line = reader.readLine()) != null)) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                String[] values = line.split(",");
                inPairs = new Pair<>(values[0], values[1]);
                listOfPairs.add(inPairs);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return listOfPairs;
    }

}
