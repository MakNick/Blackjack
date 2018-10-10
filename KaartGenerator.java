package WeekopdrachtBlackjack;

import java.util.ArrayList;
import java.util.Collections;

public class KaartGenerator{
	String[] kleur = {"Harten", "Schoppen", "Klaver", "Ruiten"};
	String[] waarde = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Koning", "Aas"};
	int[] rekenWaarde = {2,3,4,5,6,7,8,9,10,10,10,10,11};
	ArrayList<Kaart> nieuwDek = new ArrayList<Kaart>();
	
	void vulDek() {
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
	
	void geefBeginKaarten() {
		System.out.println("Je krijgt de kaarten: " + nieuwDek.get(0) + " / " + nieuwDek.get(1));
		System.out.println("De totale waarde is: " + (nieuwDek.get(0).rekenWaarde + nieuwDek.get(1).rekenWaarde) + "\n");
		int totaalWaarde = (nieuwDek.get(0).rekenWaarde + nieuwDek.get(1).rekenWaarde);
		nieuwDek.remove(0);
		nieuwDek.remove(0);
	}
	
	void geefKaart() {
		System.out.println(nieuwDek.get(0));
		System.out.println();
		nieuwDek.remove(0);
		System.out.println(nieuwDek);
		System.out.println();
	}
	
	void pasKaart() {
		nieuwDek.remove(0);
		System.out.println(nieuwDek);
		System.out.println();
	}
	
	
	
}