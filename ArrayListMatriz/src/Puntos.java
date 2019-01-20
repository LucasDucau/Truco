
public class Puntos {
	
	//atributos
	private int puntosPar;
	private int puntosImpar;

	
	//constructor
	public Puntos(int puntosPar, int puntosImpar)
	{
		this.puntosPar=puntosPar;
		this.puntosImpar=puntosImpar;
	}
	
	
	
	
	public int getPuntosPar() {
		return puntosPar;
	}


	public void setPuntosPar(int puntosPar) {
		this.puntosPar = puntosPar;
	}


	public int getPuntosImpar() {
		return puntosImpar;
	}


	public void setPuntosImpar(int puntosImpar) {
		this.puntosImpar = puntosImpar;
	}
	
	public void aplicarPuntos(int pp,int pi)
	{
		this.puntosPar+=pp;
		this.puntosImpar+=pi;
		
		System.out.printf("Puntaje jugador Par: "+puntosPar+"%n"+"Puntaje jugador Impar"+puntosImpar+"%n");
		
	}



	

}
