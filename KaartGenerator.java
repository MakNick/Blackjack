package WeekopdrachtBlackjack;

import java.util.ArrayList;
import java.util.Collections;

public class KaartGenerator{
	String[] kleur = {"Harten", "Schoppen", "Klaver", "Ruiten"};
	String[] waarde = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Koning", "Aas"};
	int[] rekenWaarde = {2,3,4,5,6,7,8,9,10,10,10,10,11};
	ArrayList<Kaart> nieuwDek = new ArrayList<Kaart>();
	int startWaarde;
	int getrokkenWaarde;
	
	void vulDek() {
		nieuwDek.clear();
		for(int indexKleur = 0; indexKleur < kleur.length; indexKleur++) {
			for (int indexWaarde = 0; indexWaarde < waarde.length; indexWaarde++){
				Kaart kaart = new Kaart();
				kaart.kleur = kleur[indexKleur];
				kaart.waarde = waarde[indexWaarde];
				kaart.rekenWaarde = rekenWaarde[indexWaarde];
				nieuwDek.add(kaart);
			}
		}
	}
	
	void schudDek() {
		Collections.shuffle(nieuwDek);
		System.out.println(nieuwDek);
		System.out.println();
	}
	
	public void geefBeginKaarten() {
		System.out.println("Een nieuw spel begint\nJe krijgt de kaarten: " + nieuwDek.get(0) + " / " + nieuwDek.get(1));
		startWaarde = (nieuwDek.get(0).rekenWaarde + nieuwDek.get(1).rekenWaarde);
		System.out.println("De totale waarde is: " + startWaarde + "\n");
		nieuwDek.remove(0);
		nieuwDek.remove(0);
	}
	
	public void geefKaart() {
		System.out.println("Je krijgt een kaart, namelijk een " + nieuwDek.get(0));
		getrokkenWaarde = nieuwDek.get(0).rekenWaarde;
		int totaleWaarde = startWaarde + getrokkenWaarde;
		if (totaleWaarde < 21) {
			System.out.println("Je totale score is " + totaleWaarde);
			startWaarde = totaleWaarde;
			nieuwDek.remove(0);
			System.out.println();
		} else if (totaleWaarde == 21){
			System.out.println("Blackjack!");
			Blackjack.doorgaan = false;
		} else {
			System.out.println("Je totale score is " + totaleWaarde);
			System.out.println("Game over!\n\n");
			Blackjack.doorgaan = false;
		}
				
	}
	
	void pasKaart() {
		System.out.println("Je past");
		nieuwDek.remove(0);
		System.out.println();
	}
	

		
}