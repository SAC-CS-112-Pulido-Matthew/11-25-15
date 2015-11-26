
public class Dice 
{
	private int roll = 0;
	
	public int Throw()
	{
		int range = (6 - 1) + 1;     
		roll = (int)(Math.random() * range) + 1;
	 	return roll;
	}
	
}
