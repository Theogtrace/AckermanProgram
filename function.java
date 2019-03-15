package Ack;

import java.util.ArrayList;
import java.util.Scanner;


public class function {
	public static int count=0;
	public static void main(String[] args)
	 {
		Scanner keyboard = new Scanner(System.in);
		
		int M = 3;
		int N = 8;
		int pick=0;
		while(pick!=4){
			pick=0;
		System.out.println("Please choose a version of Ackermann's function");
		System.out.println("	1) Ackermann value");
		System.out.println("	2) Ackermann trace");
		System.out.println("	3) Ackermann table lookup");
		System.out.println("	4) Quit");		
		pick=keyboard.nextInt();
		switch(pick){
			case 1: {
				System.out.println("Please give M then N");
				M = keyboard.nextInt();
				N = keyboard.nextInt();
				System.out.println("Ackermann: "+fastAck(M,N));
				}
			case 2:{
				count = 0;
				System.out.println("Please give M then N");
				M = keyboard.nextInt();
				N = keyboard.nextInt();
				System.out.println("Ackermann: "+Ackermann(M,N));
			}
			case 3:{
				
				
				tableAck(M,N);
				
			}
		}
		}
		
	 }

	

	private static int fastAck(int m, int n)
	{
		if(m==0)
			n++;
		else{
			if(n==0)
				n = fastAck(m-1,1);
			else
				n = fastAck(m-1,fastAck(m,n-1));
		}
		return n;
	}

	private static int tableAck(int m, int n) {
		ArrayList<String> tableLookup = new ArrayList<String>(8190);
		int index=0;
		while(tableLookup.get(index) != null){
			
			index++;
		}
		if(m==0)
			n++;
		else{
			if(n==0)
				n = fastAck(m-1,1);
			else
				n = fastAck(m-1,fastAck(m,n-1));
		}
		tableLookup.add(""+m+","+n+" = "+n);
		return n;
		
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
