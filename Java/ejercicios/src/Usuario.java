import java.time.LocalDate;

public sealed class Usuario permits Estudiante{

  private String nombre;
  private String rol;
  private Integer edad;
  private LocalDate fechaNac;

  public Usuario() {
  }

  public Usuario(String nombre, String rol, Integer edad, LocalDate fechaNac) {
    this.nombre = nombre;
    this.rol = rol;
    this.edad = edad;
    this.fechaNac = fechaNac;
  }

  @Override
  public String toString() {
    return "Usuario{" +
        "nombre='" + nombre + '\'' +
        ", rol='" + rol + '\'' +
        ", edad=" + edad +
        ", fechaNac=" + fechaNac +
        '}';
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRol() {
    return rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  public LocalDate getFechaNac() {
    return fechaNac;
  }

  public void setFechaNac(LocalDate fechaNac) {
    this.fechaNac = fechaNac;
  }
}
