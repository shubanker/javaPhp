package Php;

public class StringFunctions extends FileFunctions {
	public static String str_replace(String search,String replace,String subject){
		return subject.replaceAll(search, replace);
	}
	//For Replacing Multiple Values with one
	private static String str_replace(String search[],String replace,String subject,boolean isCaseSensitive) {
		int min=0,start=0,toReplace=0,pos;
		
		//Finding the first value to replace
		while(start<subject.length()){
			min=subject.length();
			for (int i = 0; i < search.length; i++) {
				//Getting the position of first occurance of the replacing value starting from index start.
				pos=isCaseSensitive?strpos(substr(subject, start), search[i]):stripos(substr(subject, start), search[i]);
				if(pos!=-1&&pos<min){
					min=pos;
					toReplace=i;
				}
			}
			
			if(min==subject.length())
				return subject;
			else{
				subject=subject.replaceFirst((isCaseSensitive?"":"(?i)")+search[toReplace], replace);
			}
			
			start=min+search[toReplace].length();
			
		}
		return subject;
	}
	public static String str_replace(String search[],String replace,String subject){
		return str_replace(search, replace, subject, true);
	}
	
	public static String str_ireplace(String search,String replace,String subject){
		return subject.replaceAll("(?i)"+search, replace);
	}

	public static String str_ireplace(String search[],String replace,String subject){
		return str_replace(search, replace, subject, false);
	}
	
	
	public static int strlen(String string){
		return string.length();
	}
	public static String str_repeat(String string,int iterations) {
		if (iterations<1) {
			return "";
		}else {
			return iterations==1?string:(str_repeat(string+string, (int)iterations/2)+(iterations%2==0?"":string));
		}
		
	}
//	public static String str_repeat(String string,int iterations) {
//		/*
//		String t="";
//		while(n-->0){
//			t+=s;
//		}
//		return t;
//		*/
//		if(iterations<=1)
//			return iterations==1?string:"";
//		
//		String tem="",main_temp=string;
//		if(iterations%2!=0){
//			iterations--;
//			tem=string;
//		}
//		while(iterations>1){
//			if(iterations%2==0){
//				iterations/=2;
//				main_temp+=main_temp;
//			}else{
//				iterations--;
//				tem+=main_temp;
//			}
//		}
//		return main_temp+tem;
//	}
	
	
	/*
	public static String str_repeat(String s,int n){
		String tem,main;
		tem="";
		main=n>0?s:"";
		if(n%2==0)n--;
		while(n>0){
			if(n%2!=0){
				n-=1;
				tem+=s;
			}
			if(n==0)break;
			main+=main;
			n/=2;
		}
		return main+tem;
	}
	*/
	public static String htmlspecialchars(String string) {
		return str_ireplace("\"", "&quot;", str_ireplace("'", "&#039;", str_ireplace("<", "&lt;", str_ireplace(">", "&gt;", str_ireplace("&", "&amp;", string)))));
	}
	public static String htmlentities(String string) {
		return htmlspecialchars(string);
	}
	public static String strtolower(String string) {
		return string.toLowerCase();
	}
	public static String strtoupper(String string) {
		return string.toUpperCase();
	}
	public static String trim(String string) {
		return string.trim();
	}
	public static int strpos(String string,String find, int start) {
		return string.indexOf(find,start);
	}
	public static int strpos(String string,String find) {
		return string.indexOf(find,0);
	}
	//Something Extra
	public static int stripos(String string,String find, int start) {
		string=string.toLowerCase();
		return string.indexOf(find.toLowerCase(),start);
	}
	public static int stripos(String string,String find) {
		string=string.toLowerCase();
		return string.indexOf(find.toLowerCase(),0);
	}
	
	
	public static String substr(String string,int start,int length) {
		return string.substring(start, length);
	}
	public static String substr(String string,int start) {
		return string.substring(start);
	}
	public static String str_shuffle(String string) {
		int len=string.length(),tem;
		String st[]=string.split(""),swap;
		for (int i = 1; i <= len; i++) {
			tem=rand(1, len);
			swap=st[i];
			st[i]=st[tem];
			st[tem]=swap;
		}
		return emplode(st);
	}
}