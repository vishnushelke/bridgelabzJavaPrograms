package task;
import java.io.File;
import java.util.Scanner;
public class ReadFromFIle {

	public static void main(String[] args)throws Exception {
		File file=new File("/home/admin1/Desktop/McDonald");
		Scanner sc=new Scanner(file);
		
		
		String x="";
		while(sc.hasNextLine()) {
            
			x=x+"\n"+sc.nextLine();
			//System.out.println(x);
		}
		
		System.out.println(x);
		System.out.println();
		
		String x1=x.replaceAll("ANIMAL", "Chicks");
		String x2=x1.replaceAll("SOUND", "chick");
		
		System.out.println(x2);
		System.out.println();
		
		String x3=x2.replaceAll("chick", "Ducks"); 
		String x4=x3.replaceAll("chick", "quack");
		System.out.println(x4);
		System.out.println();
		
		String x5=x.replaceAll("ANIMAL", "Turkey");
		String x6=x5.replaceAll("SOUND", "gobble");
		System.out.println(x6);
		System.out.println();
		
		String x7=x2.replaceAll("Chicks", "cats"); 
		String x8=x7.replaceAll("chick", "meow,meow");
		System.out.println(x8);
		System.out.println();
		
		String x9=x.replaceAll("ANIMAL", "Mule");
		String x10=x9.replaceAll("SOUND", "Heehaw");
		System.out.println(x10);
		System.out.println();
		
		
		String x11=x2.replaceAll("Chicks", "Dogs"); 
		String x12=x11.replaceAll("chick", "bow bow");
		System.out.println(x12);
		System.out.println();
		
		String x13=x.replaceAll("ANIMAL", "Pig");
		String x14=x13.replaceAll("SOUND", "oink, oink");
		System.out.println(x14);
		System.out.println();
		
		String x15=x2.replaceAll("Chicks", "Turtles"); 
		String x16=x15.replaceAll("chick", "nerp, nerp");
		System.out.println(x16);
		System.out.println();
		
		String x17=x.replaceAll("ANIMAL", "Cow");
		String x18=x17.replaceAll("SOUND", "moo, moo");
		System.out.println(x18);
		System.out.println();
		sc.close();
	}

}
