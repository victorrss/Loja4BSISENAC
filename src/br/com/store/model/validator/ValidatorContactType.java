package br.com.store.model.validator;

import br.com.store.exception.ContactTypeException;
import br.com.store.model.ContactType;

public class ValidatorContactType {

    public static void validate(ContactType contactType) throws ContactTypeException {

        if (contactType == null) {
            throw new ContactTypeException("Não há uma instância de tipo de contato");
        }
        if (contactType.getDescription() == null || contactType.getDescription().trim().isEmpty()
                || "".equals(contactType.getDescription())) {
            throw new ContactTypeException("Descrição do tipo de contato não fornecida");
        }
        if (contactType.getDescription().length() > 45) {
            throw new ContactTypeException("Descrição do tipo de contato não pode ser maior que 45 caracteres");
        }
    }

}
