public class MovimientoRectilineoUniforme
{
  public static void main(String[] args)
  {
    Automovil miniCopper = new Automovil("miniCopper", 120, 0.3333333333 );
    Automovil ferrari = new Automovil("ferrari", 200, 0.6666666667);
    Automovil fitito = new Automovil("fitito", 40, 2);

    System.out.println(miniCopper.toString());
    miniCopper.distanciaRecorrida();
    System.out.println(miniCopper.toString());
    System.out.println(fitito.toString());
    fitito.distanciaRecorrida();
    System.out.println(fitito.toString());

  }
}
