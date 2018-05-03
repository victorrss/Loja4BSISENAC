package br.com.store.model.validator;

import br.com.store.exception.SubcategoryException;
import br.com.store.model.Subcategory;

public class ValidatorSubcategory {

    public static void validate(Subcategory subcategory) throws SubcategoryException {
        if (subcategory == null) {
            throw new SubcategoryException("A instancia da subcategoria é inválida");
        }

        if (subcategory.getName() == null || subcategory.getName().trim().isEmpty()) {
            throw new SubcategoryException("Nome da subcategoria não fornecido");
        }

    }

}
