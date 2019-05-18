public class OtrasVidasNoTanEjemplares
{
	public static void main (String [] args)
	{
		Persona mauricio= new Persona ("Mauricio", "hombre",  33999776, 70, 1.70);
		Persona marcos = new Persona ("Marcos", "hombre",  2315321,  80, 1.75);
		Persona eugenia = new Persona ("Eugenia", "mujer",  2154215,    60,  1.69);
		Persona elisa = new Persona ("Elisa", "mujer",   63215478,    150,   1.60);
		
		
		for(int i=0; i < 50; i++)
		{
			mauricio.cumplirAnos ();
			mauricio.morir();
		}
		
		for(int i=0; i < 30; i++)
		{
			marcos.cumplirAnos ();
		}
		
		for(int i=0; i < 40; i++)
		{
			eugenia.cumplirAnos ();
		}
		
		for(int i=0; i < 60; i++)
		{
			elisa.cumplirAnos ();
		}
		
		
		System.out.println (mauricio.toString ());
		System.out.println (marcos.toString ());
		System.out.println (eugenia.toString ());
		System.out.println (elisa.toString ());
	}
}