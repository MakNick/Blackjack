package WeekopdrachtBlackjack;

import java.util.Scanner;

public class Blackjack {
		KaartGenerator kaartenMaken = new KaartGenerator();
		static boolean doorgaan = true;
		
		void starten() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welkom bij Blackjack!\n\nDit zijn de geschudde kaarten:\n");
			
			kaartenMaken.vulDek();
			kaartenMaken.schudDek();
			kaartenMaken.geefBeginKaarten();
			
			while(doorgaan){
				System.out.println("Kies een optie:");
				toonMenu();
				String invoer = scanner.nextLine();
				verwerkenInvoer(invoer);	
			}
			scanner.close();
		}
		
		void toonMenu() {
			System.out.println("1. Krijg een kaart");
			System.out.println("2. Pas");
			System.out.println("3. Opnieuw schudden");
			System.out.println("4. Quit");
		}

		void verwerkenInvoer(String deInvoer) {
						
			switch(deInvoer) {
			case "1": 
				kaartenMaken.geefKaart();
				break;
			case "2": 
				kaartenMaken.pasKaart();
				break;
			case "3": 
				kaartenMaken.vulDek();
				kaartenMaken.schudDek();
				kaartenMaken.geefBeginKaarten();
				break;
			case "4": 
				doorgaan = false;
				System.out.println("Quit");
				break;
			}

		}
}