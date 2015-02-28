package Php;

public class ArrayFunctions extends MathFunctions{
	
	public static String emplode(String array[]){
		return emplode(array,"");
	}
	public static String emplode(String array[],String seperator){
		String tem="";
		for(int i=0;i<array.length-1;i++)
			tem+=array[i]+seperator;
		tem+=array[array.length-1];
		return tem;
	}
	public static String[] explode(String delimiter,String text){
		String temArray[]= text.split(delimiter);
		
		//If First Element of array==NULL
		if (temArray[0]=="") {
			String newArray[]=new String[temArray.length-1];
			for (int i = 0; i < newArray.length; i++) {
				newArray[i]=temArray[i+1];
			}
			return newArray;
		}
		
		return temArray;
	}
	
	public static String[] shuffle(String array[],int iterations){
		String t;
		int r;
		for(int j=0;j<iterations;j++)
			for(int i=0;i<array.length;i++){
				r=rand(array.length-1);
				t=array[r];
				array[r]=array[i];
				array[i]=t;
			}
		return array;
	}
	public static String[] shuffle(String array[]){
		return shuffle(array, 1);
	}
	public static int[] shuffle(int array[],int iterations) {
//		if (array.length==1) {
//			return array;
//		}
		int random,tem;
		for(int j=0;j<iterations;j++)
			for (int i = 0; i < array.length; i++) {
				random=rand(array.length-1);
				
				//TO make shure the array Values do not get Swapped by itself.
				//Update:Bug,never shuffels an array with length 2.
//				while(random==i){
//					random=rand(array.length-1);
//				}
				
				//Its Better to swap using 3rd variable in this case.
				if (random!=i) {
					tem=array[i];
					array[i]=array[random];
					array[random]=tem;
				}
//				array[i]+=array[random];
//				array[random]=array[i]-array[random];
//				array[i]=array[i]-array[random];
			}
		return array;
	}
	public static int[] shuffle(int array[]){
		return shuffle(array, 1);
	}
	
	public static int count(String array[]){return array.length;}
	public static int count(int array[]){return array.length;}
	public static int count(Double array[]){return array.length;}

	public static int[] array_push(int array[],int value[]) {
		int a[]=new int[array.length+value.length];
		for (int i = 0; i < array.length; i++) {
			a[i]=array[i];
		}

		for (int i = 0; i < value.length; i++) {
			a[i+array.length]=value[i];
		}
		return a;
	}
	public static int[] array_push(int array[],int value) {
		int a[]={value};
		return array_push(array, a);
	}
	public static double[] array_push(double array[],double value[]) {
		double a[]=new double[array.length+value.length];
		for (int i = 0; i < array.length; i++) {
			a[i]=array[i];
		}

		for (int i = 0; i < value.length; i++) {
			a[i+array.length]=value[i];
		}
		return a;
	}
	public static double[] array_push(double array[],double value) {
		double a[]={value};
		return array_push(array, a);
	}
	public static String[] array_push(String array[],String value[]) {
		String a[]=new String[array.length+value.length];
		for (int i = 0; i < array.length; i++) {
			a[i]=array[i];
		}

		for (int i = 0; i < value.length; i++) {
			a[i+array.length]=value[i];
		}
		return a;
	}
	public static String[] array_push(String array[],String value) {
		String a[]={value};
		return array_push(array, a);
		
	}
	

	public static int array_rand(int array[]) {
		return rand(array.length-1);
	}
	public static int[] array_rand(int array[],int number) {
		int output[]=new int[number];
		for (int i = 0; i < output.length; i++) {
			output[i]=rand(array.length-1);
		}
		return output;
	}
	public static int array_rand(String array[]) {
		return rand(array.length-1);
	}
	public static int[] array_rand(String array[],int number) {
		int output[]=new int[number];
		for (int i = 0; i < output.length; i++) {
			output[i]=rand(array.length-1);
		}
		return output;
	}
	public static int array_rand(double array[]) {
		return rand(array.length-1);
	}
	public static int[] array_rand(double array[],int number) {
		int output[]=new int[number];
		for (int i = 0; i < output.length; i++) {
			output[i]=rand(array.length-1);
		}
		return output;
	}
	
	/*
	 * array_shift can not work like in php,
	 * as it is not possible to modify the length of the array from an method unless,
	 * the variable is declared with the gobal scope(outside all the functions)
	 * the way user need to use this in java is by assigning the returned value to the variable.
	 * example:
	 * array=array_shift(array);//Note in PHP we only need to call array_shift(array) and it would return the first element of array and modify the array.
	 * 
	 */
	public static int[] array_shift(int array[]){
//		int a=array[0];
		int tem[]=new int[array.length-1];
		for (int i = 0; i < tem.length; i++) {
			tem[i]=array[i+1];
		}
		return tem;
//		int garbage[]=array;
//		array=tem;
//		print_r(array);
//		garbage=null;
//		System.gc();
//		return a;
	}
	public static String[] array_shift(String array[]){
		String tem[]=new String[array.length-1];
		for (int i = 0; i < tem.length; i++) {
			tem[i]=array[i+1];
		}
		return tem;
	}
	public static double[] array_shift(double array[]){
		double tem[]=new double[array.length-1];
		for (int i = 0; i < tem.length; i++) {
			tem[i]=array[i+1];
		}
		return tem;
	}
}
