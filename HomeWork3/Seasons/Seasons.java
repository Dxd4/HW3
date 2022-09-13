package HomeWork3.Seasons;

public enum Seasons {
	WINTER, SPRING, SUMMER, AUTUMN;

	public int getAverageTemperature() {
		return averageTemperature;
	}

	public void setAverageTemperature(int averageTemperature) {
		this.averageTemperature = averageTemperature;
	}

	public String getDescription(Seasons season) {
		if (season.getAverageTemperature() < 16){
			return "Cold season";
		}
		else{
			return "Warm season";
		}
	}

	private int averageTemperature;
}
