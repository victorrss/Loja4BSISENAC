package br.com.store.model.validator;

import br.com.store.exception.CustomerContactException;
import br.com.store.model.CustomerContact;

public class ValidatorCustomerContact {
    
    public static void validade(CustomerContact customerContact) throws CustomerContactException {

        if (customerContact == null) {
            throw new CustomerContactException("Não há uma instância de contato do cliente");
        }

        if (customerContact.getCustomer() == null) {
            throw new CustomerContactException("Cliente para contato não fornecido");
        }

        if (customerContact.getContactType() == null) {
            throw new CustomerContactException("Tipo de contato não fornecido");
        }

        if (customerContact.getValue() == null || customerContact.getValue().trim().isEmpty()) {
            throw new CustomerContactException("Contato não fornecido");
        }
    }
    
}
