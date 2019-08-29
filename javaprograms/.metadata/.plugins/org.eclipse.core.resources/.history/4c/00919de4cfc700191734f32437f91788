package task;

public class InsertionSort {
	
	public static void Insertion(int a[])
	{
		int n=a.length;
		int temp=0;
		
		for(int i=0;i<n;i++)
		{
			temp=a[i];
			int j=0;
			j=i;
			while((j>0) && (a[j-1]>temp))
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int a[]= {2,5,4,6,1,10,9};
		Insertion(a);
	}

}
