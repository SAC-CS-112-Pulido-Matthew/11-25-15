public class ThreeDice_class 
{
	public int roll = 0;
	Dice D1 = new Dice();
	Dice D2 = new Dice();
	Dice D3 = new Dice();
	
	public int Throw()
	{
		return ((D1.Throw()+D2.Throw()+D3.Throw())/3);
	}
	
	@Override
	public String toString()
	{
		return String.format("%d", D3.Throw());
	}
}
