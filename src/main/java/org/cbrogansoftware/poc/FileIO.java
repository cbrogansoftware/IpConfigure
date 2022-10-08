package org.cbrogansoftware.poc;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileIO {

    public static void main(String[] args) throws IOException {

        ArrayList<Pair> listOfPairs = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("pairs.txt"));
        String line;
        while ((line = reader.readLine()) != null){
            String[] values = line.split(",");
            System.out.println(values[0] + "|" + values[1]);
            System.out.println(line);
        }
        reader.close();

    }
}
