package com.curso.reactive.service;

import com.curso.reactive.Movie;
import reactor.core.publisher.Flux;

public interface MovieService {

    Flux<Movie> findAll();

}
