package br.com.store.model.validator;

import br.com.store.exception.ContactTypeException;
import br.com.store.model.ContactType;

public class ValidatorContactType {
    
        public static void validate(ContactType ContactType) throws ContactTypeException {

        if (ContactType == null) {
            throw new ContactTypeException("Não há uma instância de tipo de contato");
        }
    }
    
}
