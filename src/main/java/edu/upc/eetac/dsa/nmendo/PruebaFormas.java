package edu.upc.eetac.dsa.nmendo;

public class PruebaFormas {
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    	Forma[] s = new Forma[3];
    	s[0] = new Forma();
    	// Circulo es tambien una Forma
    	s[1] = new Circulo();
    	// Cuadrado es tambien una Forma
    	s[2] = new Cuadrado();
    	
    	for(int i = 0; i < s.length; i++)
    	{
    		s[i].queEs();
    	}
    	
    }

}
