package HomeWork3;

public class Main {
	public static void main(String[] args) {
		// Задание 2
		Instrument[] instruments = new Instrument[3];

		instruments[0] = new Guitar(9);
		instruments[1] = new Drum(9);
		instruments[2] = new Truba(9);

		for (int i = 0; i < instruments.length; i++) {
			instruments[i].play();
		}

		// Задание 3

			for (Seasons season : Seasons.values()) {
				System.out.printf("Name: %s, avg_temperature: %s, ", season.name(), season.getAverageTemperature());
				season.getDescription(season);
			}
			System.out.printf("Favorite season: %s",Seasons.WINTER);
	}
}
