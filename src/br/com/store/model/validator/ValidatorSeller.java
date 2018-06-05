package br.com.store.model.validator;

import br.com.store.exception.SellerException;
import br.com.store.model.Seller;

public class ValidatorSeller {

    public static void validate(Seller seller) throws SellerException {
        if (seller == null) {
            throw new SellerException("Não há uma instância de vendedor");
        }
        if (seller.getUser() == null) {
            throw new SellerException("Usuário não fornecido");
        }
        if (seller.getName() == null || seller.getName().trim().isEmpty() || "".equals(seller.getName())) {
            throw new SellerException("Nome do vendedor não fornecido");
        }
        if (seller.getName().length() > 45) {
            throw new SellerException("Nome do vendedor não pode ter mais de 45 caracteres");
        }
    }
}
