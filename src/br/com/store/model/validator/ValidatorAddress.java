package br.com.store.model.validator;

import br.com.store.exception.AddressException;
import br.com.store.model.Address;

public class ValidatorAddress {

    public static void validate(Address address) throws AddressException {

        if (address == null) {
            throw new AddressException("Não há uma instância de endereço");
        }
        if (address.getPublicPlaceType() == null) {
            throw new AddressException("Tipo de logradouro não fornecido");
        }
        if (address.getCity() == null) {
            throw new AddressException("Cidade não fornecida");
        }
        if (address.getPublicPlace() == null || address.getPublicPlace().trim().isEmpty() || "".equals(address.getPublicPlace())) {
            throw new AddressException("Logradouro não fornecido");
        }
        if (address.getPublicPlace().length() > 100) {
            throw new AddressException("Logradouro não pode ter mais de 100 caracteres");
        }
        if(!isNumeric(String.valueOf(address.getNumber()))){
            throw new AddressException("Número da residência inválido");
        }
        if (address.getComplement().length() > 45) {
            throw new AddressException("Complemento não pode ter mais de 45 caracteres");
        }
        if (address.getDistrict() == null || address.getDistrict().trim().isEmpty() || "".equals(address.getDistrict())) {
            throw new AddressException("Distrito não fornecido");
        }
        if (address.getDistrict().length() > 45) {
            throw new AddressException("Distrito não pode ter mais de 45 caracteres");
        }
        if (address.getZipcode() == null ) {
            throw new AddressException("Código postal do cliente não fornecido");
        }
        if(!isNumeric(String.valueOf(address.getZipcode()))){
            throw new AddressException("Código postal inválido");
        }

    }
    //Proof of the value is numerical
    static boolean isNumeric(String dado){
                try {
            if (!dado.isEmpty()) {
                Integer.parseInt(dado);
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
