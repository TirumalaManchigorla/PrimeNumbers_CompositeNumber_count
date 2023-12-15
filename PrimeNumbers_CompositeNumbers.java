import java.util.Scanner;
class PrimeNumbers_CompositeNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minimum value");
		int min = sc.nextInt();
		System.out.println("Enter maximum Value");
		int max = sc.nextInt();
		int primecount = 0;
		int compositecount = 0;
		for (int i=0;i<=max;i++)
		{
			int count = 0;
			for (int a=1;a<=i;a++)
			{
				if (i%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				primecount++;
			}
			else
			{
				compositecount++;
			}
		}
		System.out.println("Number of Prime Numbers : "+primecount);
		System.out.println("Number of Composite Numbers : "+compositecount);
	}
}
