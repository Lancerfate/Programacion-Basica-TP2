public class PruebaDiscoRigido
{
   public static void main(String[] args)
   {
     DiscoRigido seagate = new DiscoRigido("seagate", 10);
     DiscoRigido hitachi = new DiscoRigido("hitachi", 20);
     DiscoRigido westernDigital = new DiscoRigido("westernDigital", 32);
     DiscoRigido toshiba = new DiscoRigido("toshiba", 48);

     System.out.println(seagate.toString());
     seagate.cuantosDvd();
     seagate.cuantosBlueRay();
     System.out.println(seagate.toString());
     westernDigital.cuantosDvd();
     westernDigital.cuantosBlueRay();
     System.out.println(westernDigital.toString());
   }
}
