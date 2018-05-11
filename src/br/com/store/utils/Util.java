package br.com.store.utils;

public class Util {

    public static Integer parseInteger(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Float parseFloat(String s) {
        try {
            return Float.parseFloat(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static boolean empty(final String s) {
        return s == null || s.trim().isEmpty();
    }

    public static String onlyNumbers(String s) {
        return s.replaceAll("[^0-9.]", "");
    }
}
