import java.util.Scanner;

public class CreditCardProject
	{

	public static long userCreditCardNumber;
	public static void main(String[] args)
		{
		askUser();
		validation();
		
		}

		public static long askUser()
			{
			
			System.out.println("Please input a 16 digit credit card number");
			Scanner userInput = new Scanner (System.in);
			userCreditCardNumber = userInput.nextLong();
	
			return userCreditCardNumber;
			
			
			}

		public static void validation()
			{
			
			long[] creditCardArray = new long [16];

			for (int i =15; i > -1; i--)
				{
				creditCardArray[i] = userCreditCardNumber %10;
				userCreditCardNumber = userCreditCardNumber/10;
				}
			
			System.out.println();
		
			
			long newDoubleNumber =0;
			
			for (int i=0; i< 16; i=i+2)
				{
				newDoubleNumber = creditCardArray[i];
				long newNumber = newDoubleNumber *2;


				creditCardArray[i] = newNumber;
				}
			
			System.out.println();
			
			
			for (int i = 0; i < 16; i=i+2)
				{
				if ( creditCardArray[i] >= 10)
					{
					long sum = 0;
					long number = creditCardArray[i];
					
				for (int k = 0; k <2; k++)
					{
					long digit = number %10;
					number = number /10;
					sum = sum + digit;
					}
				creditCardArray[i] = sum;
				}
			
				}
			
			System.out.println();
			
			
			long numberDigit = 0;
			long totalSum = 0;
			
			for (int i = 0; i <16; i++)
				{
				totalSum = totalSum + creditCardArray[i];
				}
			if (totalSum %10 ==0)
			{
			System.out.println("This credit card is valid ");
			}
			else
				{
				System.out.print("This credit card is invalid");
				}
			
			
			
			
			}
	}
