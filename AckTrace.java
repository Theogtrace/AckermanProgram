package Ack;

import java.util.Scanner;

public class AckTrace 
{
	public static int count=0;
	public void AckTraceMethod() throws InterruptedException
	{
		int M =0;
		int N = 0;
		String answer;
		Scanner keyboard = new Scanner(System.in);
		do
		{
			count = 0;
			System.out.println("Please give M then N");
			M = keyboard.nextInt();
			N = keyboard.nextInt();
			System.out.println("Ackermann: "+Ackermann(M,N));
			System.out.println("Do you want to use another number? Yes or no");
			answer=keyboard.next();
		}while(answer.equalsIgnoreCase("yes"));
	}
	
	public static int Ackermann(int m, int n) 
	{
		if(m==0)
			n++;
		
		else{
			if(n==0)
				n = Ackermann(m-1,1);
				
			else
				n = Ackermann(m-1,Ackermann(m,n-1));
		}
		count++;
		System.out.println("count = "+count+" "+ "m = "+m + " " +"n = "+n);
		return n;
		
	}
}
