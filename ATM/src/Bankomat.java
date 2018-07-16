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
		System.out.println("2 - wp³aæ");
		System.out.println("3 - wyp³aæ");
		System.out.print("wybierz:");
		b = scanner.nextInt();
		System.out.println("wybrano " + b);
		
		if (b == 1) //stan konta
		{
			System.out.println(card[0].getIleKasy() + "z³");
		}
		
		else if (b == 2) //wp³ata
		{
			System.out.print("wprowad¿ kwotê wp³aty:");
			c = scanner.nextInt();
			if (c >= 10)
			{card[0].add(c);
			System.out.println("wp³acono " + c + "z³");
			System.out.println("stan konta po " + card[0].getIleKasy() + "z³");
			}
			else 
			System.out.println("za niska kwota");
		}
		
		else if (b == 3) //wyp³ata
		{
			System.out.print("wprowad¿ kwotê wyp³aty:");
			c = scanner.nextInt();
			if (c >= 10 && c <= card[0].getIleKasy())
			{
			card[0].withdrow(c);
			System.out.println("wyp³acono " + c + "z³");
			System.out.println("stan konta po " + card[0].getIleKasy() + "z³");
			}
			else if (c > card[0].getIleKasy())
			{
			System.out.println("niewystarczaj¹ce œrodki");
			}
			else
			System.out.println("za niska kwota");
			
		}
		else
			System.out.println("z³a wartoœæ");
		
	}

	else
		System.out.println("karta nieprawid³owa, spróbuj ponownie");
	
	

	} catch (Exception e) {
		System.out.println("An error occurred - only digits alowed");
	}

	}
}


