public class EjemploDeVida {
public static void main (String args []) {
Persona primeraPersona= new Persona ("Sofia", "Mujer", 38432153, 2.8, 0.50);
System.out.println (primeraPersona.toString ());
primeraPersona.alimentar (1.0);
primeraPersona.crecer (0.5);
primeraPersona.cumplirAnos ();
System.out.println (primeraPersona.toString ());
}
}