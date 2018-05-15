package br.com.store.model.validator;

import br.com.store.exception.ProductException;
import br.com.store.model.Product;
import br.com.store.utils.DataUtil;

public class ValidatorProduct {

    public static void validate(Product product) throws ProductException {
        if (product == null) {
            throw new ProductException("A instancia do produto é inválida");
        }

        if (product.getBrand() == null) {
            throw new ProductException("Marca do produto não fornecida");
        }

        if (product.getCategory() == null) {
            throw new ProductException("Categoria do produto não fornecida");
        }

        if (product.getSubCategory() == null) {
            throw new ProductException("SubCategoria do produto não fornecida");
        }

        if (product.getName() == null || product.getName().trim().isEmpty()) {
            throw new ProductException("Nome do produto não fornecido");
        }

        if (product.getName().length() > 45) {
            throw new ProductException("Nome do produto não pode ter mais que 45 caracteres");
        }

//        if (product.getBarcode().length() > 45) {
//            throw new ProductException("Código de barras do produto não pode ter mais que 45 caracteres");
//        }
        
        if(!DataUtil.validatorIsNumericBarcode(product.getBarcode())){
            throw new ProductException("O código de barras precisa ter 13 caracteres numéricos");
        }

        if (!DataUtil.checkBarcodeEAN(product.getBarcode())) {
            throw new ProductException("O código de barras está inválido!");
        }

        if (product.getDescription().length() > 10000) {
            throw new ProductException("Descrição do produto não pode ter mais de 10000 caracteres");
        }

        if (product.getModel().length() > 45) {
            throw new ProductException("Modelo do produto não pode ter mais que 45 caracteres");
        }

        if (product.getStock() == null) {
            throw new ProductException("Estoque do produto não fornecido");
        }

        if (product.getPrice() == null) {
            throw new ProductException("Preço do produto não fornecido");
        }
    }
    
}
