package esercizio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resa = 0;
        double gas = 0;
        double rifornimento =0;
        double gasConsumato =0;
        double percorrenza =0;
        double gasMax = 0;
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Benvenuto all'esercizio Automobile: \nper impostare i parametri del tuo veicolo inserisci per favore correttamente i dati che ti saranno richiesti;");
		try {
				System.out.println("Inserisci il valore della resa dell'automobile, così come indicato dal costruttore: ");
				
		        resa = scanner.nextDouble();
		        
		        System.out.println("Inserisci il valore della capienza del serbatoio dell'automobile: ");
		        gasMax = scanner.nextDouble();
		        
		        Car car = new Car(resa, gasMax, gas, rifornimento, gasConsumato);
        
	      
		        while (gas >=0 && gas<= gasMax) {
		        	   System.out.println("Quanti litri di gas vuoi aggiungere nel serbatoio dell'automobile? \nAttenzione a non eccedere oltre la capienza del serbatoio stesso!");
		               rifornimento = scanner.nextDouble();
		               car.refill();
		               car.getGas();
		               car.printSerbatoio();
		               System.out.println("Digitare la quantità di gas da consumare per muovere l'auto:");
		               gasConsumato = scanner.nextDouble();
		               car.printDrive();
		               car.printSerbatoio();
		          }
		        System.out.println("I valori del gas all'interno del serbatoio sono al di fuori dell'intervallo consentito");
	        }
	   catch (ArithmeticException e) {
		   System.out.println("Errore; la resa non può essere zero: se lo è, allora vai dal meccanico per le riparazioni "+e.getMessage());
	   }
	   catch(InputMismatchException e) {//gestione errore in inserimento
				System.out.println("Errore; lettere non consentite: "+e.getMessage());
			}
	   catch(Exception e) {//gestione errore generico; è in fondo al codice per prendere tutte le altre eccezioni non considerate prima 
				System.out.println("Errore generico: "+e.getMessage());
			}
	   finally {//chiusura connessione ad un database eventualmente utilizzato
				System.out.println("Programma terminato");
			}
	   scanner.close();
        

	}

}
