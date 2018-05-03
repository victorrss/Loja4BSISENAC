package br.com.store.model.validator;

import br.com.store.exception.BrandException;
import br.com.store.model.Brand;

public class ValidatorBrand {

    public static void validate(Brand brand) throws BrandException {
        if (brand == null) {
            throw new BrandException("A instancia da marca é inválida");
        }

        if (brand.getName() == null || brand.getName().trim().isEmpty()) {
            throw new BrandException("Nome da marca não fornecido");
        }

    }

}
