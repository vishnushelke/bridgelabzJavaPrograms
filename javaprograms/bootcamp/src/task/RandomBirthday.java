package task;
import java.util.Random;
public class RandomBirthday {

	public static void main(String[] args) {
		Random rand=new Random();
		String arr[]=new String[12];

		for(int i=0;i<12;i++)
		{
			arr[i]="";
		}
		for(int n=0;n<50;n++)
		{
			int y=rand.nextInt(2)+1993;
			int m=rand.nextInt(12)+1;
			int da=rand.nextInt(28)+1;
			
		
		
			switch(m)
			{
				
			case 1:arr[0]=(da+"/"+m+"/"+y)+" "+arr[0];break;
			case 2:arr[1]=(da+"/"+m+"/"+y)+" "+arr[1];break;
			case 3:arr[2]=(da+"/"+m+"/"+y)+" "+arr[2];break;
			case 4:arr[3]=(da+"/"+m+"/"+y)+" "+arr[3];break;
			case 5:arr[4]=(da+"/"+m+"/"+y)+" "+arr[4];break;
			case 6:arr[5]=(da+"/"+m+"/"+y)+" "+arr[5];break;
			case 7:arr[6]=(da+"/"+m+"/"+y)+" "+arr[6];break;
			case 8:arr[7]=(da+"/"+m+"/"+y)+" "+arr[7];break;
			case 9:arr[8]=(da+"/"+m+"/"+y)+" "+arr[8];break;
			case 10:arr[9]=(da+"/"+m+"/"+y)+" "+arr[9];break;
			case 11:arr[10]=(da+"/"+m+"/"+y)+" "+arr[10];break;
			case 12:arr[11]=(da+"/"+m+"/"+y)+" "+arr[11];break;
			default:System.out.println("invalid month");break;
			}
			
		}
		for(int i=0;i<12;i++)
		{
		
				System.out.println(arr[i]+" ");
			
		
		}
		System.out.println();

	}

}
