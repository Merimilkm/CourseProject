package com.nyha.webfinal.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserValidator {
    private static final int MAX_LENGTH = 40;
    private static final Pattern USERNAME_REGEX = Pattern
            .compile("\\w{3,40}");
    private static final Pattern EMAIL_REGEX = Pattern
            .compile("^[-0-9a-zA-Z.+_]+@[-0-9a-zA-Z.+_]+\\.[a-zA-Z]{2,4}");
    private static final Pattern PASSWORD_PATTERN = Pattern
            .compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$");
    /* the password must include at least one upper and lower case letter, at least one digit,
     no spaces, tabs, at least 8 characters*/

    private UserValidator() {
    }

    public static boolean isValidUsername(String username) {
        if (username == null || username.isBlank()) {
            return false;
        }
        Matcher matcher = USERNAME_REGEX.matcher(username);
        return matcher.matches();
    }


    public static boolean isValidEmail(String email) {
        if (email == null || email.isBlank() || email.length() > MAX_LENGTH) {
            return false;
        }
        Matcher matcher = EMAIL_REGEX.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidPassword(String password) {
        if (password == null || password.isBlank()  || password.length() > MAX_LENGTH) {
            return false;
        }
        Matcher matcher = PASSWORD_PATTERN.matcher(password);
        return matcher.matches();
    }
}
