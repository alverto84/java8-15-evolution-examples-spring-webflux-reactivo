package com.curso.reactive.repository;

import com.curso.reactive.model.Usuario;
import reactor.core.publisher.Flux;

public interface UserRepository {

    Flux<Usuario> findAll();

}
