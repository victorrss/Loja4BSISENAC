package br.com.store.model.validator;

import br.com.store.exception.CustomerContactException;
import br.com.store.model.CustomerContact;
import java.util.InputMismatchException;

public class ValidatorCustomerContact {

    public static void validate(CustomerContact customerContact) throws CustomerContactException {

        if (customerContact == null) {
            throw new CustomerContactException("Não há uma instância de contato do cliente");
        }
        if (customerContact.getCustomer() == null) {
            throw new CustomerContactException("Cliente para contato não fornecido");
        }
        if (customerContact.getContactType() == null) {
            throw new CustomerContactException("Tipo de contato não fornecido");
        }
        if (customerContact.getValue() == null || customerContact.getValue().trim().isEmpty()
                || "".equals(customerContact.getValue())) {
            throw new CustomerContactException("Contato não fornecido");
        }
        if (customerContact.getValue().length() > 45) {
            throw new CustomerContactException("Contato não pode ter mais que 45 caracteres");
        }
    }

    //Proof of the value is numerical
    static boolean isNumeric(String dado) {
        try {
            if (!dado.isEmpty()) {
                Integer.parseInt(dado);
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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

}
