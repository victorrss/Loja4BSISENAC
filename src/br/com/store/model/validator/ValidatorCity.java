package br.com.store.model.validator;

import br.com.store.exception.CityException;
import br.com.store.model.City;

public class ValidatorCity {

    public static void validate(City city) throws CityException {

        if (city == null) {
            throw new CityException("Não há uma instância de Cidade");
        }
        if (city.getState() == null) {
            throw new CityException("Estado não fornecido");
        }
        if (city.getName() == null || city.getName().trim().isEmpty() || "".equals(city.getName())) {
            throw new CityException("Cidade não fornecida");
        }
        if (city.getName().length() > 45) {
            throw new CityException("Nome da cidade não pode ter mais de 45 caracteres");
        }
    }

}
