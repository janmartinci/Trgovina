/*
	Ime datoteke: 	BarvnoNastavljivHladilnik.java
	Avtor:			Jan Martinčič
*/

// Deklariramo javni razred, ki razširja razred Hladilnik
public class BarvnoNastavljivHladilnik extends Hladilnik{
    //Deklariramo zasebne lastnosti razreda BarvnoNastavljivHladilnik
	private String barva; 
    
    //Javni konstruktor
    //Vhodni parametri: kap - kapaciteta hladilnika, Temp - temperatura hladilnika, br - barva hladilnika
    //Potek/opis: ustvari no objekt tipa ZamrzovalnaSkrinja
    //Vrne vrednost: nov objekt
	public BarvnoNastavljivHladilnik (double kap, double Temp, String br){
        // Pokličemo konstruktor nadrazreda 
		super(kap, Temp);

        // Napolnimo hladilnik - pokličemo metodo, deklarirano v nadrazredu
        try{
            napolniHladilnik(4, 2, "Sok");
        }
        catch(Exception e){
            System.out.println("Napaka pri polnjenju " + e);
        }
		barva = br;
	}
	//Javna metoda za prikaz barve
    //Vhodni parametri: /
    //Potek/opis: Izpiše barvo hladilnika
    //Vrne vrednost: Barva
	public void prikaziBarvoHladilnika(){
		System.out.println("Barva hladilnika je " + barva);
	}
	//Javna metoda za nastavitev hladilne temperature
    //Vhodni parametri: Temp - Temperatura v stopinjah
    //Potek/opis: Preveri nastavljeno temperaturo
    //Vrne vrednost: Odzivno besedilo
	public void nastaviHladilnoTemperaturo(double Temp) throws Exception {
        if(Temp < 2){
            throw new Exception("Opozorilo: hladilna temperatura je pod najnižjo delovno temperaturo");
        }else{
            if(Temp > 10){
                throw new Exception("Opozorilo: temperatura je previsoka!");
            }else{
                Temp = Temp;
                System.out.println("Hladilna temperatura je nastavljena na " + Temp + " °C.");
            }
        }
    }

    public String getBarva(){
        return barva;
    }
	
}

