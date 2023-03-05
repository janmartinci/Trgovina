/*
	Ime datoteke: 	TrgovinaTableBarvni.java
	Avtor:			Jan Martinčiča
*/

import javax.swing.table.*;

public class TrgovinaTableBarvni extends DefaultTableModel{
    public TrgovinaTableBarvni(){
        super();

        //v tabelo dodamo stolpce
        addColumn("Velikost hladilnika");
        addColumn("Temperatura");
        addColumn("Barva");

        //Ustvarimo statičen seznam objektov
        Object[] vrstica = new Object[] {"Velikost hladilnika", "Temperatura", "Barva"};
        // Dodamo vrstico v tabelo
        addRow(vrstica);

    }

    //Metoda, ki doda barvni hladilnik na seznam in v tabelo
    //Vhodni parameteri: br -> Barvni hladilnik
    //Potek/opis: doda barvni hladlink v tabelo
    //Vrne vrednost: /

    public void addBarvniHladilnik(BarvnoNastavljivHladilnik br){
        Object[] vrstica = new Object[] {br.getKpacitetaHladilnika()+" L ", br.getTemp(), br.getBarva()};

        //dodamo vrstico v tabelo
        addRow(vrstica);
    }
}
