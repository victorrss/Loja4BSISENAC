package br.com.store.model.validator;

import br.com.store.exception.DocumentTypeException;
import br.com.store.model.DocumentType;

public class ValidatorDocumentType {

    public static void validate(DocumentType documentType) throws DocumentTypeException {

        if (documentType == null) {
            throw new DocumentTypeException("Não há uma instância de tipo de documento");
        }
        if (documentType.getName() == null || documentType.getName().trim().isEmpty() || "".equals(documentType.getName())) {
            throw new DocumentTypeException("Nome do tipo de documento não fornecido");
        }
        if (documentType.getName().length() > 45) {
            throw new DocumentTypeException("Nome do tipo de documento não pode ter mais de 45 caracteres");
        }
    }

}
