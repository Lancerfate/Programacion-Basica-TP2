public class SistemaPlanetario
{
  private double masa = 0.0f;
  private double densidad = 0.0f;
  private double diametro = 0.0f;
  private double distanciaDelSol = 0.0f;
  private String nombrePlaneta = "";
  private double numeroIdentificador = 0.0f;
  private double fuerzaDeAtraccion = 0.0f;
  private double constanteGravitacionUniversal = 0.667f;

  public SistemaPlanetario(String nombrePlaneta, double masa, double densidad, double diametro, double distanciaDelSol, double numeroIdentificador)
  {
    this.nombrePlaneta = nombrePlaneta;
    this.masa = masa;
    this.densidad = densidad;
    this.diametro = diametro;
    this.distanciaDelSol = distanciaDelSol;
    this.numeroIdentificador = numeroIdentificador;
  }

  public String getNombre()
  {
    return this.nombrePlaneta;
  }

  public double getMasa()
  {
    return this.masa;
  }

  public double getDensidad()
  {
    return this.densidad;
  }

  public double getDiametro() {
    return this.diametro;
  }


  public double atraccionGravitatoria(double masa1, double masa2, double distanciaEntrelosCuerpos)
  {
    return this.fuerzaDeAtraccion = constanteGravitacionUniversal * ((masa1 * masa2)/distanciaEntrelosCuerpos);
  }

}
