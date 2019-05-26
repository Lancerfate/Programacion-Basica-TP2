public class Usuaritios
{
  public static void main(String[] args)
  {
    Usuario anibal = new Usuario("anibal123", "132f", "Anibal", "Rodriguez", 35744936, 56);
    Usuario agustin = new Usuario("nomoresorrow", "nicolai2", "Agustin", "Jimenez", 34744936, 58);
    Usuario zois = new Usuario("zitkhel", "potatou", "Zois", "Bellone", 24744936, 2);

    System.out.println(anibal.getUsuario());
    System.out.println(agustin.getContrasenia());
    System.out.println(zois.getContrasenia());
    zois.setContrasenia("GgNo3h5");
    System.out.println(zois.getContrasenia());
    System.out.println(anibal.getEdad());
    anibal.setEdades(45);
    System.out.println(anibal.getEdad());

  }
}
