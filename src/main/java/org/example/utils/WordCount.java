package org.example.utils;

import java.util.*;

public class WordCount {

    public static Map<String, Integer> countWordsFrequency(List<String> strings) {
        String data = strings.toString();
        String[] words = data.substring(1, data.length() - 1).split("\\W+");

        HashMap<String, Integer> wordsFrequency = new HashMap<>();

        for (String s : words) {
            if (wordsFrequency.containsKey(s)) {
                wordsFrequency.put(s, wordsFrequency.get(s) + 1);
            }
            else {
                wordsFrequency.put(s, 1);
            }
        }

        return wordsFrequency;
    }
}