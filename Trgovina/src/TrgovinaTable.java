/*
	Ime datoteke: 	TrgovinaTable.java
	Avtor:			Jan Martinčič
*/

import javax.swing.table.*;

public class TrgovinaTable extends DefaultTableModel{
    public TrgovinaTable(){
        super();

        //v tabelo dodamo stolpce
        addColumn("Velikost hladilnika");
        addColumn("Temperatura");

        //Ustvarimo statičen seznam objektov
        Object[] vrstica = new Object[] {"Velikost hladilnika", "Temperatura"};
		// Dodamo vrstico v tabelo
		addRow(vrstica);

    }

    //Metoda, ki doda hladilnik na seznam in v tabelo
    //Vhodni parameteri: hd -> hladilnik
    //Potek/opis: doda hladlink v tabelo
    //Vrne vrednost: /

    public void addHladilnik(Hladilnik hd){

        //dodamo vrstico v tabelo
        Object[] vrstica = new Object[] {hd.getKpacitetaHladilnika()+" L ", hd.getTemp()};

        //dodamo vrstico v tabelo
        addRow(vrstica);
    }
}
