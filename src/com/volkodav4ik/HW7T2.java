package com.volkodav4ik;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW7T2 {

    private static int lineCounter = 0;
    private static int wordCounter = 0;
    private static int symbolCounter = 0;
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr = new FileReader("poem.txt");
        Scanner scanner = new Scanner(fr);
        readFromFile(scanner);
        printFileToConsole();
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("There are %s lines, %s words and %s symbols in this file."
                , lineCounter, wordCounter, symbolCounter);
    }

    private static void printFileToConsole() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void readFromFile(Scanner scanner) {
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
            symbolCounter += list.get(lineCounter).length();
            String[] tmp = list.get(lineCounter).split(" ");
            wordCounter += tmp.length;
            lineCounter++;
        }
    }

}
