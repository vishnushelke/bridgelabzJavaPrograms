package task;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of numbers you want to enter");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.print(" enter elements one by one");
		for(int i=0;i<n;i++)
		{
			//System.out.println("Enter the number at "+i+" location");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
		System.out.println("Enter the number you want to search");
		int search=sc.nextInt();
		
		int li=0;
		int hi=n-1;
		int mi=(li+hi)/2;
		while(li<=hi)
		{
			if(search==a[mi])
			{
				System.out.println("Number is at position "+mi);
				break;
			}
			else if(search<a[mi])
			{
				hi=mi-1;
			}	
			else
			{
				li=mi+1;
			}
			mi=(hi+li)/2;
		}
		sc.close();
	}

}
