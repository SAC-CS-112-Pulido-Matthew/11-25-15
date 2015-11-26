
public class Game
{

	public static void main(String[] args) 
	{
		int threeDice = 0;
		
		ThreeDice_class dice = new ThreeDice_class();
		
		threeDice = dice.Throw();
		
		
		System.out.printf("Last dice roll is : %s", dice);
	}

}
