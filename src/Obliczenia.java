import java.util.Random;

public class Obliczenia {
	private int[][] tablica;

	public int[][] getTablica() {
		return tablica;
	}

	public void setTablica(int[][] tablica) {
		this.tablica = tablica;
	}

	public Obliczenia(int[][] tablica) {
		this.tablica = tablica;
	}

	public void wypelnienieTablicy() {
		Random rand = new Random();

		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++) {
				tablica[i][j] = rand.nextInt(11) - 5;
			}
		}
	}

	public void wypisanieTablicy() {
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++) {
				System.out.print(tablica[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

	public void wyznaczanieMinimum() {
		int minimum = 6;
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++) {
				if (tablica[j][i] < minimum) {
					minimum = tablica[j][i];
				}

			}
			System.out.println("Kolumna " + (i+1) + " minimum wynosi : " + minimum);
			minimum = 6;
		}
		System.out.println();
	}
	
	public void wyznaczanieMaximum() {
		int maximum = -6;
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++) {
				if (tablica[j][i] > maximum) {
					maximum = tablica[j][i];
				}

			}
			System.out.println("Kolumna " + (i+1) + " maximum wynosi : " + maximum);
			maximum = -6;
		}
	}
}
