public class Planetitas
{
  public static void main(String[] args)
  {
    SistemaPlanetario tierra = new SistemaPlanetario("Tierra", 60000, 5.515, 13000, 149597887.5, 3);
    SistemaPlanetario luna = new SistemaPlanetario("Luna", 734900, 3.34, 3474, 149982271, 2.5);

    System.out.println("Nombre: " + tierra.getNombre());
    System.out.println("masa: " + tierra.getMasa());
    System.out.println("densidad: " + tierra.getDensidad());
    System.out.println("la fuerza gravitacional entre la tierra y la luna es: " + tierra.atraccionGravitatoria(tierra.getMasa(), luna.getMasa(), 384400));

  }
}
