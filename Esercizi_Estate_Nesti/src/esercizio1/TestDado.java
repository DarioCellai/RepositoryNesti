package esercizio1;

import java.util.Scanner;

/*Scrivere un programma che usi la classe Random per simulare il lancio di un dado, visualizzando un numero casuale tra 1 e il numero di facce del dato stesso (definito in fase di creazione del dado). 
Versione 1: La classe Dado deve contenere, oltre al metodo costruttore, un metodo lancia() che restituisca un valore (intero) nell’intervallo del dado.
Versione 2: sfruttare l’overloading per generare un costruttore di default che crea un dado con 6 facce.

*/
public class TestDado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Benvenuto all'esercizio Dado: ");
		String [] options = {
				"1-Digitare 1 se si vuole eseguire la prima versione dell'esercizio, usando dado con numero a scelta di facce",
				"2-Digitare 2 se si vuole eseguire la seconda versione dell'esercizio, usando dado a 6 facce",
				"3-Exit",
		};
		
		int v =1;
        Scanner scanner =new Scanner(System.in);
       
        while(v!=3) {
        	System.out.println("Cosa desideri fare?");
        	for(int i=0;i<options.length;i++) {
        		System.out.println(options[i]);
        	}
		
		    v = scanner.nextInt();
		    if (v==1) {
			   System.out.println("Inserire il numero desiderato di facce del dado:");
			   int facce = scanner.nextInt();
			   Dado dado = new Dado(facce);
			   dado.lancia();
		    }
		    else if (v==2) {
			    Dado dado = new Dado();
			    dado.lanciaNumeroFacceFisse();
		    }
		    else if (v<1 || v>3) {
		    	System.out.println("Non è stato inserito un valore corretto; si prega di riprovare");
		    }
        }
		scanner.close();
		System.out.println("Programma terminato");

	}

}
