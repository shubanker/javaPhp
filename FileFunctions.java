import java.io.*;
import java.util.Formatter;

public class FileFunctions extends ArrayFunctions{
	public static Formatter x;
	public static boolean file_put_contents(String FileName,String data) {
		try{
			x=new Formatter(FileName);
		}catch(Exception e){
			System.out.println("Unable to open File"+e);
			return false;
		}
		x.format("%s", data);
		x.close();
		return true;
	}
	public static String file_get_contents(String FileName) throws IOException{
		//return "function Pending";
		String s="";
		int ch;
		try {
			FileInputStream fin=new FileInputStream(FileName);
			while((ch=fin.read())!=-1){
				s+=(char)ch;
			}
			fin.close();
		} catch (Exception e) {
			System.out.println("File Not Found or missing read permission.\n"+e);
		}
		return s;
	}
	public static boolean unlink(String FileName) {
		try {
			File f=new File(FileName);
			return f.delete();
		} catch (Exception e) {
			System.out.println("File Not Found or missing read permission.\n"+e+"\n");
			return false;
		}
	}
	public static void unlink(String Files[]) {
		for (int i = 0; i < Files.length; i++) {
			if (!unlink(Files[i])) {
				System.out.println("Unable to delete file=>"+Files[i]+"\nPlease Verify File exist\n");
			}
		}
	}
	public static boolean del(String FileName) {
		return unlink(FileName);
	}
	public static boolean delete(String FileName) {
		return unlink(FileName);
	}
	public static void  del(String Files[]) {
		unlink(Files);
	}
	public static void delete(String Files[]) {
		unlink(Files);
	}
	public static boolean file_exists(String FileName) {
		File f=new File(FileName);
		return f.exists();
	}
	public static boolean is_file(String FileName) {
		File f=new File(FileName);
		return f.isFile();
	}
	public static boolean is_dir(String FileName) {
		File f=new File(FileName);
		return f.isDirectory();
	}
	public static boolean is_readable(String FileName) {
		File f=new File(FileName);
		return f.canRead();
	}
	public static boolean is_writable(String FileName) {
		File f=new File(FileName);
		return f.canWrite();
	}
	public static boolean is_writeable(String FileName) {
		return is_writable(FileName);
	}
	public static boolean mkdir(String FileName) {
		File f=new File(FileName);
		return f.mkdir();
	}
	public static boolean rename(String oldname,String newname) {
		File f=new File(oldname),f2=new File(newname);
		
		return f.renameTo(f2);
	}
	public static long filesize(String FileName) {
		File f=new File(FileName);
		return f.length();
	}
}
