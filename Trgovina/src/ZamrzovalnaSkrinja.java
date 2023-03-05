/*
	Ime datoteke: 	ZamrzovalnaSkrinja .java
	Avtor:			Jan Martinčič
*/

// Deklariramo javni razred, ki razširja razred Hladilnik
//in implementria vmesnik LetnicaHladilnika
public class ZamrzovalnaSkrinja extends Hladilnik implements LetnicaHladilnika{
	//Deklariramo zasebne lastnosti razreda ZamrzovalnaSkrinja
	private double globina; 
	private int LetnicaZamrzovalneSkrinje;
	
	//Javni konstruktor
    //Vhodni parametri: kap - kapaciteta zamrzovalne skrinje, Temp - temperatura zamrzovalne skrinje, glov - globina, L-letnica
    //Potek/opis: ustvari no objekt tipa ZamrzovalnaSkrinja
    //Vrne vrednost: nov objekt
	public ZamrzovalnaSkrinja (double kap, double Temp, double glob, int L){
		super(kap, Temp);
		globina = glob;
		LetnicaZamrzovalneSkrinje = L;
	}
	//Javna metoda za prikaz globine
    //Vhodni parametri: /
    //Potek/opis: Izpiše globino v cm
    //Vrne vrednost: Globina
	public void prikaziGlobino(){
		System.out.println("Globina zamrzovalne skrinje je " + globina + " cm.");
	}

	//Javna metoda za nastavitev zamrzovalne temperature
    //Vhodni parametri: Temp - Temperatura v stopinjah
    //Potek/opis: Preveri nastavljeno temperaturo in vrne pravilni odziv glede na temperaturo-
    //Vrne vrednost: Odzivno besedilo
	public void nastaviZamrzovalnoTemperaturo(double Temp) throws Exception {
		//preveri če je temperatura večja od 0;
		if (Temp > 0) {
			throw new Exception("Opozorilo: Pri tej temperaturi se bo zamrzovalnik začel odtajati!");
		}
		//preveri če je temperatura manjša od -18
		if (Temp < -18) {
			throw new Exception("Opozorilo: temperatura je prenizka!");
		} else {
			//nastavi temperaturo
			Temp = Temp;
			//izpiše temperaturo
			System.out.println("Zamrzovalna temperatura je nastavljena na " + Temp + " °C.");
		}
	}

	//Metoda, ki vrne letnico zamrzovalne skirnje
    //Vhodni parametri: /
    //Potek/opis: vrne letnico
    // Vrne vrednost: int - leto izdelave
	public int getLetnicaZamrzovalneSkrinje(){
		return LetnicaZamrzovalneSkrinje;
	}
	
}

