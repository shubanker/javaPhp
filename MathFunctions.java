import java.util.Random;


public class MathFunctions extends basic {
	public static double abs(double Number) {
		return Math.abs(Number);
	}
	public static int abs(int Number) {
		return Math.abs(Number);
	}

	public static double pow(Double exponent,Double power) {
		return Math.pow(exponent, power);
	}
	public static double pow(int exponent,Double power) {
		return Math.pow(exponent, power);
	}
	public static double pow(Double exponent,int power) {
		return Math.pow(exponent, power);
	}
	public static double pow(int exponent,int power) {
		return Math.pow(exponent, power);
	}
	

	public static double sqrt(Double number) {
		return Math.sqrt(number);
	}
	public static double sqrt(int number) {
		return Math.sqrt(number);
	}
	
	public static Double pi() {
		return Math.PI;
	}
	public static int round(double number) {
		return (int)Math.round(number);
	}
	
	public static int rand(int min, int max) {
		if(max<min){
			int tem=min;
			min=max;
			max=tem;
		}
	    Random rand = new Random();
	    return rand.nextInt((max - min) + 1) + min;

//	    return randomNum;
	}
	public static int rand(int max){
		return rand(0,max);
	}
	//Returning An Random no between 0 and 999999
	public static int rand(){
		return rand(0,999999);
	}
	

	public static double sin(double number) {
		return Math.sin(number*Math.PI/180);
	}
	public static double sinh(double number) {
		return Math.sinh(number);
	}
	public static double cos(double number) {
		return Math.cos(number*Math.PI/180);
	}
	public static double cosh(double number) {
		return Math.cosh(number);
	}
	public static double tan(double number) {
		return Math.tan(number*Math.PI/180);
	}
	public static double tanh(double number) {
		return Math.tanh(number);
	}
	public static double exp(double number) {
		return Math.exp(number);
	}

	public static double log(double number) {
		return Math.log(number);
	}
	public static double log(double number,double base) {
		return Math.log(number)/Math.log(base);
	}
	public static double log10(double number) {
		return Math.log10(number);
	}
	public static double log1p(double number) {
		return Math.log1p(number);
	}
	public static double ceil(double number) {
		return Math.ceil(number);
	}
	public static double floor(double number) {
		return Math.floor(number);
	}
}
