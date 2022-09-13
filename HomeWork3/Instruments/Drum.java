package HomeWork3.Instruments;

public class Drum implements Instrument {
	private int Size;

	public Drum(int Size){
		this.Size = Size;
	}

	@Override
	public void play() {
		System.out.printf("Instrument: drum, size: %d\n", this.Size);
	}
}
