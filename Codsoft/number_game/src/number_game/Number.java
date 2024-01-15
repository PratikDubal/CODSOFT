package number_game;

import java.util.Scanner;

public class Number {
	
	static Scanner sc = new Scanner(System.in);
	
	public static boolean guess()
	{
		int k = (int) (Math.random() * 100) +1;
		
		int chance = 10;
		
        System.out.println("Lets play a game ");
        
        System.out.println("Enter Number between 1 to 100");
        
		while(chance > 0)
		{
			 System.out.println("Enter Your guessing Number : ");
			int num = sc.nextInt();
			 
			if(num == k)
				
		        return true;
			
			else if (num > k ) {
				System.out.println("Your guess is too high.\n You have" +(chance - 1)+" tries left.");
			        chance--;
			}
			
			else 
			{
			    System.out.println("Your guess is too low.\nYou have " + (chance - 1) + " tries left.");
			}
			chance--;
		}
		return false;	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Number Guessing Game!");

		System.out.println("You have 10 chances to play this game!!!1");
		
		boolean correct = Number.guess();
		
		if(correct == true )
			System.out.println("the number you have guessed is right!!");
		else
		{
			System.out.println("the number you have guessed is wrong!!");	
		}
		
		System.out.println("!!!!!Thnak you for playing number guessing game!!!!!");				
	}
}
