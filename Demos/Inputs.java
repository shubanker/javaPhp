package Demos;
import Php.Php;
public class Inputs {

	public static void main(String[] args) {
		/*
		 * Taking Inputs
		 */
		String s=Php.get_input();
		/*
		 * You can Even Pass a message as parameter which will be displayed before taking inputs.
		 */
		String s2=Php.get_input("Enter Your Name");
		//You can get inputs of type you want.
		int n=Php.get_input_int("Enter a Number");
		float f=Php.get_input_float("Enter a Float value");
		
	}

}
