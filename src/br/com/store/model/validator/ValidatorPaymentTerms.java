package br.com.store.model.validator;

import br.com.store.exception.PaymentTermsException;
import br.com.store.model.PaymentTerms;

public class ValidatorPaymentTerms {

    public static void validate(PaymentTerms paymentTerms) throws PaymentTermsException {
        if (paymentTerms == null) {
            throw new PaymentTermsException("Não há uma instância de forma de pagamento");
        }
        if (paymentTerms.getName() == null || paymentTerms.getName().trim().isEmpty() || "".equals(paymentTerms.getName())) {
            throw new PaymentTermsException("Forma de pagamento não fornecido para venda");
        }
        if (paymentTerms.getName().length() > 45) {
            throw new PaymentTermsException("Forma de pagamento não pode ter mais de 45 caracteres");
        }

    }

}
