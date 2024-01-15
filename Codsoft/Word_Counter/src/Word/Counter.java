package Word;

import java.util.Scanner;

public class Counter {
	
	public static int word_count(String input)
	{
		 int count = 0;
	        if (!(" ".equals(input.substring(0, 1))) || !(" ".equals(input.substring(input.length() - 1))))
	        {
	            for (int i = 0; i < input.length(); i++)
	            {
	                if (input.charAt(i) == ' ')
	                {
	                    count++;
	                }
	            }
	            count = count + 1; 
	        }
	        return count;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the paragraph you want to check :  ");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println("Number of words are "+(Counter.word_count(input)));
		
	}

}
