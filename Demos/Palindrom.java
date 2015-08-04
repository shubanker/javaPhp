package Demos;
import Php.Php;
public class Palindrom {
	public static void main(String[] args) {
		String s=Php.getInput("Enter a String");
		Php.echo("The String is "+(s.compareTo(Php.strrev(s))==0?"":"not ")+"Palindrom");
	}
}