package org.cbrogansoftware.gcd;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileProcessor {

    /**
     * Read specified file and return ArrayList of input Pair(s).
     *   Input file MUST contain comma separated integer pairs.
     *   No whitespace is allowed other than line delimiters.
     *   Error message will be reported and processing will terminate
     *   if invalid line is detected.
     *   A 'zero byte' file is considered a valid input.
     * @param filename
     * @return ArrayList
     */
    public ArrayList<Pair> getIntPairsFromFile(String filename){
        String line;
        ArrayList<Pair> listOfPairs = new ArrayList<>();
        BufferedReader reader;
        Pair<String, String> inPairs;

        try {
            reader = new BufferedReader(new FileReader(filename));
            while (true){
                try {
                    if ((line = reader.readLine()) == null) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if(!validatePair(line)){
                    System.out.println("\nFile Input Invalid!!! Please adjust input file and try again.\n");
                    break;
                }
                String[] values = line.split(",");
                inPairs = new Pair<>(values[0], values[1]);
                listOfPairs.add(inPairs);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Explicitly close to prevent resource leaks.
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return listOfPairs;
    }

    /**
     * Simple validation for demo purposes.
     * In a real world scenario there would likely be
     *   more extensive requirements on how such validation
     *   would need to be handled and reported to user/calling system.
     * @param line
     * @return boolean
     */
    private static boolean validatePair(String line){
        String[] pair = line.split(",");
        if(pair.length != 2) return false;
        try{
            Integer.parseInt(pair[0]);
            Integer.parseInt(pair[1]);
        }catch (NumberFormatException ex) {
            return false;
        }

        return true;
    }
}
