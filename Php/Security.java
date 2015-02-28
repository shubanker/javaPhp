package Php;
import java.security.*;


public class Security extends StringFunctions {
	public static String hash(String algorithm,String content)throws Exception {
		switch(algorithm){
		case "sha512":case "SHA512":
			algorithm="sha-512";
			break;
		case "sha256":case "SHA256":
			algorithm="sha-256";
			break;
		case "sha384":case "SHA384":
			algorithm="sha-384";
			break;
		}
		MessageDigest md = MessageDigest.getInstance(algorithm);
		md.update(content.getBytes());
		byte[] digest = md.digest();
		StringBuffer sb = new StringBuffer();
		for (byte b : digest) {
			sb.append(String.format("%02x", b & 0xff));
		}
		return sb.toString();
	}
	
	public static String hash(String algorithm,int content)throws Exception{
		return hash(algorithm,content+"");
	}
	public static String hash(String algorithm,Double content)throws Exception{
		return hash(algorithm,content+"");
	}
	public static String md5(String string)throws Exception {
		return hash("MD5",string);
	}
	public static String md5(int string)throws Exception {
		return md5(string+"");
	}
	public static String md5(Double string)throws Exception {
		return md5(string+"");
	}
	
	public static String sha1(String string)throws Exception {
		return hash("sha1",string);
	}
	public static String sha1(int string)throws Exception {
		return md5(string+"");
	}
	public static String sha1(Double string)throws Exception {
		return md5(string+"");
	}
	public static String password_hash(String password,int cost) {
//		String generatedSecuredPasswordHash="BCrypt UnAvailable";
//		generatedSecuredPasswordHash = BCrypt.hashpw(password, BCrypt.gensalt(cost));
//		return generatedSecuredPasswordHash;
		try{
			return BCrypt.hashpw(password, BCrypt.gensalt(cost));
		}catch(Exception e){
			return "BCrypt UnAvailable";
		}
	}
	public static String password_hash(String password) {
		return password_hash(password, 10);
	}
	public static boolean password_verify(String password,String hash) {
		try {
			return BCrypt.checkpw(password, hash);
		} catch (Exception e) {
			return false;
		}
	}
}
