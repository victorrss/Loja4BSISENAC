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

    public static boolean isCPF(String CPF) {

        //It is considered error CPF's formed by a sequence of equal numbers
        if (CPF.equals("00000000000") || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            // Calculation of the 1st. Verifying digit
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {

                // (48 is the position of '0' in the ASCII table)         
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48);
            }
            // Calculation of the 2nd. Verifying digit
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            // Check if the calculated digits match the entered digits.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (Exception e) {
            return (false);
        }
    }

    public static boolean isCNPJ(String CNPJ) {

        // It is considered error CNPJ's formed by a sequence of equal numbers
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111")
                || CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333")
                || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
                || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777")
                || CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999")
                || (CNPJ.length() != 14)) {
            return (false);
        }

        char dig13, dig14;
        int sm, i, r, num, peso;

        try {
            // Calculation of the 1st. Verifying digit
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
                // (48 is the position of '0' in the ASCII table) 
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }

            // Calculation of the 2nd. Verifying digit
            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - r) + 48);
            }

            // Check if the calculated digits match the entered digits.
            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))) {
                return (true);
            } else {
                return (false);
            }
        } catch (Exception e) {
            return (false);
        }
    }
    //Proof of the value is numerical

    public static boolean isNumeric(String dado) {
        try {
            if (!dado.isEmpty()) {
                Integer.parseInt(dado);
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
