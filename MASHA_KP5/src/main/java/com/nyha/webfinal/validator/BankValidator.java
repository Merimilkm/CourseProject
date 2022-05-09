package com.nyha.webfinal.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BankValidator {
    private static final Pattern ACCOUNT_NUMBER_REGEX = Pattern
            .compile("\\d{1,20}");

    private BankValidator() {
    }


    public static boolean isValidAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isBlank()) {
            return false;
        }
        Matcher matcher = ACCOUNT_NUMBER_REGEX.matcher(accountNumber);
        return matcher.matches();
    }
}
