package org.example;

import org.example.utils.FileRead;
import org.example.utils.JSONMapper;
import org.example.utils.ValidPhoneNumbers;
import org.example.utils.WordCount;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Task 1
        List<String> phoneNumbers = FileRead.FileToArray("src/main/resources/phone numbers.txt");
        ValidPhoneNumbers.PhoneNumbersValidation(phoneNumbers);
        System.out.println(phoneNumbers);

        // Task 2
        List<String> users = FileRead.FileToArray("src/main/resources/users.txt");
        JSONMapper.convertToJSON(users);

        // Task 3
        List<String> strings = FileRead.FileToArray("src/main/resources/words.txt");
        WordCount.countWordsFrequency(strings).forEach((string, integer) -> System.out.println(string + " " + integer));;
    }
}