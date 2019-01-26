import java.util.ArrayList;
import java.util.Scanner;


public class Cantar {
	
	
	
	
	
	
	public static void envido(Manos manoCanta, Manos manoResponde,String canto)
	{
		boolean invertir=false;
		boolean envidoEnvidoFueCantado=false;
		boolean realEnvidoFueCantado=false;
		boolean faltaEnvidoFueCantado=false;
		int[] quiero = new int[] {0,1};
		Scanner scan = new Scanner(System.in);
		String respuesta="test";
		int envidoCanta;
		int envidoResponde;
		
		
		if(canto.contentEquals("envido"))
		{
			quiero[0]+=2;
		}
		
		else if(canto.contentEquals("real envido"))
		{
			quiero[0]+=3;
			envidoEnvidoFueCantado=true;
			realEnvidoFueCantado=true;
		}
		else if(canto.contentEquals("falta envido"))
		{
			envidoEnvidoFueCantado=true;
			realEnvidoFueCantado=true;
			faltaEnvidoFueCantado=true;
		}
		
		
		
		
		System.out.println("te cantaron el tanto");
		
		while(!respuesta.contentEquals("quiero") && !respuesta.contentEquals("no quiero"))
		{

			respuesta=scan.nextLine();
			if(respuesta.contentEquals("envido") && envidoEnvidoFueCantado==false)
			{
				invertir=!invertir;
				quiero[0]+=2;
				envidoEnvidoFueCantado=true;	
			}
				
			
			
			
				
		}
		
		

		

			if(respuesta.contentEquals("no quiero"))
		{
			if(invertir==true)
			{
				manoResponde.aplicarPuntos(quiero[1]);
			}
			else {
			
			manoCanta.aplicarPuntos(quiero[1]);
			}
		}
			else
		{
			envidoCanta=resolverEnvido(manoCanta);
			envidoResponde=resolverEnvido(manoResponde);
			quienGana(manoCanta,manoResponde,envidoCanta,envidoResponde,quiero[0]);
		}
		


		
		
		
		
		
		
		
		
		
	}
	

	
	
	public static void quienGana (Manos manoCanta,Manos manoResponde,int envidoCanta, int envidoResponde,int puntos)
	{
		
		if(envidoCanta>envidoResponde)
		{
			manoCanta.aplicarPuntos(puntos);
		}
		else if (envidoResponde>envidoCanta)
		{
			manoResponde.aplicarPuntos(puntos);
		}
		else
		{
			if(manoCanta.esMano%2==0)
			{
				manoCanta.aplicarPuntos(puntos);
			}
			else
			{
				manoResponde.aplicarPuntos(puntos);
				
			}
		}
		
		
	}
	
	
	public static int resolverEnvido (Manos mano)
	{
		
		int envidoCarta0=mano.arrayMano.get(0).getNumero();
		int envidoCarta1=mano.arrayMano.get(1).getNumero();
		int envidoCarta2=mano.arrayMano.get(2).getNumero();
			

		
		int[] arrayEnvido = new int[] {envidoCarta0,envidoCarta1,envidoCarta2};
		
		arrayEnvido=normalizarFiguras(arrayEnvido);
		
		System.out.println(arrayEnvido[0]);
		System.out.println(arrayEnvido[1]);
		System.out.println(arrayEnvido[2]);
		
		
		

		
		
		
		int envidoTotal=0;
		int envidoBase=20;
		
		//FLOR
		
		if(mano.arrayMano.get(0).getNombre().contentEquals(mano.arrayMano.get(1).getNombre()) && mano.arrayMano.get(1).getNombre().contentEquals(mano.arrayMano.get(2).getNombre()))
			
		{
			System.out.println("tengo flor");//no vale nada
			//calcula el mayor envido de una mano con flor
			envidoTotal=envidoBase+Math.max(Math.max(arrayEnvido[0]+arrayEnvido[1],arrayEnvido[0]+arrayEnvido[2]),arrayEnvido[1]+arrayEnvido[2]);
			
			System.out.println("tu envido con flor es: " + envidoTotal);
			
			
			
		}
		
		//CARTA 0 = 1
		else if(mano.arrayMano.get(0).getNombre().contentEquals(mano.arrayMano.get(1).getNombre()))
		{
			
			envidoTotal=envidoBase+arrayEnvido[0]+arrayEnvido[1];
			System.out.println("el envido total es: "+ envidoTotal);
			
		}
		//CARTA 0 = 2
		else if (mano.arrayMano.get(0).getNombre().contentEquals(mano.arrayMano.get(2).getNombre()))
		{
			envidoTotal=envidoBase+arrayEnvido[0]+arrayEnvido[2];
			System.out.println("el envido total es: "+ envidoTotal);
		}
		//CARTA 1 = 2
		else if(mano.arrayMano.get(1).getNombre().contentEquals(mano.arrayMano.get(2).getNombre()))
		{
			envidoTotal=envidoBase+arrayEnvido[1]+arrayEnvido[2];
			System.out.println("el envido total es: "+ envidoTotal);
		}
		//no tenes nada pichon
		else {
			
			System.out.println("no tenes nada pichon");
			
			for(int j=0;j<arrayEnvido.length;j++)
			{
				if(arrayEnvido[j]>envidoTotal)
				{
					envidoTotal=arrayEnvido[j];
				}
				
			}
			
			System.out.println("el envido total es: "+ envidoTotal);
		}
		return envidoTotal;
		
	}
	
	
	public static int[] normalizarFiguras (int[] arrayEnvido)
	{
		
		for (int i=0;i<arrayEnvido.length;i++)
		{
			if(arrayEnvido[i]>=10)
			{
				arrayEnvido[i]=0;
			}
		}
		
		return arrayEnvido;
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
