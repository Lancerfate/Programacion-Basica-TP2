public class DiscoRigido
{
  private double tamanio = 0.0f;
  private double dvd = 4.5f;
  private double blueRay = 15.0f;
  private double conversor = 0.0;
  private double tamanioDvd = 0.0;
  private double tamanioBlueRay = 0.0;
  private String nombre = "";

  public DiscoRigido(String nombre ,double tamanio)
  {
    this.nombre = nombre;
    this.tamanio = tamanio;
  }

  public double cuantosDvd()
  {
    conversor = tamanio * 1024 / 1;
    return tamanioDvd = conversor / dvd;

  }
  public double cuantosBlueRay()
  {
    conversor = tamanio * 1024 / 1;
    return tamanioBlueRay = conversor / blueRay;
  }
  public String toString()
  {
    return ("El " + nombre + " de " + tamanio +"TB equivale a " + tamanioDvd + " dvds y a " + tamanioBlueRay + " blueRays");
  }
}
