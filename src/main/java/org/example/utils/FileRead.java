package org.example.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRead {
    public static List<String> FileToArray(String fileName) {
        List<String> strings = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(fileName);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine())
                strings.add(scanner.nextLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return strings;
    }
}
