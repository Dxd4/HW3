package HomeWork3;

public class Truba implements Instrument{
	private int Diameter;

	public Truba(int Diameter){
		this.Diameter = Diameter;
	}

	@Override
	public void play() {
		System.out.printf("Instrument: truba, diameter: %d\n", this.Diameter);
	}
}
