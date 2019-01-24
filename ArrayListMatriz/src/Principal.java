import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Principal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

 
		ArrayList<mazoDeCartas> arrayMazo = new ArrayList<mazoDeCartas>();
		
		int quienEsMano=0;
		//creacion del mazo
		
		llenarArray(arrayMazo," de Basto");
		llenarArray(arrayMazo," de Oro");
		llenarArray(arrayMazo," de Espada");
		llenarArray(arrayMazo," de Copa");
		asignarValores(arrayMazo);
		Collections.shuffle(arrayMazo);
		//puntos
		

		
		
		mazoDeCartas cartaTest0 = new mazoDeCartas(2," de Basto",9);
		mazoDeCartas cartaTest1 = new mazoDeCartas(2," de Espada",9);
		mazoDeCartas cartaTest2 = new mazoDeCartas(12," de Espada", 7);
		
		mazoDeCartas cartaTest3= new mazoDeCartas(2," de Copa",9);
		mazoDeCartas cartaTest4 = new mazoDeCartas(2," de Oro", 9);
		mazoDeCartas cartaTest5 = new mazoDeCartas(12," de Basto", 7);
		
		
		
		

		
		Manos manoPar1 = new Manos(arrayMazo.get(0),arrayMazo.get(2),arrayMazo.get(4),0);
		Manos manoImpar1 = new Manos(arrayMazo.get(1), arrayMazo.get(3), arrayMazo.get(5),1);
		
		Manos manoTest = new Manos(cartaTest0,cartaTest1,cartaTest2,0);
		Manos manoTest1 = new Manos(cartaTest3,cartaTest4,cartaTest5,1);
		
		
	//	Cantar.envido(manoTest);
		
		
		
		
//		System.out.println("Mano Par");
//		manoPar1.mostrarMano();
//		System.out.println("Mano Impar");
//		manoImpar1.mostrarMano();
		

//		
		jugar(manoTest,manoTest1);
		manoTest.esMano++;
		manoTest1.esMano++;
		
		
		


	//	jugar(manoPar1,manoImpar1);
		
		
		
//	System.out.println();
//		for (int contador=0;contador<manoPar1.arrayMano.size();contador++)
//		{
//			System.out.println(manoPar1.arrayMano.get(contador).Devolver());
//		}
		
		
			
		
		
		
		
		
//	for(int i=0;i<arrayMazo.size();i++)
//		{
//			System.out.println(arrayMazo.get(i).Devolver());
//		}
//	
//		
		


	}

public static void jugar(Manos manoPar1, Manos manoImpar1)
{
	
	int puntosPar=0; 
	int puntosImpar = 0;
	int jugadaPar, jugadaImpar;
	int rondasPar=0;
	int rondasImpar=0;
	boolean esParda=false;
	boolean dobleParda=false;
	String respuestaCantar;
	int[] quiero= new int []{0,1};
	int resolucionEnvido;
	
	
	
	
	Scanner scan = new Scanner(System.in);
	
	
	
	System.out.println("Mano Par");
	manoPar1.mostrarMano();
	System.out.println("Mano Impar");
	manoImpar1.mostrarMano();

	while(rondasPar<2 && rondasImpar<2)
	{
	//Pedir jugada par
	while(true)
	{
		
		if(rondasPar==0 && rondasImpar==0)
		{
			System.out.println("queres cantar envido");
			
			Cantar.envido(manoPar1, manoImpar1, quiero);
			
			
			
			
		}
		
		System.out.println("ingrese jugada par");
		jugadaPar=scan.nextInt();
		if(manoPar1.arrayMano.get(jugadaPar).isFueJugada()==true)
		{
			System.out.println("esa carta ya fue jugada");
		}
		else
		{
			manoPar1.arrayMano.get(jugadaPar).setFueJugada(true);
			System.out.println("el jugador par juega la carta: " +manoPar1.arrayMano.get(jugadaPar).getNumero() + manoPar1.arrayMano.get(jugadaPar).getNombre());
			break;
		}
	}
	

	//pedir jugada impar	
	while(true)
	{
		System.out.println("ingrese jugada impar");
		jugadaImpar=scan.nextInt();
		if(manoImpar1.arrayMano.get(jugadaImpar).isFueJugada()==true)
		{
			System.out.println("esa carta ya fue jugada");
		}
		else
		{ 
			manoImpar1.arrayMano.get(jugadaImpar).setFueJugada(true);
			System.out.println("el jugador impar juega la carta: " +manoImpar1.arrayMano.get(jugadaImpar).getNumero() + manoImpar1.arrayMano.get(jugadaImpar).getNombre());
			break;
		}
	}
		
		
		if (dobleParda==true){
			if(manoPar1.arrayMano.get(jugadaPar).getValor() > manoImpar1.arrayMano.get(jugadaImpar).getValor())
			{
				System.out.println("el jugador par gana la ronda: ");
				rondasPar++;
			}
			else if	(manoPar1.arrayMano.get(jugadaPar).getValor() < manoImpar1.arrayMano.get(jugadaImpar).getValor())
			{
				System.out.println("el jugador impar gana la ronda: ");
				rondasImpar++;	
			}
			else
			{
				System.out.println("triple parda, gana el jugador que fue mano");
				if(quienEsMano%2==0)
				{
					rondasPar++;
				}
				else
				{
					rondasImpar++;
				}
			}
			
		}
		
		
		
		else if(esParda==true) {
			if(manoPar1.arrayMano.get(jugadaPar).getValor() > manoImpar1.arrayMano.get(jugadaImpar).getValor())
			{
				System.out.println("el jugador par gana la ronda: ");
				rondasPar++;
			}
			else if	(manoPar1.arrayMano.get(jugadaPar).getValor() < manoImpar1.arrayMano.get(jugadaImpar).getValor())
			{
				System.out.println("el jugador impar gana la ronda: ");
				rondasImpar++;	
			}
			else {
				System.out.println("doble empate");
				dobleParda=true;
				
				
				
			}
			
			
		}
		else 
		{
			
		
		//quien gana
		if(manoPar1.arrayMano.get(jugadaPar).getValor() > manoImpar1.arrayMano.get(jugadaImpar).getValor())
		{
			System.out.println("el jugador par gana la ronda: ");
			rondasPar++;
		}
		else if	(manoPar1.arrayMano.get(jugadaPar).getValor() < manoImpar1.arrayMano.get(jugadaImpar).getValor())
		{
			System.out.println("el jugador impar gana la ronda: ");
			rondasImpar++;			
		}
		else {
			
			System.out.println("Parda");	
			esParda=true;
			rondasPar++;
			rondasImpar++;
		}
		}

			
				
	
			
	

	
	}
	
	
	
	
	
	
	
	

	
	

	
}
public static int peleaEnvidos(Manos manoTest, Manos manoTest1)
{
	int envidoPar=Cantar.resolverEnvido(manoTest);
	int envidoImpar=Cantar.resolverEnvido(manoTest1);
	int resultado;
	
	if (envidoPar>envidoImpar)
	{
		resultado=500;
	}
	else if(envidoImpar>envidoPar)
	{
		resultado=-500;
	}
	else
	{
		resultado=0;
	}
	
	return resultado;
	
	
	
}


public static void llenarArray(ArrayList arrayMazo, String palo) 
{
int valorDefault=-500;
for (int i=1;i<13;i++) {
		
	if (i==8)
	{
		i=10;
	}
		arrayMazo.add(new mazoDeCartas(i,palo,valorDefault));
		
		
	}
	

}

public static void asignarValores(ArrayList<mazoDeCartas> arrayMazo)
{
	// 4
	arrayMazo.get(3).setValor(1);
	arrayMazo.get(13).setValor(1);
	arrayMazo.get(23).setValor(1);
	arrayMazo.get(33).setValor(1);
	// 5
	arrayMazo.get(4).setValor(2);
	arrayMazo.get(14).setValor(2);
	arrayMazo.get(24).setValor(2);
	arrayMazo.get(34).setValor(2);
	// 6
	arrayMazo.get(5).setValor(3);
	arrayMazo.get(15).setValor(3);
	arrayMazo.get(25).setValor(3);
	arrayMazo.get(35).setValor(3);
	// 7 malos
	arrayMazo.get(6).setValor(4);
	arrayMazo.get(36).setValor(4);
	// sotas
	arrayMazo.get(7).setValor(5);
	arrayMazo.get(17).setValor(5);
	arrayMazo.get(27).setValor(5);
	arrayMazo.get(37).setValor(5);
	// caballos
	arrayMazo.get(8).setValor(6);
	arrayMazo.get(18).setValor(6);
	arrayMazo.get(28).setValor(6);
	arrayMazo.get(38).setValor(6);
	// reyes
	arrayMazo.get(9).setValor(7);
	arrayMazo.get(19).setValor(7);
	arrayMazo.get(29).setValor(7);
	arrayMazo.get(39).setValor(7);
	// anchos falsos
	arrayMazo.get(10).setValor(8);
	arrayMazo.get(30).setValor(8);
	// 2
	arrayMazo.get(1).setValor(9);
	arrayMazo.get(11).setValor(9);
	arrayMazo.get(21).setValor(9);
	arrayMazo.get(31).setValor(9);
	// 3
	arrayMazo.get(2).setValor(10);
	arrayMazo.get(12).setValor(10);
	arrayMazo.get(22).setValor(10);
	arrayMazo.get(32).setValor(10);
	// 7 de oro
	arrayMazo.get(16).setValor(11);
	// 7 de espada
	arrayMazo.get(26).setValor(12);
	// ancho de basto
	arrayMazo.get(0).setValor(13);
	// ancho de espada
	arrayMazo.get(20).setValor(14);
	//System.out.println("valores asignados");
}

}


