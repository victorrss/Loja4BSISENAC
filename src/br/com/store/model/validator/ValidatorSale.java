package br.com.store.model.validator;

import br.com.store.exception.SaleException;
import br.com.store.model.Sale;

public class ValidatorSale {
    
        public static void validate(Sale sale) throws SaleException {
        if (sale == null) {
            throw new SaleException("Não há uma instância de venda");
        }
        if (sale.getCustomer()== null) {
            throw new SaleException("Cliente não fornecido para venda");
        }
        if (sale.getSeller()== null) {
            throw new SaleException("Vendedor não fornecido para venda");
        }
        if (sale.getPaymentTerms()== null) {
            throw new SaleException("Tipo de pagamento não fornecido para venda");
        }
        

    }
    
}
