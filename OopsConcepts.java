package afternoon;
class Cycle
{
	String brand="FireFox";
	void peadling()
	{
		System.out.println("I have "+brand+" Cycle");
	}
}
class Bike
{
	String company="Royal Enfield";
	void ride()
	{
		System.out.println("We go outing with "+company+" bike");
	}
}
public class OopsConcepts {

	public static void main(String[] args)
	{
		Cycle c=new Cycle();
		c.peadling();
		Bike b=new Bike();
		b.ride();

	}
}

