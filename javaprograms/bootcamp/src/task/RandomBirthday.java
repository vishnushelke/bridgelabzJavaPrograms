package task;
import java.util.Random;
public class RandomBirthday {

	public static void main(String[] args) {
		Random rand=new Random();
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0;
		String arr[][]=new String[12][];
		
		for(int n=0;n<50;n++)
		{
			int y=rand.nextInt(2)+1993;
			int m=rand.nextInt(12)+1;
			int da=rand.nextInt(28)+1;
			
			switch(m)
			{
			case 1:a++;break;
			case 2:b++;break;
			case 3:c++;break;
			case 4:d++;break;
			case 5:e++;break;
			case 6:f++;break;
			case 7:g++;break;
			case 8:h++;break;
			case 9:i++;break;
			case 10:j++;break;
			case 11:k++;break;
			case 12:l++;break;
			default:System.out.println("invalid month");
			}
			
			
			arr[0]=new String[a];
			arr[1]=new String[b];
			arr[2]=new String[c];
			arr[3]=new String[d];
			arr[4]=new String[e];
			arr[5]=new String[f];
			arr[6]=new String[g];
			arr[7]=new String[h];
			arr[8]=new String[i];
			arr[9]=new String[j];
			arr[10]=new String[k];
			arr[11]=new String[l];
			
			a=0;b=0;c=0;d=0;e=0;f=0;g=0;h=0;i=0;j=0;k=0;l=0;
			switch(m)
			{
			case 1:arr[0][a]=(da+"/"+m+"/"+y)+arr[0];a++;break;
			case 2:arr[1][b]=(da+"/"+m+"/"+y)+arr[1];b++;break;
			case 3:arr[2][c]=(da+"/"+m+"/"+y)+arr[2];c++;break;
			case 4:arr[3][d]=(da+"/"+m+"/"+y)+arr[3];d++;break;
			case 5:arr[4][e]=(da+"/"+m+"/"+y)+arr[4];e++;break;
			case 6:arr[5][f]=(da+"/"+m+"/"+y)+arr[5];f++;break;
			case 7:arr[6][g]=(da+"/"+m+"/"+y)+arr[6];g++;break;
			case 8:arr[7][h]=(da+"/"+m+"/"+y)+arr[7];h++;break;
			case 9:arr[8][i]=(da+"/"+m+"/"+y)+arr[8];i++;break;
			case 10:arr[9][j]=(da+"/"+m+"/"+y)+arr[9];j++;break;
			case 11:arr[10][k]=(da+"/"+m+"/"+y)+arr[10];k++;break;
			case 12:arr[11][l]=(da+"/"+m+"/"+y)+arr[11];l++;break;
			default:System.out.println("invalid month");break;
			}
			//System.out.println(da+"/"+m+"/"+y);
		}
		for(i=0;i<12;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
