package Ack;

import java.util.Scanner;
public class AckMenue
{
	public void startMenue() throws InterruptedException
	{
		Scanner scan = new Scanner(System.in);
		FastAck game1 = new FastAck();
		AckTrace game2 = new AckTrace();
		AckTable game3 = new AckTable();
		int choiceNumber = 0;

		
		while(choiceNumber != 5)
		{
			printMenuChoices();
			choiceNumber = readChoiceNumber();
			switch (choiceNumber)
			{
			case 1:
				game1.FastAckMethod();
				break;
			case 2:
				game2.AckTraceMethod();
				break;
			case 3:
				game3.AckTableMethod();
				break;
			case 4:
				System.out.println("                     Thank you for playing.");
				choiceNumber = 5;
				break;
				default:
				System.out.println("         Invalid choice.  The game is over.");
				choiceNumber = 5;
				break;
			}//switch

		}//while
	}
	
	private void printMenuChoices()
	{
		System.out.println(""+
		 "                       1) Ackermann value. \n"
		+ "                       2) Ackermann trace. \n"
		+ "                       3) Ackermann table lookup. \n"
		+ "                       4) Quit. \n"
		+ "                      Please choose one of the choices.");

	}
	private static int readChoiceNumber()
	{
		Scanner scan = new Scanner(System.in);
		int choiceNumber;
		String indent = "                   ";
		choiceNumber = scan.nextInt();
		while(choiceNumber < 1 || choiceNumber > 5)
		{
			System.out.println(indent + "the number must be 1 through 4 inclusive");
			System.out.println(indent + "    please enter a proper choice.  ");
			choiceNumber = scan.nextInt();
		}
		return choiceNumber;
	}
}