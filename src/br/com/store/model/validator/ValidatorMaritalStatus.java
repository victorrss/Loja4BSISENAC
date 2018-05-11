package br.com.store.model.validator;

import br.com.store.exception.MaritalStatusException;
import br.com.store.model.MaritalStatus;

public class ValidatorMaritalStatus {
    
        public static void validate(MaritalStatus maritalStatus) throws MaritalStatusException {

        if (maritalStatus == null) {
            throw new MaritalStatusException("Não há uma instância de estado civil");
        }
    }
    
}
