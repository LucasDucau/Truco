

public class mazoDeCartas  {

	
	//atributos
	private int numero;
	private String nombre;
	private int valor;
	private boolean fueJugada=false;
	
	public mazoDeCartas(int numero,String nombre,int valor)
	{
		
		this.numero=numero;
		this.nombre=nombre;
		this.valor=valor;
		setFueJugada(false);
		
		
		
	}
	
	

	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String Devolver()
	{
		String objetoAlTexto=
				+ numero + " DE " + nombre;
		//	" valor: " + valor;
				
		
		
		return objetoAlTexto;
	}
	

	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public boolean isFueJugada() {
		return fueJugada;
	}



	public void setFueJugada(boolean fueJugada) {
		this.fueJugada = fueJugada;
	}
	
	
	
	
}
