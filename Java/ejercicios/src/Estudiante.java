import java.time.LocalDate;

public non-sealed class Estudiante extends Usuario {

  private String collegue;

  public Estudiante(String collegue) {
    this.collegue = collegue;
  }

  public Estudiante(String nombre, String rol, Integer edad, LocalDate fechaNac, String collegue) {
    super(nombre, rol, edad, fechaNac);
    this.collegue = collegue;
  }

  public String getCollegue() {
    return collegue;
  }

  public void setCollegue(String collegue) {
    this.collegue = collegue;
  }
}

