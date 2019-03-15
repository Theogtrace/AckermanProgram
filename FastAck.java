package Ack;

import java.util.Scanner;

public class FastAck
{
	public void FastAckMethod() throws InterruptedException
	{
		int M =0;
		int N = 0;
		String answer;
		Scanner keyboard = new Scanner(System.in);
		do
		{
			System.out.println("Please give M then N");
			M = keyboard.nextInt();
			N = keyboard.nextInt();
			System.out.println("Ackermann: "+fastAck(M,N));
			System.out.println("Do you want to use another number? Yes or no");
			answer=keyboard.next();
		}while(answer.equalsIgnoreCase("yes"));
	}
	private static int fastAck(int m, int n)
	{
		if(m==0)
			n++;
		else
		{
			if(n==0)
				n = fastAck(m-1,1);
			else
				n = fastAck(m-1,fastAck(m,n-1));
		}
		return n;
	}

}
