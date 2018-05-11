package br.com.store.model.validator;

import br.com.store.exception.ProductException;
import br.com.store.model.Product;

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
//
//        if (product.getBarcode() == null || product.getBarcode().trim().isEmpty()) {
//            throw new ProductException("Código de barras do produto não fornecido");
//        }
//
//        if (product.getDescription() == null || product.getDescription().trim().isEmpty()) {
//            throw new ProductException("Descrição do produto não fornecida");
//        }
//
//        if (product.getWarranty() == null) {
//            throw new ProductException("Garantia do produto não fornecida");
//        }
//
//        if (product.getModel() == null || product.getModel().trim().isEmpty()) {
//            throw new ProductException("Modelo do produto não fornecido");
//        }
//
//        if (product.getPicture() == null) {
//            throw new ProductException("Foto do produto não fornecida");
//        }
//
//        if (product.getStock() == null) {
//            throw new ProductException("Estoque do produto não fornecido");
//        }
//
//        if (product.getPrice() == null) {
//            throw new ProductException("Preço do produto não fornecido");
//        }

    }
}
