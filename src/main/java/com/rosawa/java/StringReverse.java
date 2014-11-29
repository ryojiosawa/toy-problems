package com.rosawa.java;

public class StringReverse {

    public static String reverse(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }

        return builder.toString();
    }
}
