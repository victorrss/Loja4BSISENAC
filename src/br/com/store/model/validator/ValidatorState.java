package br.com.store.model.validator;

import br.com.store.exception.StateException;
import br.com.store.model.State;

public class ValidatorState {
    
        public static void validate(State state) throws StateException {

        if (state == null) {
            throw new StateException("Não há uma instância de estado");
        }
        if (state.getAbbreviation()== null || state.getAbbreviation().trim().isEmpty() || "".equals(state.getAbbreviation())) {
            throw new StateException("Abreviação do estado não fornecida");
        }
    }
    
}
