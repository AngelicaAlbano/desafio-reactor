package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

import java.util.List;

public class Question2 {

  /*
  Recebe uma lista de usuários e retorna a quantidade de usuários admin
   */
  public Mono<Long> countAdmins(final List<User> users) {
    return Mono.justOrEmpty((long) users.stream().filter(User::isAdmin).toList().size());
  }
}
