import java.util.Scanner;
public class Array 
{
	static int i,j,cal,size=5;
	static int num[]=new int[size];  //Array
	public static void main(String[] args) 
	{
		accept();
		greater();
		smallest();
		ascending();
		descending();
		
	}
	public static void accept()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		size=sc.nextInt();
		
		//Accept numbers in array
		System.out.println("Enter number: ");
		for(i=0;i<size;i++)
			num[i]=sc.nextInt();
		
	}
	public static void ascending()
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
	public static void descending()
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
	public static void smallest()
	{
		cal=num[0];
		for(i=0;i<size;i++)
		{
			if(num[i]<cal)
				cal=num[i];
		}
		
		System.out.println("Smallest number is: "+cal);
	}
	public static void greater()
	{
		cal=num[0];
		//Display Array
		System.out.println("The numbers are: ");
		for(i=0;i<size;i++)
		{
			System.out.print("\t"+num[i]);
			if(num[i]>cal)
				cal=num[i];
		}
		System.out.println();
		System.out.println("Greatest number is: "+cal);
	}
}
