package Php;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExtraFunctions extends Security {
	
	
	
	public static int nthoccurance(String string,String match,int n) {
		int position=-1,start=0;
		for(int i=0;i<n;i++){
			position=string.indexOf(match,start);
			if (position==-1) {
				return position;
			}else{
				start=position+1;
			}
		}
		return position;
		
	}
	
	public static String get_str_berween(String string,String start,String end,int n) {
		string=" "+string;
		int ini=nthoccurance(string, start, n);
		if (ini==-1) {
			return "";
		}
		ini+=start.length();
		int len=string.indexOf(end, ini);
		return string.substring(ini, len);
	}
	public static String get_str_berween(String string,String start,String end) {
		return get_str_berween(string, start, end,1);
	}
	
	//To get a random String in an range of length
	public static String get_random_string(int min,int max) throws Exception {
		String output="";
		while(output.length()<max){
			output+=hash("sha512", Math.random()+"");
		}
		output=str_shuffle(output);
		return substr(output, 0, rand(min, max));
	}
	//To get an random string of fixed length
	public static String get_random_string(int size) throws Exception {
		return get_random_string(size,size);
	}
	//To get an random String of random length( between 3 to 100)
	public static String get_random_string() throws Exception {
//		int tem=rand(3, 100);
		return get_random_string(rand(3, 100));
	}
	
	public static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		if(prompt!=null){
			System.out.println(prompt);
		}
		
		System.out.flush();
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: "+ e.getMessage();
		}
		
	}
	public static String getInput() {
		return getInput(null);
	}
	public static byte getInputByte(String prompt) {
		return Byte.parseByte(getInput(prompt));
	}
	public static byte getInputByte() {
		return Byte.parseByte(getInput(null));
	}
	public static short getInputShort(String prompt) {
		return Short.parseShort(getInput(prompt));
	}
	public static short getInputShort() {
		return Short.parseShort(getInput(null));
	}
	public static int getInputInt(String prompt) {
		return Integer.parseInt(getInput(prompt));
	}
	public static int getInputInt() {
		return Integer.parseInt(getInput(null));
	}
	public static float getInputFloat(String prompt) {
		return Float.parseFloat(getInput(prompt));
	}
	public static float getInputFloat() {
		return Float.parseFloat(getInput(null));
	}
	public static double getInputDouble(String prompt) {
		return Double.parseDouble(getInput(prompt));
	}
	public static double getInputDouble() {
		return Double.parseDouble(getInput(null));
	}
	public static long getInputLong(String prompt) {
		return Long.parseLong(getInput(prompt));
	}
	public static long getInputLong() {
		return Long.parseLong(getInput(null));
	}
	public static char getInputChar(String prompt) {
		return getInput(prompt).charAt(0);
	}
	public static char getInputChar() {
		return getInput(null).charAt(0);
	}
	/*
	public static boolean isPrimeOld(int number){
//		int count=0;
		if (number<0) {
			number*=-1;
//			++count;
		}
		if (number%2==0&&number!=2) {
//			echo(++count);
			return false;
		}
		int sqrt=(int)Math.ceil(Math.sqrt(number));
		for (int i = 3; i <= sqrt; i+=2) {
			if (number%i==0) {
//				echo(++count);
				return false;
			}
//			++count;
		}
//		echo(++count);
		return true;
	}*/
	public static boolean isPrime(int number){
		
		//Checking for negative numbers.
		if (number<0) {
			number*=-1;
		}
		
		if ((number%2==0&&number!=2)||number%3==0) {
			return false;
		}
		int sqrt=(int)Math.ceil(Math.sqrt(number)),tem=5;
		while (tem<=sqrt) {
			if (number%tem==0||number%(tem+2)==0||number%(tem+4)==0) {
				return false;
			}
			tem+=8;
		}
		return true;
	}
}