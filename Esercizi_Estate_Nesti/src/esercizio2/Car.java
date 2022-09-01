package esercizio2;

/*Realizzare una classe Car con le seguenti proprietà:
Un’automobile ha una determinata resa del carburante e una certa quantità di carburante nel serbatoio.
La resa viene specificata nel costruttore e il carburante viene impostato a zero. 
Possiede un metodo drive() per simulare la percorrenza di una certa distanza, riducendo il carburante nel serbatoio.
Possiede un metodo getGas().
Possiede un metodo refill() che aggiunge un certo quantitativo di gas, stando attento a non sforare il massimo.
 */
public class Car {
	private double resa;
	public double gas;
	private double percorrenza;
	private double rifornimento;
	private double gasMax;
	private double gasConsumato;
	
	
	public double getGasConsumato() {
		return gasConsumato;
	}
	public void setGasConsumato(double gasConsumato) {
		this.gasConsumato = gasConsumato;
	}
	public double getRifornimento() {
		return rifornimento;
	}
	public void setRifornimento(double rifornimento) {
		this.rifornimento = rifornimento;
	}
	public double getResa() {
		return resa;
	}
	public void setResa(double resa) {
		this.resa = resa;
	}
	public double getGas() {
		return gas;
	}
	public void setGas(double gas) {
		this.gas = gas;
	}
	public double getPercorrenza() {
		return percorrenza;
	}
	public void setPercorrenza(double percorrenza) {
		this.percorrenza = percorrenza;
	}
	
	public Car (double resa, double gasMax, double gas, double rifornimento, double gasConsumato) {
		this.resa = resa;
		this.gas = gas;
		this.gasMax = gasMax;
		this.rifornimento = rifornimento;
		this.gasConsumato = gasConsumato;
	}
	
	public double getGasMax() {
		return gasMax;
	}
	public void setGasMax(double gasMax) {
		this.gasMax = gasMax;
	}
	public double drive() {
		//double percorrenza = this.resa*this.gasConsumato;
		double gas = this.gas - this.gasConsumato;
		return percorrenza;
	}
	
	/*public double serbatoio() throws Exception{
		double gas = this.gas - this.gasConsumato;
		//if (gas <0) {
		return gas;
	}*/
	public double refill() {//throws Exception
		gas = this.gas+ this.rifornimento- this.gasConsumato;// - (this.percorrenza/this.resa)
		return gas;
	}
	
	public void printDrive() {
		System.out.println("L'automobile ha percorso una distanza pari a: "+this.drive() + " km;");
	}
	
	public void printSerbatoio() {
		System.out.println("Il serbatoio dell'automobile contiene ora " +this.refill()+ " litri di gas;");
	}

}
