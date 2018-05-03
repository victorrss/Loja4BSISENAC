package br.com.store.model.validator;

import br.com.store.exception.CategoryException;
import br.com.store.model.Category;

public class ValidatorCategory {

    public static void validate(Category category) throws CategoryException {
        if (category == null) {
            throw new CategoryException("A instancia da categoria é inválida");
        }

        if (category.getName() == null || category.getName().trim().isEmpty()) {
            throw new CategoryException("Nome da categoria não fornecido");
        }

    }

}
