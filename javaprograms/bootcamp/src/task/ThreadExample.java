package task;

public class ThreadExample {

	public static void main(String[] args) {
		int[] c=new int[10];
		MyThreadOdd t1=new MyThreadOdd();
		MyThreadEven t2=new MyThreadEven();
		
		int j=0;
		for (int i = 0; i < 5; i++) {
			c[j]=t1.run(j);
			j++;
			c[j]=t2.run(j);
			j++;
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}

}
