public class Radio
{
  public static void main(String[] args)
  {
    double radioCirculo = 0.0f;
    double diametroCirculo = 15.0f;
    double perimetroCirculo = 0.0f;

    radioCirculo = diametroCirculo/2;
    System.out.println("El radio del circulo es: " + radioCirculo + "cm");

    perimetroCirculo = 2 * Math.PI * radioCirculo;
    System.out.println("El perimetro del circulo es : " + perimetroCirculo + "cm cuadrados");

  }
}
