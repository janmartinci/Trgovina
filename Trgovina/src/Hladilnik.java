/*
	Ime datoteke: 	Hladilnik.java
	Avtor:			Jan Martinčič
*/

//deklariranje javnega razreda Hladilnik
public class Hladilnik{
    //Dekleriramo glavniVolumen
    public double glavniVolumen = 0;
    //Deklariramo zasebne lastnosti razreda Hladilnik
    private int kolicinaIzdelkov;
    private double kapacitetaHladilnika; //v litrih
    private double volumenIzdelka; //v litrih
    private double TempHladilnika;
    private String VrstaIzdelka;
    
    //Javni konstruktor
    //Vhodni parametri: kap - kapaciteta hladilnika, Temp - temperatura hladilnika
    //Potek/opis: ustvari no objekt tipa Hladilnik
    //Vrne vrednost: nov objekt
    public Hladilnik(double kap, double Temp){

        // Inicializiramo lastnosti objekta
        kolicinaIzdelkov = 0;
        kapacitetaHladilnika = kap; //v litrih
        volumenIzdelka = 0; //v litrih
        TempHladilnika = Temp; //°C
        VrstaIzdelka = "";
    }

    //Javna metoda za polnjenje hladilnika
    //Vhodni parametri: kol - količina izdelkov, volIz - Volumen izdelkov
    //Potek/opis: preveri velikost hladilnika in doda izdelek. Če je število izdelkov preveliko za hladilnik potem napolni do vrha
    //Vrne vrednost: true ali false
    public void napolniHladilnik(int kol, double volIz, String vrsta) throws Exception {
        // nastavimo parpater glavni volumen
        glavniVolumen = volIz;
        // podamo vrednost vrste izdelka
        VrstaIzdelka = vrsta;
        // preverimo ali je v Hladilniku dovolj prostora
        if (kolicinaIzdelkov + (kol * volIz) <= kapacitetaHladilnika) {
            // Prištejemo količino izdelkov
            kolicinaIzdelkov = kolicinaIzdelkov + kol;
            // odštejemo volumen izdelkov od volumna hladilnika
            kapacitetaHladilnika = kapacitetaHladilnika - (kol * volIz);
            // volumen izdelka
            volumenIzdelka = (kol * volIz);
        } else {
            // dokler volumen izdelkov večji od kapacitete hladilnika odštej količino izdelkov
            while ((kol * volIz) > kapacitetaHladilnika) {
                kol--;
            }
            // Prištejemo količino izdelkov
            kolicinaIzdelkov += kol;
            // volumen izdelka
            volumenIzdelka = (kol * volIz);
            // odštejemo volumen izdelkov od volumna hladilnika
            kapacitetaHladilnika = kapacitetaHladilnika - (kol * volIz);
            throw new Exception("Hladilnik je prepolnjen! Nismo spravili vsega notri.");
        }
    }

    //Javna metoda za praznjenje hladilnika
    //Vhodni parametri: kol - količina izdelkov
    //Potek/opis: Preveri količino oduzetih izdelkov
    //Vrne vrednost: true ali false
    public boolean sprazniHladilnik(int kol) throws Exception {
        //preveri če je vnešena količina izdelkov manjša ali enaka
        if(kol <= kolicinaIzdelkov){
            //kolicina izdelkov v hladilniku
            kolicinaIzdelkov -= kol;
            //doda kapaciteto hladilniku
            kapacitetaHladilnika =  kapacitetaHladilnika + (kol * glavniVolumen);
            return true;
        }else{
            //če ni vrne false
            throw new Exception("Količina izdelkov za brisanje je prevelika.");
        }
    }
    //Javna metoda za preverjanje temperature
    //Vhodni parametri: /
    //Potek/opis: Preveri temperaturo hladilnika
    //Vrne vrednost: true ali false
    public boolean temperatura(){
        //preveri če je temepratura med 1.6 in 3.3
        if(TempHladilnika >= 1.6 && TempHladilnika <= 3.3){
            return true;
        }else{
            return false;
        }
    }
    //getter metoda vrne temperaturo
    public double getTemp(){
        return TempHladilnika;
    }
    //getter metoda vrne količino izdelkov
    public int getKolicinaIzdelkov(){
        return kolicinaIzdelkov;
    }
    //getter metoda vrne kapaciteto hladilnika
    public double getKpacitetaHladilnika(){
        return kapacitetaHladilnika;
    }
    //gatter metoda vrne volumen izdelka
    public double getVolumenIzdelka(){
        return volumenIzdelka;
    }
    //gatter metoda vrne vrsto izdelka
    public String getVrstaIzdelka(){
        return VrstaIzdelka;
    }
}