package br.com.store.utils;

import java.io.File;
import java.text.SimpleDateFormat;

public class DataUtil {

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

    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 && i < s.length() - 1) {
            ext = s.substring(i + 1).toLowerCase();
        }
        return ext;
    }

    public static boolean checkBarcodeEAN(String barcode) {
        //Checks if the check digit is correct
        int[] numbers = barcode.chars().map(Character::getNumericValue).toArray();
        int sumEven = numbers[1] + numbers[3] + numbers[5] + numbers[7] + numbers[9] + numbers[11];
        int sumOdd = numbers[0] + numbers[2] + numbers[4] + numbers[6] + numbers[8] + numbers[10];
        int result = sumOdd + sumEven * 3;
        int checkDigit = 10 - result % 10;
        return checkDigit == numbers[12];
    }

    public static SimpleDateFormat getDateFormat(String fmt) {
        return new SimpleDateFormat(fmt);
    }
    
}
