package com.curso.reactive.service;

import com.curso.reactive.model.Usuario;
import com.curso.reactive.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository userRepository;

  @Override
  public Flux<Usuario> findAll() {
    return userRepository.findAll();
  }
}
