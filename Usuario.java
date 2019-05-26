public class Usuario
{
  private String usuario = "";
  private String contrasenia = "";
  private String nombre = "";
  private String apellido = "";
  private int dni = 0;
  private int edad = 0;

  public Usuario(String usuario, String contrasenia, String nombre, String apellido, int dni, int edad)
  {
    this.usuario = usuario;
    this.contrasenia = contrasenia;
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.edad = edad;
  }

  public String getUsuario()
  {
    return this.usuario;
  }

  public String getContrasenia()
  {
    return this.contrasenia;
  }

  public String setContrasenia(String contrasenia)
  {
    return this.contrasenia = contrasenia; 
  }

  public void setEdades(int edad)
  {
    this.edad = edad;
  }
  public int getEdad()
  {
    return this.edad;
  }

}
