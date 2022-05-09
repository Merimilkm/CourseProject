package com.nyha.webfinal.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TicketValidator {
    private static final Pattern TRAIN_NUMBER_REGEX = Pattern
            .compile("\\d{1,20}");
    private static final Pattern SEAT_REGEX = Pattern
            .compile("\\d{1,5}");

    private TicketValidator() {
    }

    public static boolean isValidSeat(String seat) {
        if (seat == null || seat.isBlank()) {
            return false;
        }
        Matcher matcher = SEAT_REGEX.matcher(seat);
        return matcher.matches();
    }

    public static boolean isValidTrainNumber(String trainNumber) {
        if (trainNumber == null || trainNumber.isBlank()) {
            return false;
        }
        Matcher matcher = SEAT_REGEX.matcher(trainNumber);
        return matcher.matches();
    }
}
