public class ManejoAscensor
{
  public static void main (String args [])
  {
    Ascensor consorcioCallePeron = new Ascensor(4, 150.0); //punto A: creado el objeto ascensor del
    Persona persona1 = new Persona("Mauricio", "hombre",  33999776, 60, 1.70); //punto e
    Persona persona2 = new Persona("Eugenia", "mujer",  2154215,    80,  1.69);
    Persona persona3 = new Persona("Marcos", "hombre",  2315321,  90, 1.75);



    System.out.println("el piso actual es " + consorcioCallePeron.getPisoActual()); //punto b: imprime por pantalla el piso actual (es 0)

    consorcioCallePeron.abrirPuerta(); //punto f: abrir puerta

    consorcioCallePeron.ingresar(persona1); //punto f: suben las personas
    consorcioCallePeron.ingresar(persona2);
    consorcioCallePeron.ingresar(persona3);
    consorcioCallePeron.salir(persona3); // punto g: ascensor demasiado pesado. baja persona3

    consorcioCallePeron.cerrarPuerta();

    for(int i = 0; i < 3; i++ )
    {
      consorcioCallePeron.subir(); //punto c y d: este metodo hace subir al ascensor 1 piso
    }

    System.out.println("el piso actual es " + consorcioCallePeron.getPisoActual());



  }
}
