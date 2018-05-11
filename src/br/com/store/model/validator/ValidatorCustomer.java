package br.com.store.model.validator;

import br.com.store.exception.CustomerException;
import br.com.store.model.Customer;
import java.util.Date;

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
        if (customer.getName() == null || customer.getName().trim().isEmpty() || "".equals(customer.getName())) {
            throw new CustomerException("Nome do cliente não fornecido");
        }
        if (customer.getName().length() > 100) {
            throw new CustomerException("Nome do cliente não pode ter mais de 100 caracteres");
        }
        if (customer.getDocumentType() == null) {
            throw new CustomerException("Tipo de documento do cliente não fornecido");
        }

        if (customer.getDocument() == null || customer.getDocument().trim().isEmpty() || "".equals(customer.getDocument())) {
            throw new CustomerException("Documento do cliente não fornecido");
        }
        if (customer.getDocument().length() > 45) {
            throw new CustomerException("Número do documento muito grande");
        }
        if (customer.getGender() == null || "".equals(customer.getGender())
                || (!customer.getGender().equals("M"))
                && !customer.getGender().equals("F")) {
            throw new CustomerException("Sexo do cliente não fornecido");
        }
        if (customer.getBirthDate() == null) {
            throw new CustomerException("Data de nascimento do cliente não fornecida");
        }
        if (customer.getBirthDate().after(new Date())) {
            throw new CustomerException("Data de nascimento não pode ser futura");
        }
        if (customer.getNote().length() > 45) {
            throw new CustomerException("Anotação não pode ter mais de 45 caracteres");
        }
        if (customer.getBirthDate().after(new Date())) {
            throw new CustomerException("Data de criação não pode ser futura");
        }
    }
}
