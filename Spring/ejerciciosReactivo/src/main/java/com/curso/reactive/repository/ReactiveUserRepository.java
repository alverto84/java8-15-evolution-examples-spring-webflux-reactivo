package com.curso.reactive.repository;

import com.curso.reactive.model.Usuario;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class ReactiveUserRepository implements UserRepository {

  private static List<Usuario> users;

  static {
    var u1 = new Usuario("Alberto", "Developer", 36, LocalDate.of(1984, 10, 16));
    var u2 = new Usuario("Daniel", "Developer", 15, LocalDate.of(2005, 5, 4));
    var u3 = new Usuario("Enrique", "Architect", 43, LocalDate.of(1978, 2, 8));

    users = List.of(u1, u2, u3);
  }

  @Override
  public Flux<Usuario> findAll() {
    //simulate stream data with 2 seconds delay.
    return Flux.fromIterable(users).delayElements(Duration.ofSeconds(2));
  }

}
