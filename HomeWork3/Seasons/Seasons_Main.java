package HomeWork3.Seasons;

public class Seasons_Main {
	public static void main(String[] args) {
		// Task 3

		Seasons Favorite = Seasons.WINTER; // Setting favorite season

		Seasons.WINTER.setAverageTemperature(-25); // Setting average temperatures of all seasons
		Seasons.SPRING.setAverageTemperature(16);
		Seasons.SUMMER.setAverageTemperature(25);
		Seasons.AUTUMN.setAverageTemperature(15);

		for (Seasons season : Seasons.values()) {
			System.out.printf("Name: %s, avg_temperature: %d, description: %s\n", season.name(), season.getAverageTemperature(),season.getDescription(season));
		}

		System.out.printf("Favorite season: %s",Favorite);
	}
}
