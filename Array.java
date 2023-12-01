import java.util.Scanner;
public class Array 
{
	static int i,j,cal,size;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		size=sc.nextInt();
		int num[]=new int[size];
		//Accept numbers in array
		System.out.println("Enter number: ");
		for(i=0;i<size;i++)
			num[i]=sc.nextInt();
		System.out.println();
		display(num);
		greater(num);
		smallest(num);
		ascending(num);
		descending(num);
		
	}
	public static void display(int num[])
	{
		System.out.println("The numbers are: ");
		for(i=0;i<size;i++)
		{
			System.out.print("\t"+num[i]);
		}
		System.out.println();
	}
	public static void ascending(int num[])
	{
		int temp;
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Numbers in ascending order: ");
		for(i=0;i<size;i++)
			System.out.print("\t"+num[i]);
		System.out.println();
	}
	public static void descending(int num[])
	{
		int temp;
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Numbers in descending order: ");
		for(i=0;i<size;i++)
			System.out.print("\t"+num[i]);
		System.out.println();
	}
	public static void smallest(int num[])
	{
		cal=num[0];
		for(i=0;i<size;i++)
		{
			if(num[i]<cal)
				cal=num[i];
		}
		
		System.out.println("Smallest number is: "+cal);
	}
	public static void greater(int num[])
	{
		cal=num[0];
		for(i=0;i<size;i++)
		{
			if(num[i]>cal)
				cal=num[i];
		}
		System.out.println();
		System.out.println("Greatest number is: "+cal);
	}
}
