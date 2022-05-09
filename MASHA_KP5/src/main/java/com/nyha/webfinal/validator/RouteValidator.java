package com.nyha.webfinal.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RouteValidator {
    private static final Pattern STATION_REGEX = Pattern
            .compile("\\w{3,40}");


    private RouteValidator() {
    }


    public static boolean isValidStation(String station) {
        if (station == null || station.isBlank()) {
            return false;
        }
        Matcher matcher = STATION_REGEX.matcher(station);
        return matcher.matches();
    }
}