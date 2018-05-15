package br.com.store.model.validator;

import br.com.store.exception.CustomerContactException;
import br.com.store.model.CustomerContact;

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

}
