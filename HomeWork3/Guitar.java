package HomeWork3;

public class Guitar implements Instrument{
	private int Number_of_strun;

	public Guitar(int Number_of_strun){
		this.Number_of_strun = Number_of_strun;
	}


	@Override
	public void play() {
		System.out.printf("Instrument: guitar, number of strun: %d\n", this.Number_of_strun);
	}
}
