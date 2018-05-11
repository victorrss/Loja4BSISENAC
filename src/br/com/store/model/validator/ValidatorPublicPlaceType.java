package br.com.store.model.validator;

import br.com.store.exception.PublicPlaceTypeException;
import br.com.store.model.PublicPlaceType;

public class ValidatorPublicPlaceType {

    public static void validate(PublicPlaceType publicPlaceType) throws PublicPlaceTypeException {

        if (publicPlaceType == null) {
            throw new PublicPlaceTypeException("Não há uma instância de logradouro");
        }

        if (publicPlaceType.getAbbreviation() == null) {
            throw new PublicPlaceTypeException("Abreviação de logradouro não fornecida");
        }

    }

}
