package Demos;
import Php.Php;
public class Average {

	public static void main(String[] args) {
		int sum,n;
		sum=0;
		n=0;
		while(true){
			try {
				sum+=Php.get_input_int("Enter the number or to exit Enter any character.");
				n++;
			} catch (Exception e) {
				break;
			}
		}
		Php.echo("Average = ");
		Php.echo(n==0?0:(sum/n));
	}

}