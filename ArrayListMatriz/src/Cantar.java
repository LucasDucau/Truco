import java.util.ArrayList;



public class Cantar {
	
	
	
	public void envido (Manos mano)
	{
		
		int envidoCarta0=mano.arrayMano.get(0).getNumero();
		int envidoCarta1=mano.arrayMano.get(1).getNumero();
		int envidoCarta2=mano.arrayMano.get(2).getNumero();
		
		int[] arrayEnvido = new int[] {envidoCarta0,envidoCarta1,envidoCarta2};
		
		normalizarFiguras(arrayEnvido);
		
		
		
		
		
		
		int envidoTotal=0;
		int envidoBase=20;
		
		//FLOR
		
		if(mano.arrayMano.get(0).getNombre().contentEquals(mano.arrayMano.get(1).getNombre()) && mano.arrayMano.get(1).getNombre().contentEquals(mano.arrayMano.get(2).getNombre()))
			
		{
			System.out.println("flor");
			if(envidoCarta0>envidoCarta1)
			{
				if(envidoCarta1>envidoCarta2)
				{
					envidoTotal=envidoBase+envidoCarta0+envidoCarta1;
					System.out.println("El envido es: " +envidoTotal);
				}
				else
				{
					envidoTotal=envidoBase+envidoCarta0+envidoCarta2;
					System.out.println("El envido es: " +envidoTotal);
				}
				
			}
			else if(envidoCarta1>envidoCarta0)
			{
				if(envidoCarta0>envidoCarta2)
				{
					envidoTotal=envidoBase+envidoCarta1+envidoCarta0;
					System.out.println("El envido es: " +envidoTotal);
				}
				else
				{
					envidoTotal=envidoBase+envidoCarta1+envidoCarta2;
					System.out.println("el envido es: " +envidoTotal);
				}
			}
			else
			{
				if(envidoCarta0>envidoCarta1)
				{
					envidoTotal=envidoBase+envidoCarta2+envidoCarta0;
					System.out.println("el envido es: " +envidoTotal);
				}
				else {
					envidoTotal=envidoBase+envidoCarta2+envidoCarta1;
					System.out.println("el envido es: " +envidoTotal);
				}
			}
			
			
			
		}
	}
	
	public void normalizarFiguras (int[] arrayEnvido)
	{
		
		for (int i=0;i<arrayEnvido.length;i++)
		{
			if(arrayEnvido[i]>=10)
			{
				arrayEnvido[i]=0;
			}
		}
		

		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
