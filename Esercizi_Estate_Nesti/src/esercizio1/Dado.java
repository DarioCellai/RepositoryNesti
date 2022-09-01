package esercizio1;

public class Dado {
	private int facce;
	private int risultato;
	private double doublerisultato;
	private int seiFacce;
	
	
	public int getSeiFacce() {
		return seiFacce;
	}


	public void setSeiFacce(int seiFacce) {
		this.seiFacce = seiFacce;
	}


	public int getFacce() {
		return facce;
	}


	public void setFacce(int facce) {
		this.facce = facce;
	}


	public int getRisultato() {
		double doublerisultato = (this.facce*Math.random())+1;
		int risultato = (int) doublerisultato;
		return risultato;
	}
	
	public int getRisultatoFisso() {
		double doublerisultato = (this.seiFacce*Math.random())+1;
		int risultato = (int) doublerisultato;
		return risultato;
	}


	public Dado (int facce) {
		this.facce = facce;
	}
	
	public Dado () {
		this.seiFacce = 6;
	}
	
	public void lancia() {
		System.out.println("Il risultato del lancio è pari a: "+this.getRisultato());
	}
	
	public void lanciaNumeroFacceFisse() {
		System.out.println("Il risultato del lancio è pari a: "+this.getRisultatoFisso());
	}

}
