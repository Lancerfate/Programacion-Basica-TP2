public class Cochesitos
{
  public static void main(String[] args)
  {
    Coche polo = new Coche("Volkswagen", "Polo", 120000.00);
    Coche amarok = new Coche("Volkswagen", "Amarok", 170000, 2013, 270000.00);
    Coche milQuinientos = new Coche("Dodge", "1500", 90000.00);

    System.out.println(polo.toString());
    polo.setKilometros(1000);
    System.out.println(polo.toString());
    System.out.println(amarok.toString());
    System.out.println(milQuinientos.toString());
    milQuinientos.calcularAntiguedad();
    milQuinientos.setPrecio(1);
    milQuinientos.getPrecio();
    System.out.println(milQuinientos.toString());
  }
}
