
public class Nivell3 {

	public static void main(String[] args) throws InterruptedException   {
		int hour = 0;
		int minute = 0;
		int seconds = 0;

		while (true) {

			if (hour < 10) {// afegeix un digit
				System.out.print("0");
			}

			System.out.print(hour + ":");

			if (minute < 10) {// afegeix un digit
				System.out.print("0");
			}

			System.out.print(minute +":");

			if (seconds < 10) {// afegeix un digit
				System.out.print("0");
			}

			System.out.println(seconds + ":");

			// augmentar el temps
			seconds++;
			// control de les hores/minuts / segons
			if (seconds == 60) {
				seconds = 0;
				minute++;
				if (minute == 60) {
					minute = 0;
					hour++;
					if (hour == 24) {
						hour = 0;
					}
				}
			}
			
			Thread.sleep(1000);

		}

	}

}
