package Demos;
import Php.Php;
public class Average {

	public static void main(String[] args) {
		int sum=0,n=0;
		while(true){
			try {
				sum+=Php.getInputInt("Enter the number or to exit Enter any character.");
				n++;
			} catch (Exception e) {
				break;//Exit when a non numerical value is entered.
			}
		}
		Php.echo("Average = ");
		Php.echo(n==0?0:((float)sum/n));
	}
}