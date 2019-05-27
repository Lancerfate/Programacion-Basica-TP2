public class Automovil
{
  private double velocidad = 0.0f;
  private double horas = 0.0f;
  private String auto = "";
  private double distancia = 0.0f;
  private double aceleracion = 0.0f;

  public Automovil(String auto, double velocidad, double horas)
  {
    this.auto = auto;
    this.velocidad = velocidad;
    this.horas = horas;
  }

  public double distanciaRecorrida()
  {
    return distancia = this.velocidad * this.horas;
  }

  public String toString()
  {
    return ("La velocidad de este " + auto + "es de " + velocidad + "km/h y la distancia recorrida en " + horas + "hs es de " + distancia + "km.");
  }
}
