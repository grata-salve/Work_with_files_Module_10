package org.example.utils;

import java.util.List;

public class ValidPhoneNumbers {
    public static void PhoneNumbersValidation(List<String> phoneNumbers) {
        phoneNumbers.removeIf(s -> !s.matches("[(]\\d{3}[)].\\d{3}-\\d{4}") && !s.matches("\\d{3}-\\d{3}-\\d{4}"));
    }
}