public class Coche
{
  private int ceroKm = 0;
  private int anoActual = 2019;
  private static int cantidadCoches = 0;
  private String marca = "";
  private String modelo = "";
  private int kilometros = 0;
  private int ano = 0;
  private double precio = 0.0;
  private int antiguedad = 0;

  public Coche(String marca, String modelo, double precio)
  {
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
    this.kilometros = 0;
    this.ano = 1999;
  }
  public Coche(String marca, String modelo, int kilometros, int ano , double precio)
  {
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
    this.kilometros = kilometros;
    this.ano = ano;
  }

  public int getCantidadCoches()
  {
    return this.cantidadCoches;
  }

  public void setKilometros(int kilometros)
  {
    this.kilometros = kilometros;
  }

  public void setPrecio(int precio)
  {
    this.precio = precio;
  }

  public double getPrecio()
  {
    return this.precio;
  }

  public int calcularAntiguedad()
  {
    return antiguedad = anoActual - ano;
  }

  public int getKilometros()
  {
    return this.kilometros;
  }
  public String toString()
  {
    return("La marca del coche es " + this.marca + ". El modelo es " + this.modelo + ". Recorrio " + this.kilometros + "km. Sale " + this.precio + "$ y es del año: " + this.ano);
  }
}
