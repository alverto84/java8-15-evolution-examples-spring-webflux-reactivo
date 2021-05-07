package com.curso.reactive.service;

import com.curso.reactive.model.Usuario;
import reactor.core.publisher.Flux;

public interface UserService {

  Flux<Usuario> findAll();

}
