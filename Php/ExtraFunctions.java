package Php;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExtraFunctions extends Security {
	
	
	/*
	 * Returns position of nth occurance of a substring inside a string.
	 */
	public static int nth_occurance(String string,String match,int n) {
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
	
	/*
	 * Get string berween two sub-string starting with nth occurance of start string.
	 */ 
	public static String get_str_berween(String string,String start,String end,int n) {
		string=" "+string;
		int ini=nth_occurance(string, start, n);
		if (ini==-1) {
			return "";
		}
		ini+=start.length();
		int len=string.indexOf(end, ini);
		return string.substring(ini, len);
	}
	//Get string between  two string.
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
		return get_random_string(rand(3, 100));
	}
	
	/*
	 * Take input from user while displaying message.
	 */
	public static String get_input(String prompt) {
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
	public static String get_input() {
		return get_input(null);
	}
	public static byte get_input_byte(String prompt) {
		return Byte.parseByte(get_input(prompt));
	}
	public static byte get_input_byte() {
		return Byte.parseByte(get_input(null));
	}
	public static short get_input_short(String prompt) {
		return Short.parseShort(get_input(prompt));
	}
	public static short get_input_short() {
		return Short.parseShort(get_input(null));
	}
	public static int get_input_int(String prompt) {
		return Integer.parseInt(get_input(prompt));
	}
	public static int get_input_int() {
		return Integer.parseInt(get_input(null));
	}
	public static float get_input_float(String prompt) {
		return Float.parseFloat(get_input(prompt));
	}
	public static float get_input_float() {
		return Float.parseFloat(get_input(null));
	}
	public static double get_input_double(String prompt) {
		return Double.parseDouble(get_input(prompt));
	}
	public static double get_input_double() {
		return Double.parseDouble(get_input(null));
	}
	public static long get_input_long(String prompt) {
		return Long.parseLong(get_input(prompt));
	}
	public static long get_input_long() {
		return Long.parseLong(get_input(null));
	}
	public static char get_input_char(String prompt) {
		return get_input(prompt).charAt(0);
	}
	public static char get_input_char() {
		return get_input(null).charAt(0);
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
	public static boolean is_prime(int number){
		
		//Checking for negative numbers.
		if (number<0) {
			number*=-1;
		}
		
		if ((number%2==0&&number!=2)||number%3==0) {
			return false;
		}
		int sqrt=(int)Math.ceil(Math.sqrt(number)),tem=5;
		while (tem<=sqrt) {
			if (number%tem==0||number%(tem+2)==0) {//Skipping checking divisibility by numbers known to be divisible by 3.
				return false;
			}
			tem+=6;
		}
		return true;
	}
	
	//For maintaining the units
//	public static int reverse(int n) {
//		int op=0,tem=0;
//		//Removing all zeros from end.
//		while (n%10==0) {
//			tem++;
//			n/=10;
//		}
//		//Reversing number
//		while (n>0) {
//			op=op*10+(n%10);
//			n/=10;
//		}
////		while (tem-->0) {
////			op*=10;
////		}
//		op*=Math.pow(10, tem);//Finally Adding Zeroes.
//		return op;
//	}
}
