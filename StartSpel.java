package WeekopdrachtBlackjack;

	public class StartSpel {

		public static void main(String[] args) {
			
			Blackjack blackjack = new Blackjack();
			blackjack.starten();
			
			KaartGenerator kaartenMaken = new KaartGenerator();
			kaartenMaken.vulDek();
			
		}

	}
