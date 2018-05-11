package br.com.store.service;

import br.com.store.db.dao.DAODocumentType;
import br.com.store.exception.DataSourceException;
import br.com.store.exception.DocumentTypeException;
import br.com.store.model.DocumentType;
import br.com.store.model.validator.ValidatorDocumentType;
import java.util.List;

public class ServiceDocumentType {

    private static final ServiceDocumentType INSTANCE = new ServiceDocumentType();

    private ServiceDocumentType() {
    }

    public static ServiceDocumentType getInstance() {
        return INSTANCE;
    }

    public void insert(DocumentType documentType) throws DocumentTypeException, DataSourceException {
        ValidatorDocumentType.validate(documentType);

        try {
            DAODocumentType.insert(documentType);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public void update(DocumentType documentType) throws DocumentTypeException, DataSourceException {
        ValidatorDocumentType.validate(documentType);
        try {
            DAODocumentType.update(documentType);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws DocumentTypeException, DataSourceException {
        try {
            DAODocumentType.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<DocumentType> list() throws DataSourceException {
        List<DocumentType> list = null;
        try {
            list = DAODocumentType.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public List<DocumentType> search(String name) throws DocumentTypeException, DataSourceException {
        try {
            if (name == null || "".equals(name)) {
                return DAODocumentType.list();
            } else {
                return DAODocumentType.search(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public DocumentType get(Integer id) throws DocumentTypeException, DataSourceException {
        try {
            return DAODocumentType.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

}
