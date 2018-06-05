package br.com.store.service;

import br.com.store.db.dao.DAOPaymentTerms;
import br.com.store.exception.DataSourceException;
import br.com.store.exception.PaymentTermsException;
import br.com.store.model.PaymentTerms;
import br.com.store.model.validator.ValidatorPaymentTerms;
import java.util.List;


public class ServicePaymentTerms {
    
    private static final ServicePaymentTerms INSTANCE = new ServicePaymentTerms();

    private ServicePaymentTerms() {
    }

    public static ServicePaymentTerms getInstance() {
        return INSTANCE;
    }

    public void insert(PaymentTerms paymentTerms) throws PaymentTermsException, DataSourceException {
        ValidatorPaymentTerms.validate(paymentTerms);

        try {
            DAOPaymentTerms.insert(paymentTerms);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public List<PaymentTerms> list() throws DataSourceException {
        List<PaymentTerms> list = null;
        try {
            list = DAOPaymentTerms.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public void update(PaymentTerms paymentTerms) throws PaymentTermsException, DataSourceException {

        ValidatorPaymentTerms.validate(paymentTerms);

        try {

            DAOPaymentTerms.update(paymentTerms);
            return;
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<PaymentTerms> search(String name) throws DataSourceException {
        try {

            if (name == null || "".equals(name)) {
                return DAOPaymentTerms.list();
            } else {
                return DAOPaymentTerms.search(name);
            }
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public PaymentTerms get(Integer id) throws DataSourceException {
        try {

            return DAOPaymentTerms.get(id);
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws DataSourceException {
        try {
            DAOPaymentTerms.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }
    
}
