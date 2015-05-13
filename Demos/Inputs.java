package Demos;
import Php.Php;
public class Inputs {

	public static void main(String[] args) {
		/*
		 * Taking Inputs
		 */
		String s=Php.getInput();
		/*
		 * You can Even Pass a message as parameter which will be displayed before taking inputs.
		 */
		String s2=Php.getInput("Enter Your Name");
		//You can get inputs of type you want.
		int n=Php.getInputInt("Enter a Number");
		float f=Php.getInputFloat("Enter a Float value");
		
	}

}
