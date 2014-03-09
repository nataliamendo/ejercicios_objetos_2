package edu.upc.eetac.dsa.nmendo;

public class Circulo extends Forma {
	
	@Override //para reescribir el método. NO hay que poner static porque sino estaría poniendo el de forma 
			//		Cierculo EXTENDS Forma-> obtenido a partir de la clase FORMA.
	
	public void queEs()
	{
		System.out.println("Un objeto de forma redonda");
	}

}
