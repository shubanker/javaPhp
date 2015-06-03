package Demos;
import Php.Php;
/*
 * Generate all Prime numbers upto n;
 */
public class PrimeGen {
	public static void main(String[] args) {
		int n=Php.getInputInt("Enter Range");
		for (int i = 1; i <= n; i++) {
			Php.echo(Php.isPrime(i)?(i+"\n"):"");
		}
	}
}