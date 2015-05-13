package Php;
public class basic{
	//Echo
	public static void echo(String sting){System.out.print(sting);}
	public static void echo(int sting){System.out.print(sting);}
	public static void echo(double sting){System.out.print(sting);}
	public static void echo(float sting){System.out.print(sting);}
	public static void echo(char sting){System.out.print(sting);}
	public static void echo(char[] sting){System.out.print(sting);}
	public static void echo(Object obj){System.out.print(obj);}
	public static void echo(boolean sting){System.out.print(sting);}
	public static void echo(byte[] sting){System.out.print(sting.toString());}
	
	
	//Printing array in saperate lines.
	public static void echo(String sting[]){
		for (String s : sting) {
			System.out.println(s);
		}
	}
	public static void echo(int sting[]){
		for (int s : sting) {
			System.out.println(s);
		}
	}
	public static void echo(double sting[]){
		for (double s : sting) {
			System.out.println(s);
		}
	}
	public static void echonl(String sting[]){
		echo(sting);
		System.out.println();
	}
	public static void echonl(int sting[]){
		echo(sting);
		System.out.println();
	}
	public static void echonl(double sting[]){
		echo(sting);
		System.out.println();
	}
	

	//Print
	public static void print(String sting){System.out.print(sting);}
	public static void print(int sting){System.out.print(sting);}
	public static void print(double sting){System.out.print(sting);}
	public static void print(String sting[]){echo(sting);}
	public static void print(int sting[]){echo(sting);}
	public static void print(double sting[]){echo(sting);}
	public static void print(float sting){System.out.print(sting);}
	public static void print(char sting){System.out.print(sting);}
	public static void print(char[] sting){System.out.print(sting);}
	public static void print(Object obj){System.out.print(obj);}
	public static void print(boolean sting){System.out.print(sting);}
	public static void print(byte[] sting){System.out.print(sting.toString());}
	
	/*
	 * Below Methods Are Not Avilable just Added for personal Use And Can be removed .
	 */
	public static void echoln(String sting){System.out.println(sting);}
	public static void echoln(int sting){System.out.println(sting);}
	public static void echoln(double sting){System.out.println(sting);}
	public static void echoln(float sting){System.out.print(sting);}
	public static void echoln(char sting){System.out.println(sting);}
	public static void echoln(char[] sting){System.out.println(sting);}
	public static void echoln(Object obj){System.out.print(obj);}
	public static void echoln(byte[] sting){System.out.println(sting.toString());}
	public static void echoln(boolean sting){System.out.println(sting);}
	
//	public static void echonl(String sting){System.out.println(sting);}
//	public static void echonl(int sting){System.out.println(sting);}
//	public static void echonl(double sting){System.out.println(sting);}
//	public static void echonl(float sting){System.out.print(sting);}
//	public static void echonl(char sting){System.out.println(sting);}
//	public static void echonl(char[] sting){System.out.println(sting);}
//	public static void echonl(Object obj){System.out.print(obj);}
//	public static void echonl(byte[] sting){System.out.println(sting.toString());}
//	public static void echonl(boolean sting){System.out.println(sting);}
	
	
	

//	public static void printnl(String sting){System.out.println(sting);}
//	public static void printnl(int sting){System.out.print(sting);}
//	public static void printnl(double sting){System.out.println(sting);}
//	public static void printnl(String sting[]){echonl(sting);}
//	public static void printnl(int sting[]){echonl(sting);}
//	public static void printnl(double sting[]){echo(sting);}
//	public static void printnl(float sting){System.out.println(sting);}
//	public static void printnl(char sting){System.out.println(sting);}
//	public static void printnl(char[] sting){System.out.println(sting);}
//	public static void printnl(Object obj){System.out.println(obj);}
//	public static void printnl(boolean sting){System.out.println(sting);}
//	public static void printnl(byte[] sting){System.out.println(sting.toString());}
	
	

	public static void println(String sting){System.out.println(sting);}
	public static void println(int sting){System.out.print(sting);}
	public static void println(double sting){System.out.println(sting);}
	public static void println(String sting[]){echonl(sting);}
	public static void println(int sting[]){echonl(sting);}
	public static void println(double sting[]){echo(sting);}
	public static void println(float sting){System.out.println(sting);}
	public static void println(char sting){System.out.println(sting);}
	public static void println(char[] sting){System.out.println(sting);}
	public static void println(Object obj){System.out.println(obj);}
	public static void println(boolean sting){System.out.println(sting);}
	public static void println(byte[] sting){System.out.println(sting.toString());}
	
	
	

	
	//Sop
//	public static void sop(String sting){System.out.print(sting);}
//	public static void sop(int sting){System.out.print(sting);}
//	public static void sop(double sting){System.out.print(sting);}
//	
//	public static void sopnl(String sting){System.out.println(sting);}
//	public static void sopnl(int sting){System.out.println(sting);}
//	public static void sopnl(double sting){System.out.println(sting);}
//	
//	public static void sop(String sting[]){echo(sting);}
//	public static void sop(int sting[]){echo(sting);}
//	public static void sop(double sting[]){echo(sting);}
//	
//	public static void sop(byte[] sting){echo(sting.toString()+"");}
	
	
	/*
	 * End Of UnNecessary Methods.
	 */
	
	//print_r
	private static void print_r(String array[],int indent){
		String ind="";
		while(indent-->0)
			ind+="\t";
		echo(ind+"Array\n" +ind+"(\n");
		for(int i=0;i<array.length;i++)
			echo(ind+" ["+i+"] => "+array[i]+"\n");
		echo(ind+")\n");
	}
	public static void print_r(String array[]){
		print_r(array,0);
	}
	public static void print_r(String array[][]){
		echo("Array\n(\n");
		for (int i = 0; i < array.length; i++) 
			print_r(array[i],1);
		echo(")\n");
	}
	
	private static void print_r(int array[],int indent){
		String ind="";
		while(indent-->0)
			ind+="\t";
		echo(ind+"Array\n" +ind+"(\n");
		for(int i=0;i<array.length;i++)
			echo(ind+" ["+i+"] => "+array[i]+"\n");
		echo(ind+")\n");
	}
	public static void print_r(int array[]){
		print_r(array,0);
	}
	public static void print_r(int array[][]){
		echo("Array\n(\n");
		for (int i = 0; i < array.length; i++) 
			print_r(array[i],1);
		echo(")\n");
	}
	private static void print_r(double array[],int indent){
		String ind="";
		while(indent-->0)
			ind+="\t";
		echo(ind+"Array\n" +ind+"(\n");
		for(int i=0;i<array.length;i++)
			echo(ind+" ["+i+"] => "+array[i]+"\n");
		echo(ind+")\n");
	}
	public static void print_r(double array[]){
		print_r(array,0);
	}
	public static void print_r(double array[][]){
		echo("Array\n(\n");
		for (int i = 0; i < array.length; i++) 
			print_r(array[i],1);
		echo(")\n");
	}
}
