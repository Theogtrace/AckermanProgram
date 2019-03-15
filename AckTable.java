package Ack;
import java.util.Scanner;
public class AckTable 
{
	public static int[][] a = new int[4][10000];
	public static int i; 
	public static int j;
	String answer;
	public void AckTableMethod() throws InterruptedException
	{
		do
		{
			Scanner keyboard = new Scanner(System.in);
			AckTable ack = new AckTable();
			int m,n,result;
			System.out.println("Enter m and n vaule that you want to lookup.");
			m=keyboard.nextInt();
			n=keyboard.nextInt();
			result=ackermannfunction(m,n);
			entrytable(m,n,result);
			System.out.println("result =  " + result);
			System.out.println("Do you want to look up another number? yes or no");
			answer = keyboard.next();
			
		}while(answer.equalsIgnoreCase("yes"));
		
	}
	
	public static int ackermannfunction(int mvalue, int nvalue)
	{
		int value;
		if(mvalue==0)
		{
			return nvalue++;
		}
		else if(mvalue>0&&nvalue==0)
		{
			value = lookup(mvalue,nvalue);
			if(value==0)
			{
				return ackermannfunction(mvalue-1,1);
			}
			else 
			{
				return value;
			}
		}
		else if(mvalue>0&&nvalue>0)
		{
			value=lookup(mvalue,nvalue);
			if(value==0)
			{
				return ackermannfunction(mvalue-1,ackermannfunction(mvalue,nvalue-1));
			}
			else 
			{
				return value;
			}
					
		}
		return nvalue;
	}
	
	public static int lookup(int mvalue,int nvalue)
	{
		for(i=0;i<mvalue;i++)
		{
			for(j=0;j<nvalue;j++)
			{
				if(a[i][j]==a[mvalue][nvalue])
				return a[mvalue][nvalue];
				else 
				{
					return 0;
				}
			}
		}
		return 0;
	}
	
	public static void entrytable(int m,int n,int result1)
	{
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i][j]==result1)
				{
				System.out.println("for"+m+ "and" +n+"value =" +a[i][j]);
				}
				else
				{
					a[m][n]=result1;
				}
			}
			
		}
	}
	
	
	
	
}
