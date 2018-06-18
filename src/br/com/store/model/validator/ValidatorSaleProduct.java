package br.com.store.model.validator;

import br.com.store.exception.SaleProductException;
import br.com.store.model.SaleProduct;
import static br.com.store.utils.DataUtil.isNumeric;
import java.util.List;

public class ValidatorSaleProduct {

    public static void validate(List<SaleProduct> saleProducts) throws SaleProductException {
        for (SaleProduct saleProduct : saleProducts) {
            if (saleProduct == null) {
                throw new SaleProductException("Não há uma instância de venda de produto");
            }
            if (saleProduct.getSale() == null) {
                throw new SaleProductException("Venda do produto não fornecida");
            }
            if (saleProduct.getProduct() == null) {
                throw new SaleProductException("Produto não fornecido para venda");
            }
            if (saleProduct.getSequence() == null) {
                throw new SaleProductException("Sequência não fornecida para venda");
            }
            if (!isNumeric(String.valueOf(saleProduct.getSequence()))) {
                throw new SaleProductException("Sequência inválida");
            }
            if (saleProduct.getQuantity() == null) {
                throw new SaleProductException("Quantidade de produtos não fornecida para venda");
            }
            if (!isNumeric(String.valueOf(saleProduct.getQuantity()))) {
                throw new SaleProductException("Quantidade inválida");
            }
            if (saleProduct.getPrice() == null) {
                throw new SaleProductException("Preço não fornecido para venda");
            }
            if (saleProduct.getQuantity() > saleProduct.getProduct().getStock()) {
                throw new SaleProductException(""
                        + "A quantidade escolhida ultrapassa a quantidade em estoque"
                        + "\n"
                        + "Produto: " + saleProduct.getProduct().getName());
            }
        }
    }
}
