import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws FileNotFoundException,IOException {
    FileInputStream fis=new FileInputStream("abc.txt");
    FileOutputStream fos=new FileOutputStream("cbc.txt");
    int data;
    while((data=fis.read())!=-1) {
    	fos.write(data);
    }
    System.out.println("Data Copied.");
	}

}
