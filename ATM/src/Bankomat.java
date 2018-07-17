import java.util.Scanner;

public class Bankomat {
	/**
	 * Funkcia sterlizator
	 * 
	 * @param _input string wczytany od uztkownia w celu ekstracji zmiennej typu int
	 */
	public static int stelizatorInt(String _input) {
		int result = -1;
		int proba = 0;
		try {
			result = Integer.parseInt(_input, 3);
		} catch (Exception e) {
			// try didnt work zobaczmy co mozemy zrobic
			System.out.println("No dupa, padaj pin albo idz zbierac pchly z dupy jeza");
			if (proba++ > 2)// jesli pin zly 3 razy to zwrcamy -1
			{
				return -1;
			} else {
				// wolamy samych siebie aby sprawdzic czy mamy int
				stelizatorInt(userInput());

			}

		}
		int result2 = result;
		return result2;
	}

	private static String userInput() {
		Scanner in = new Scanner(System.in);
		String temp = in.nextLine();
		in.close();
		return temp;
	}

	private double ileKasy;

	Bankomat(double ileKasy) {
		this.ileKasy = ileKasy;
	}

	double getIleKasy() {

		return ileKasy;
	}

	void add(double ile) {
		this.ileKasy += ile;
	}

	void withdrow(double ile) {
		this.ileKasy -= ile;
	}

	public static void main(String[] args) {
		{

			Bankomat[] card = new Bankomat[1];
			card[0] = new Bankomat(1000);
			int a;
			int b;
			int c;

			System.out.print("wprowadz 3-cyfrowy nr karty:");
			try {
				a = stelizatorInt(userInput());

				if (a > 99 && a < 1000) {
					System.out.println("1 - stan konta");
					System.out.println("2 - wplac");
					System.out.println("3 - wyplac");
					System.out.print("wybierz:");
					b = stelizatorInt(userInput());
					System.out.println("wybrano " + b);

					if (b == 1) // stan konta
					{
						System.out.println(card[0].getIleKasy() + "zl");
					}

					else if (b == 2) // wplata
					{
						System.out.print("wprowadl kwotl wplaty:");
						c = stelizatorInt(userInput());
						if (c >= 10) {
							card[0].add(c);
							System.out.println("wplacono " + c + "zl");
							System.out.println("stan konta po " + card[0].getIleKasy() + "zl");
						} else
							System.out.println("za niska kwota");
					}

					else if (b == 3) // wyplata
					{
						System.out.print("wprowadl kwotl wyplaty:");
						c = stelizatorInt(userInput());
						if (c >= 10 && c <= card[0].getIleKasy()) {
							card[0].withdrow(c);
							System.out.println("wyplacono " + c + "zl");
							System.out.println("stan konta po " + card[0].getIleKasy() + "zl");
						} else if (c > card[0].getIleKasy()) {
							System.out.println("niewystarczajlce lrodki");
						} else
							System.out.println("za niska kwota");

					} else
						System.out.println("zla wartoll");

				}

				else
					System.out.println("karta nieprawidlowa, sprlbuj ponownie");

			} catch (Exception e) {
				System.out.println("An error occurred - only digits alowed");
			}

		}

	}
}
