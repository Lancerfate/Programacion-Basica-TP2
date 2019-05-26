public class Calculadora
{
  private double operador1 = 0;
  private double operador2 = 0;
  private double resultado = 0;

  public Calculadora()
  {
    operador1 = 4;
    operador2 = 2;
  }

  public Calculadora(double operador1, double operador2)
  {
    this.operador1 = operador1;
    this.operador2 = operador2;
  }

  public double sumar()
  {
    return resultado = operador1 + operador2;
  }

  public double sumar(double operador1, double operador2)
  {
    return resultado = operador1 + operador2;
  }

  public double restar()
  {
    return resultado = operador1 - operador2;
  }

  public double restar(double operador1, double operador2)
  {
    return resultado = operador1 - operador2;
  }

  public double multiplicar()
  {
    return resultado = operador1 * operador2;
  }

  public double multiplicar(double operador1, double operador2)
  {
    return resultado = operador1 * operador2;
  }

  public double dividir()
  {
    return resultado = operador1 / operador2;
  }

  public double dividir(double numerador, double divisor)
  {
    return resultado = numerador / divisor;
  }

  public String toString()
  {
    return ("El operador1 es : " + this.operador1 + ". El operador2 es: " + this.operador2);
  }
}
