import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {

	public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("src/bbc.txt");
                      fos.write('a');
                      fos.write('b');
                      fos.write(99);
                      System.out.println("Data written to a file");
	}

}
