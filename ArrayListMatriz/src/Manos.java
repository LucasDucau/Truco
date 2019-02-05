import java.util.ArrayList;

public class Manos  {
	
	
	//atributos
	private String nombre;
	private mazoDeCartas carta0;
	private mazoDeCartas carta1;
	private mazoDeCartas carta2;
	public ArrayList<mazoDeCartas> arrayMano = new ArrayList<mazoDeCartas>();
	private int puntos;
	public int esMano;
		
	
	
	

	public Manos (String nombre,mazoDeCartas carta0,mazoDeCartas carta1,mazoDeCartas carta2,int esMano)
	{
		this.carta0=carta0;
		this.carta1=carta1;
		this.carta2=carta2;
		this.esMano=esMano;
		agregarAlArray();
		this.puntos=0;
		this.nombre=nombre;
		
	}
	
	
	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	public void mostrarMano()
	{

		
		String c0=carta0.Devolver();
		String c1=carta1.Devolver();
		String c2=carta2.Devolver();
		
		System.out.printf(c0+"%n"+c1+"%n"+c2+"%n");
		
		
		
				
		
		
	}
	public void agregarAlArray()
	{
		arrayMano.add(0,carta0);
		arrayMano.add(1,carta1);
		arrayMano.add(2,carta2);
		 
	}
	public void aplicarPuntos(int numero)
	{
		
		puntos+=numero;
		//System.out.println(nombre+" tiene : " + puntos+" puntos");
	}
	public mazoDeCartas getCarta0() {
		return carta0;
	}


	public void setCarta0(mazoDeCartas carta0) {
		this.carta0 = carta0;
	}


	public mazoDeCartas getCarta1() {
		return carta1;
	}


	public void setCarta1(mazoDeCartas carta1) {
		this.carta1 = carta1;
	}


	public mazoDeCartas getCarta2() {
		return carta2;
	}


	public void setCarta2(mazoDeCartas carta2) {
		this.carta2 = carta2;
	}


	public int getEsMano() {
		return esMano;
	}


	public void setEsMano(int esMano) {
		this.esMano = esMano;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
