import java.util.Scanner;
class PrimeNumbers
{
	public static void main(String [] args)
	{	Scanner scanner= new Scanner(System.in);
	int i;
	int num;
	String primeNumbers = "";
	System.out.println("enter the value of n:");
	int n= scanner.nextInt();

	     for(i=1;i<=n;i++)
	    {
	
				int counter=0;
				for(num=2;num<=i/2;num++)
				{	
							if(i%num==0)
								counter= counter +1;
				}
				if(counter==0&& i != 1)
				{
							primeNumbers=primeNumbers +i+ "\t";
			
				}
				
		}		
		System.out.println("prime no from 1 to 100 are:");
		System.out.println(primeNumbers);
	}
	
	
}