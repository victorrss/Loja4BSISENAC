package br.com.store.model.validator;

import br.com.store.exception.SubcategoryException;
import br.com.store.model.SubCategory;

public class ValidatorSubcategory {

    public static void validate(SubCategory subcategory) throws SubcategoryException {
        if (subcategory == null) {
            throw new SubcategoryException("A instancia da subcategoria é inválida");
        }

        if (subcategory.getName() == null || subcategory.getName().trim().isEmpty()) {
            throw new SubcategoryException("Nome da subcategoria não fornecido");
        }

        if (subcategory.getName().length() > 45) {
            throw new SubcategoryException("Nome da subcategoria não pode ter mais que 45 caracteres");
        }

    }

}
