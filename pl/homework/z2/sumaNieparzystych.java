package pl.homework.z2;

public class sumaNieparzystych {

	static int sumNiepar(int[] t) {
		int suma = 0;

		for (int element : t) {
			if (element % 2 != 0) {
				suma += element;
			}
		}

		return suma;
	}

	public static void main(String[] args) {

		int[] liczby = { 13, 12, 15, 18, 19, 15, 13, 23, 56, 32, 23, 21, 3 };

		System.out.println("suma nieparzystych " + sumNiepar(liczby));
	}

}
