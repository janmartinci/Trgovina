/*
	Ime datoteke: 	Trgovina.java
	Avtor:			Jan Martinčič
	Vhodni podatki: /
	Opis: 			Aplikacija z grafičnim uporabniškim vmesnikom za delo s Hladilniki
	Izhodni podatki:Okno grafičnega uporabniškega vmesnika
*/

// Uvozimo pakete za delo z GUI
import javax.swing.*;

// Uvozimo paket za delo z dogodki
import java.awt.event.*;

// Deklariramo javni razred
public class Trgovina extends JFrame implements ActionListener{
	//dekleriramo zasebne lasnosti
	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField kapacitetaPolje, temperaturaPolje, barvaPolje;
	private JTable tabela;
	private JTable tabela2;
	private TrgovinaTable modelTabele;
	private TrgovinaTableBarvni modelTabeleBarvni;

	public static void main(String[] args) {
	
		Trgovina m = new Trgovina("Trgovina s hladilniki");
		
	}

	//javni konstruktor
	//Vhodni parametri: n - naslov okna
	//Potek/opis: vrne objekt tipa Trgovina
	//Vrne vrednost: vrne objekt tipa Trgovina
	public Trgovina(String n){

		//Kličemo konstruktor nadrazreda
		super(n);
		//inicializiramo lasnosti
		povrsina = new JPanel();
		dodajJButton = new JButton("Dodaj hladilnik");
		kapacitetaPolje = new JTextField(8);
		temperaturaPolje = new JTextField(8);
		barvaPolje = new JTextField(8);
		modelTabele = new TrgovinaTable();
		modelTabeleBarvni = new TrgovinaTableBarvni();
		tabela = new JTable(modelTabele);
		tabela2 = new JTable(modelTabeleBarvni);

		//povrsino damo
		add(povrsina);
		//Gumb za ododajanje dodamo action listner
		dodajJButton.addActionListener(this);
		//dodamo gumb , kapaciteto, temperaturo prvo tabelo in drugo tabelo na površino
		povrsina.add(new JLabel("Kapaciteta v litrih(L):"));
		povrsina.add(kapacitetaPolje);
		povrsina.add(new JLabel("Temperatura:"));
		povrsina.add(temperaturaPolje);
		povrsina.add(new JLabel("Barva:"));
		povrsina.add(barvaPolje);
		povrsina.add(dodajJButton);
		povrsina.add(tabela);
		povrsina.add(tabela2);
		//Pokažemo okno
		setVisible(true);

		// Pokažemo okno
		setSize(800,600);

		//nastavimo obnašanje križca (x) - da konča aplikacijo
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		System.out.println("Ustvarjam objekt Trgovina");

	}

	//Metoda, ki jo predpisuje vmesnik ActionListener
	//Vhodni parametri: dogodek
	//Potek/opis: doda hladilnik v tabelo
	//Vrne vrednost: /
	public void actionPerformed(ActionEvent tr){
		System.out.println("Dodajam hladilnik ...");
		System.out.println("Kapaciteta je: " + kapacitetaPolje.getText());
		System.out.println("Temperatura je: " + temperaturaPolje.getText());

		//dodamo objekta v tabelo
		modelTabele.addHladilnik(new Hladilnik(Double.parseDouble(kapacitetaPolje.getText()),Double.parseDouble(temperaturaPolje.getText())));
		modelTabeleBarvni.addBarvniHladilnik(new BarvnoNastavljivHladilnik(Double.parseDouble(kapacitetaPolje.getText()),Double.parseDouble(temperaturaPolje.getText()), barvaPolje.getText()));
	}

}