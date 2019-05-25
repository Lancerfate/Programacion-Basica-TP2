public class Televisor
{
  private int volumen; //encapsulamiento
  private int canal;

  public Televisor()
  {
    this.volumen = 10;
    this.canal = 2;
  }

  public Televisor(int volumen, int canal) //atributos 2
  {
    this.volumen = volumen; //variables
    this.canal = canal;
  }

  public int getVolumen()
  {
    return this.volumen;
  }

  public void ajustarVolumen(String modo)
  {
    if(modo.equals("subir"))
    {
      volumen++;
    }
    else
    {
      volumen--;
    }
  }
  public void cambiarCanal(String modo)
  {
    if(modo.equals("subir"))
    {
      canal++;
    }
    else
    {
      canal--;
    }
  }
  public int getCanal()
  {
    return this.canal;
  }
}
