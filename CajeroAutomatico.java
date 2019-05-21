public class CajeroAutomatico
{
  public static void main(String[] args)
  {
    Cuenta miCuenta = new Cuenta("Matias"); //punto a: creado objeto cuenta

    System.out.println(miCuenta.toString()); //punto b: aparece que tengo un saldo de 0pe

    miCuenta.depositar(100); //punto c: deposita 100pe

    System.out.println(miCuenta.toString()); //punto c: aparece que tengo un saldo de 100pe

    miCuenta.retirar(50); //punto d: retira 50pe

    System.out.println(miCuenta.toString());
  }
}
