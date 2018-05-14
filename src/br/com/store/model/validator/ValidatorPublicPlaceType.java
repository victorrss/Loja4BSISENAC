package br.com.store.model.validator;

import br.com.store.exception.PublicPlaceTypeException;
import br.com.store.model.PublicPlaceType;

public class ValidatorPublicPlaceType {

    public static void validate(PublicPlaceType publicPlaceType) throws PublicPlaceTypeException {

        if (publicPlaceType == null) {
            throw new PublicPlaceTypeException("Não há uma instância de logradouro");
        }
        if (publicPlaceType.getName().length() > 45) {
            throw new PublicPlaceTypeException("Nome do logradouro não pode ter mais de 45 caracteres");
        }
        if (publicPlaceType.getAbbreviation() == null || publicPlaceType.getAbbreviation().trim().isEmpty()
                || "".equals(publicPlaceType.getAbbreviation())) {
            throw new PublicPlaceTypeException("Abreviação de logradouro não fornecida");
        }
        if (publicPlaceType.getAbbreviation().length() > 3) {
            throw new PublicPlaceTypeException("Abreviação do logradouro não pode ter mais de 3 caracteres");
        }
    }

}
