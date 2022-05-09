package com.nyha.webfinal.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PassengerValidator {
    private static final Pattern NAME_REGEX = Pattern
            .compile("\\w{3,40}");
    private static final Pattern NUMBER_REGEX = Pattern
            .compile("\\w{3,15}");


    private PassengerValidator() {
    }

    public static boolean isValidName(String name) {
        if (name == null || name.isBlank()) {
            return false;
        }
        Matcher matcher = NAME_REGEX.matcher(name);
        return matcher.matches();
    }


    public static boolean isValidNumber(String number) {
        if (number == null || number.isBlank()) {
            return false;
        }
        Matcher matcher = NUMBER_REGEX.matcher(number);
        return matcher.matches();
    }
}
