package homework;
import java.util.*;

public class Question2 
	{
	public static void main( String args[] )
		{
		Random rand = new Random();
		int low=1;
		int high=101;
		int int_random=rand.nextInt(high-low)+low;
		for (int i=0; i < 5; i++)
			{
			System.out.println("Guess a random number: ");
			
			Scanner sc=new Scanner(System.in);
			int guess = sc.nextInt();
			
			if(int_random-10 <= guess && guess <= int_random+10)
				{
				System.out.println("The number was "+int_random);
				break;
				}
			else if(i==4)
				{
				System.out.println("Sorry, "+int_random);
				
				}
			}
		}
	}
