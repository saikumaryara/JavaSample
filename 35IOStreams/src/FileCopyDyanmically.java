import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyDyanmically {

	public static void main(String[] args) throws IOException {
   try {
	Scanner sc=new Scanner(System.in);
    String srcFile=null;
    String destFile=null;
    System.out.println("Enter Source FileName::");
    srcFile=sc.next();
	System.out.println("Enter Destination FileName::");
    destFile=sc.next();
	FileInputStream fis=new FileInputStream(srcFile);
    FileOutputStream fos=new FileOutputStream(destFile);
    int data;
    while((data=fis.read())!=-1) {
    	fos.write(data);
    }
    System.out.println("Data Copied.");
   }catch(FileNotFoundException fne) {
     throw new FileNotFoundException(fne.getMessage());
   }

 }
}
