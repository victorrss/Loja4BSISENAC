package br.com.store.model.validator;

import br.com.store.exception.UserException;
import br.com.store.model.User;

public class ValidatorUser {

    public static void validate(User user) throws UserException {
        if (user == null) {
            throw new UserException("A instancia do usuário é inválida");
        }

        if (user.getLogin() == null
                || user.getLogin().trim().isEmpty()) {
            throw new UserException("Nome de usuário não fornecido");
        }

        if (user.getPassword() == null
                || user.getPassword().trim().isEmpty()) {
            throw new UserException("Senha não fornecida");
        }

    }
}
