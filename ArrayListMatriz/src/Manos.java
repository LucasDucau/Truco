import java.util.ArrayList;

public class Manos  {
	
	
	//atributos
	private mazoDeCartas carta0;
	private mazoDeCartas carta1;
	private mazoDeCartas carta2;
	public ArrayList<mazoDeCartas> arrayMano = new ArrayList<mazoDeCartas>();
		
	
	
	

	public Manos (mazoDeCartas carta0,mazoDeCartas carta1,mazoDeCartas carta2)
	{
		this.carta0=carta0;
		this.carta1=carta1;
		this.carta2=carta2;
		agregarAlArray(arrayMano);
	}
	
	
	public void mostrarMano()
	{

		
		String c0=carta0.Devolver();
		String c1=carta1.Devolver();
		String c2=carta2.Devolver();
		
		System.out.printf(c0+"%n"+c1+"%n"+c2+"%n");
		
		
		
				
		
		
	}
	public void agregarAlArray(ArrayList<mazoDeCartas> arrayMano)
	{
		 arrayMano.add(carta0);
		 arrayMano.add(carta1);
		 arrayMano.add(carta2);
		 
	}

}
