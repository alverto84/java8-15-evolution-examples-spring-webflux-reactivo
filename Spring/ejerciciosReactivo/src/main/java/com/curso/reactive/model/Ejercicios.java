package com.curso.reactive.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Ejercicios {

  public static void main(String[] args) {

    var u1 = new Usuario("Alberto", "Developer", 36, LocalDate.of(1984, 10, 16));
    var u2 = new Usuario("Daniel", "Developer", 15, LocalDate.of(2005, 5, 4));
    var u3 = new Usuario("Enrique", "Architect", 43, LocalDate.of(1978, 2, 8));

    var usuarios = Arrays.asList(u1, u2, u3);

    System.out.println("Mayores:");
    var adultos = mayoresEdad(usuarios);
    adultos.forEach(u -> System.out.println(u));

    System.out.println("Menores:");
    var menores = menoresEdad(usuarios);
    menores.forEach(u -> System.out.println(u));

    System.out.println("Dia de nacimiento:");
    var diasNac = diasSemNac(usuarios);
    menores.forEach(u -> System.out.println(u));

    System.out.println("Proximos jueves:");
    var proxJueves = siguienteJueves(usuarios);
    proxJueves.forEach(u -> System.out.println(u));

    //Streams
    System.out.println("======================================");
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
    try {
      engine.eval(new FileReader("js/streams.js"));
    } catch (FileNotFoundException | ScriptException e) {
      e.printStackTrace();
    }

  }

  public static List<Usuario> mayoresEdad(List<Usuario> usuarios) {
    return usuarios.stream().filter(u -> u.getEdad() >= 18).collect(Collectors.toList());
  }

  public static List<Usuario> menoresEdad(List<Usuario> usuarios) {
    return usuarios.stream().filter(u -> u.getEdad() < 18).collect(Collectors.toList());
  }

  public static List<DayOfWeek> diasSemNac(List<Usuario> usuarios) {
    return usuarios.stream().map(Usuario::getFechaNac).map(f -> f.getDayOfWeek()).collect(Collectors.toList());
  }

  public static List<LocalDate> siguienteJueves(List<Usuario> usuarios) {
    TemporalAdjuster temporalAdjuster = TemporalAdjusters.next(DayOfWeek.THURSDAY);
    return usuarios.stream().map(Usuario::getFechaNac).map(f -> f.with(temporalAdjuster)).collect(Collectors.toList());
  }
}
