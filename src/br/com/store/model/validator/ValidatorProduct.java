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
        
        if (product.getName().length() > 45) {
            throw new ProductException("Nome do produto não pode ter mais que 45 caracteres");
        }

//        if (product.getBarcode().length() > 45) {
//            throw new ProductException("Código de barras do produto não pode ter mais que 45 caracteres");
//        }
        
        //Checks if the Barcode has 13 numeric characters
        if (!product.getBarcode().matches("^[0-9]{13}$")) {
            throw new ProductException("Código de barras deve possuir 13 caracteres numéricos");
        }
        
        //Checks if the check digit is correct
        int[] numbers = product.getBarcode().chars().map(Character::getNumericValue).toArray();
        int sumEven = numbers[1] + numbers[3] + numbers[5] + numbers[7] + numbers[9] + numbers[11];
        int sumOdd = numbers[0] + numbers[2] + numbers[4] + numbers[6] + numbers[8] + numbers[10];
        int result = sumOdd + sumEven * 3;
        int checkDigit = 10 - result % 10;
        if(checkDigit != numbers[12]){
            throw new ProductException("Código de barras é invalido, digito verficador não bate");
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
