package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

public class Question3 {

  /*
  Verifica se o usuário passado é valido, se sim, retorna void, se não dispara uma exception
  regra: usuário é válido quando sua senha possui 8 ous mais caracteres)
   */
  public Mono<Void> userIsValid(final User user) {
    if (user == null || user.password().length() <= 8) {
      return Mono.error(new Exception("Invalid user"));
    } else {
      return Mono.empty();
    }
  }
}
