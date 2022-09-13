package HomeWork3.Instruments;

public class Instruments_Main {
	public static void main(String[] args) {
		// Task 2

		Instrument[] instruments = new Instrument[3];

		instruments[0] = new Guitar(9);
		instruments[1] = new Drum(9);
		instruments[2] = new Truba(9);

		for (int i = 0; i < instruments.length; i++) {
			instruments[i].play();
		}
	}
}
