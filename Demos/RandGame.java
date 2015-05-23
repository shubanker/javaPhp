package Demos;
import Php.Php;
/*
 * A Simple Number Gussing Gane
 */
public class RandGame {

	public static void main(String[] args) {
		
		int upperLimit=1;
		int points=10,n=0;
		while (points>0&&points<20) {
			try {
				//Taking an integer as input and if it matches random number increment point by one else -1
				points+=(n=Php.rand(0, upperLimit))==Php.get_input_int("Enter a number between 0-"+upperLimit)?2:-1;
			} catch (Exception e) {
				Php.echo("Enter a number");
			}
			Php.echo("Number was "+n+",Your currnet point : "+points+"\n");
		}
		Php.echo("You "+(points>0?"Win":"Loose"));
	}

}
