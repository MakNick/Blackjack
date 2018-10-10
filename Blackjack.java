package WeekopdrachtBlackjack;

import java.util.Scanner;

public class Blackjack {
		KaartGenerator kaartenMaken = new KaartGenerator();
		boolean doorgaan = true;
		
		void starten() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welkom bij Blackjack!\n\nDit zijn de geschudde kaarten:\n");
			
			kaartenMaken.vulDek();
			kaartenMaken.schudDek();
			
			kaartenMaken.geefBeginKaarten();
			
			while(doorgaan){
				System.out.println("Geef uw invoer:");
				toonMenu();
				String invoer = scanner.nextLine();
				verwerkenInvoer(invoer);	
			}
		}
		
		void toonMenu() {
			System.out.println("1. Krijg een kaart");
			System.out.println("2. Pas");
			System.out.println("3. Quit");
		}

		void verwerkenInvoer(String deInvoer) {
			
			
			switch(deInvoer) {
			case "1": 
				System.out.println("Krijg een kaart");
				kaartenMaken.geefKaart();
				break;
			case "2": 
				System.out.println("Pas");
				kaartenMaken.pasKaart();
				break;
			case "3": 
				doorgaan = false;
				System.out.println("Quit");
				break;
			}
		}
	
}



	


