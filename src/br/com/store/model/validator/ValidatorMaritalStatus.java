package br.com.store.model.validator;

import br.com.store.exception.MaritalStatusException;
import br.com.store.model.MaritalStatus;

public class ValidatorMaritalStatus {

    public static void validate(MaritalStatus maritalStatus) throws MaritalStatusException {

        if (maritalStatus == null) {
            throw new MaritalStatusException("Não há uma instância de estado civil");
        }
        if (maritalStatus.getDescription() == null || maritalStatus.getDescription().trim().isEmpty()
                || "".equals(maritalStatus.getDescription())) {
            throw new MaritalStatusException("Descrição de estado civil não fornecida");
        }
        if (maritalStatus.getDescription().length() > 45) {
            throw new MaritalStatusException("Descrição de estado civil não pode ser maior que 45 caracteres");
        }
    }

}
