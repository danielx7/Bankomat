import java.util.Scanner;

public class Bankomat {
	
	private double ileKasy;
	
	Bankomat(double ileKasy)
	{ 
		this.ileKasy = ileKasy;
	}
	
	double getIleKasy()
	{
		 
		return ileKasy;
	}
	
	 void add(double ile)
	{
			this.ileKasy +=ile;
	}
	
	 void withdrow(double ile)
	{
			this.ileKasy -=ile;
	}
	

	public static void main (String arg[])
	{
		
		Bankomat[] card = new Bankomat[1];
		card[0] = new Bankomat(1000);
		int a;
		int b;
		int c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("wprowadz 3-cyfrowy nr karty:");
		try {a = scanner.nextInt();

	if (a > 99 && a < 1000)
	{	System.out.println("1 - stan konta");
		System.out.println("2 - wplata");
		System.out.println("3 - wyplata");
		System.out.print("wybierz:");
		b = scanner.nextInt();
		System.out.println("wybrano " + b);
		
		if (b == 1) //stan konta
		{
			System.out.println(card[0].getIleKasy() + "zl½");
		}
		
		else if (b == 2) //wplata
		{
			System.out.print("wprowadz kwote wplaty:");
			c = scanner.nextInt();
			if (c >= 10 )
			{card[0].add(c);
			System.out.println("wprowadzono " + c + "zl");
			System.out.println("stan konta po " + card[0].getIleKasy() + "zl");
			}
			else 
			System.out.println("za niska kwota");
		}
		
		else if (b == 3) //wyplata
		{
			System.out.print("wprowadz kwote wyplaty:");
			c = scanner.nextInt();
			if (c >= 10 && c <= card[0].getIleKasy())
			{
			card[0].withdrow(c);
			System.out.println("wyplacono " + c + "zl");
			System.out.println("stan konta po " + card[0].getIleKasy() + "zl");
			}
			else if (c > card[0].getIleKasy())
			{
			System.out.println("niewystarczajace srodki");
			}
			else
			System.out.println("za niska kwota");
			
		}
		else
			System.out.println("zla wartosc");
		
	}

	else
		System.out.println("karta nieprawidlowa, sprobuj ponownie");
	
	

	} catch (Exception e) {
		System.out.println("An error occurred - only digits alowed");
	}

	}
}


