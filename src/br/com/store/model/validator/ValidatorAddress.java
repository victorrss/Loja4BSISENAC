package br.com.store.model.validator;

import br.com.store.exception.AddressException;
import br.com.store.model.Address;

public class ValidatorAddress {

    public static void validade(Address address) throws AddressException {

        if (address == null) {
            throw new AddressException("Não há uma instância de endereço");
        }

        if (address.getPublicPlaceType() == null) {
            throw new AddressException("Tipo de logradouro não fornecido");
        }

        if (address.getCity() == null) {
            throw new AddressException("Cidade não fornecida");
        }

        if (address.getPublicPlace() == null || address.getPublicPlace().trim().isEmpty()) {
            throw new AddressException("Logradouro não fornecido");
        }

        if (address.getDistrict() == null || address.getDistrict().trim().isEmpty()) {
            throw new AddressException("Distrito não fornecido");
        }

        if (address.getZipcode() == null) {
            throw new AddressException("Documento do cliente não fornecido");
        }

    }

}
