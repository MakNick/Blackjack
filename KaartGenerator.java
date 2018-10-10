package WeekopdrachtBlackjack;

import java.util.ArrayList;
import java.util.Collections;

public class KaartGenerator{
	String[] kleur = {"Harten", "Schoppen", "Klaver", "Ruiten"};
	String[] waarde = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Koning", "Aas"};
	ArrayList<Kaart> nieuwDek = new ArrayList<Kaart>();
	int indexKleur;
	int indexWaarde;
	Kaart kaart;
	
	void vulDek() {
		for(indexKleur = 0; indexKleur < 4; indexKleur++) {
			for (indexWaarde = 0; indexWaarde < 13; indexWaarde++){
				Kaart kaart = new Kaart();
				kaart.kleur = kleur[indexKleur];
				kaart.waarde = waarde[indexWaarde];
				nieuwDek.add(kaart);
			}
		}
	}
	
	void schudDek() {
		Collections.shuffle(nieuwDek);
		System.out.println(nieuwDek);
	}
	
}