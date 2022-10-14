package day3AbstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Otun bitti");
	}
}
