package br.com.store.model.validator;

import br.com.store.exception.CustomerContactException;
import br.com.store.model.CustomerContact;
import br.com.store.utils.DataUtil;
import static br.com.store.utils.DataUtil.isPhone;
import java.util.List;

public class ValidatorCustomerContact {

    public static void validate(List<CustomerContact> customerContacts) throws CustomerContactException {
        for (CustomerContact customerContact : customerContacts) {
            if (customerContact == null) {
                throw new CustomerContactException("Não há uma instância de contato do cliente");
            }
//        if (customerContact.getCustomerId()== null) {
//            throw new CustomerContactException("Id do cliente não reconhecido");
//        }
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
            if (customerContact.getContactType().getDescription().toUpperCase().equals("E-MAIL") && !DataUtil.isEmail(customerContact.getValue())) {
                throw new CustomerContactException("Email inválido");
            }
            if (customerContact.getContactType().getDescription().equals("TEL. FIXO") && !isPhone(customerContact.getValue())) {
                throw new CustomerContactException("Telefone inválido");
            }
            if (customerContact.getContactType().getDescription().equals("CELULAR") && !isPhone(customerContact.getValue())) {
                throw new CustomerContactException("Celular inválido");
            }

        }
    }
}
