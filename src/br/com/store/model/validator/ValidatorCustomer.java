package br.com.store.model.validator;

import br.com.store.exception.CustomerException;
import br.com.store.model.Customer;

public class ValidatorCustomer {

    public static void validate(Customer customer) throws CustomerException {

        if (customer == null) {
            throw new CustomerException("Não há uma instância de cliente");
        }

        if (customer.getAddress() == null) {
            throw new CustomerException("Endereço do cliente não fornecido");
        }

        if (customer.getMaritalStatus() == null) {
            throw new CustomerException("Estado civil do cliente não fornecido");
        }

        if (customer.getName() == null || customer.getName().trim().isEmpty()) {
            throw new CustomerException("Nome do cliente não fornecido");
        }

        if (customer.getDocumentType() == null) {
            throw new CustomerException("Tipo de documento do cliente não fornecido");
        }

        if (customer.getDocument() == null || customer.getDocument().trim().isEmpty()) {
            throw new CustomerException("Documento do cliente não fornecido");
        }

        if (customer.getGender() == null || "".equals(customer.getGender())
                || (!customer.getGender().equals("M"))
                && !customer.getGender().equals("F")) {
            throw new CustomerException("Sexo do cliente não fornecido");
        }
        
        if (customer.getBirthDate() == null) {
            throw new CustomerException("Data de nascimento do cliente não fornecida");
        }

        
    }

}
