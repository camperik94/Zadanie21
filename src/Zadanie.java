
public class Zadanie {
	public static void main(String[] args) {
		
		int[][] tablica = new int[5][5];
		
		Obliczenia obl = new Obliczenia(tablica);
		
		obl.wypelnienieTablicy();
		obl.wypisanieTablicy();
		obl.wyznaczanieMinimum();
		obl.wyznaczanieMaximum();
	}
}
