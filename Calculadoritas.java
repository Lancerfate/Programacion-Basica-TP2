public class Calculadoritas
{
  public static void main(String[] args)
  {
    Calculadora cuenta1 = new Calculadora();
    Calculadora cuenta2 = new Calculadora(6, 2);

    System.out.println(cuenta1.toString());
    System.out.println(cuenta2.toString());

    System.out.println("4 + 2 es: " + cuenta1.sumar());
    System.out.println("9 + 8 es: " + cuenta2.sumar(9, 8));
    System.out.println("4 * 2 es: " + cuenta1.multiplicar());
    System.out.println("6 * 2 es: " + cuenta2.multiplicar());
    System.out.println("4 / 2 es: " + cuenta1.dividir());
    System.out.println("6 / 2 es: " + cuenta2.dividir());
    System.out.println("12 / 6 es: " + cuenta1.dividir(12, 6));

  }
}
