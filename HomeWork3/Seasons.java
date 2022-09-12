package HomeWork3;

public enum Seasons {
	WINTER(-25), SPRING(16), SUMMER(25), AUTUMN(15);

	Seasons(int averageTemperature) {
		this.averageTemperature = averageTemperature;
	}

	public int getAverageTemperature() {
		return averageTemperature;
	}

	public void getDescription(Seasons season) {
		if (season.getAverageTemperature() < 16){
			System.out.println("Cold season");
		}
		else{
			System.out.println("Warm season");
		}
	}

	private int averageTemperature;
}
