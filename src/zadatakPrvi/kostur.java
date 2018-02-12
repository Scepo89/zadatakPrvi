package zadatakPrvi;

import java.util.Scanner;

public class kostur {
	public static void primeLessThan100Print() {
		final int NUM_IN_ONE_LINE = 8;
		int num = 2;
		int counter = 0;

		while (num < 1000) {
			boolean prime = true; // assume the number is prime
			for (int div = 2; div <= num / 2; div++) { // check if it's prime
				if (num % div == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				counter++;// if it's prime increase the counter
				if (counter % NUM_IN_ONE_LINE == 0) {
					System.out.println(num);// print prime in new line
				} else
					System.out.printf(" %4d ", num);
			}
			num++; // test next number
		}

	}

	public static void emirps100() {
		int num = 10;
		int counter = 0;
		final int NUM_IN_ONE_LINE = 10;

		do {
			boolean prime = true; // assume the number is prime
			for (int div = 2; div <= num / 2; div++) { // check if it's prime
				if (num % div == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				String str = Integer.toString(num);
				String revString = "";

				for (int i = str.length() - 1; i >= 0; i--) {
					revString += str.charAt(i);
				}
				int reverse = Integer.parseInt(revString);// make reverse number

				for (int div = 2; div <= reverse / 2; div++) {// check if revers
																// is prime
					if (reverse % div == 0) {
						prime = false;
						break;
					}
				}
				// get first and last digit to see if number is palindrom
				int dig3 = num % 10;
				int dig1 = num / 100;

				if (prime && dig1 != dig3) {// if it's prime and not palindrom
											// then print
					if (counter % NUM_IN_ONE_LINE == 0) {
						System.out.println(num);// print in new line
					} else
						System.out.printf(" %4d ", num);
					counter++;
				}
			}
			num++; // test next number
		} while (counter < 100);
	}

	public static void fibonaciLessThan100() {
		long broj1 = 0;
		long broj2 = 1;
		long niz[] = new long[100];
		for (int i = 0; i < niz.length; i += 2) {
			niz[i] = broj1;
			niz[i + 1] = broj2;
			broj1 = broj1 + broj2;
			broj2 = broj2 + broj1;
			System.out.println(" " + niz[i]);
		}

	}

	public static void marsenesPrime() {

	}

	public static void amstrongovBroj() {
		int prviBroj;
		int drugibroj;
		int trecibroj;
		int amstrong;
		for (int i = 1; i < 1000; i++)// I broj jedan 1 je amstrongov broj
		{

			prviBroj = i / 100;
			drugibroj = i % 100 / 10;
			trecibroj = i % 10;
			amstrong = (int) (Math.pow(prviBroj, 3) + Math.pow(drugibroj, 3) + Math
					.pow(trecibroj, 3));
			if (amstrong == i) {

				System.out.println("" + i);

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out
				.println(" Unesite metodu koju zelite da bude ispisana: \n 1.Ispisi sve proste brojeve manje od 1000 \n 2.Ispisi prvih 100 emirp brojeva \n 3.Svi fibonacijevi brojevi manji od 100\n 4. Ispisi 100 marsenes prime brojeva\n 5. ispisi sve amstrongove brojeve do 1000");
		byte izborMetode;
		do {
			izborMetode = unos.nextByte();
			if (izborMetode < 0 || izborMetode > 6)
				System.out
						.println("Niste unijeli nijednu mogucu opciju unesite ponovo");
		} while (izborMetode < 0 || izborMetode > 6);
		unos.close();
		if (izborMetode == 1)
			primeLessThan100Print();
		if (izborMetode == 2)
			emirps100();
		if (izborMetode == 3)
			fibonaciLessThan100();
		if (izborMetode == 4)
			marsenesPrime();
		if (izborMetode == 5)
			amstrongovBroj();
	}

}
