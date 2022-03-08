package data;

public class Linie 
{
	Punct a, b;
	Culoare culoare_linie;
	
	public Linie()
	{
		a = new Punct();
		b = new Punct();
		culoare_linie = new Culoare();
	}
}
