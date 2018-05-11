package br.com.store.model.validator;

import br.com.store.exception.DocumentTypeException;
import br.com.store.model.DocumentType;

public class ValidatorDocumentType {
    
    public static void validade(DocumentType documentType) throws DocumentTypeException {

        if (documentType == null) {
            throw new DocumentTypeException("Não há uma instância de tipo de documento");
        }
    }
    
}
