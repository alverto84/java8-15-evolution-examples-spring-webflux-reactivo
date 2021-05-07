package com.curso.reactive.service;

import com.curso.reactive.Movie;
import com.curso.reactive.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class MovieServiceImpl implements MovieService {

  @Autowired
  MovieRepository movieRepository;

  @Override
  public Flux<Movie> findAll() {
    return movieRepository.findAll();
  }
}
