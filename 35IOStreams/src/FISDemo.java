
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("src/abc.txt");

		/*
		 * Creates a FileInputStream by opening a connection to an actual file, the file
		 * named by the path name name in the file system.
		 * /35IOStreams/src/abc.txt
		 */

		int data = fis.read();
		System.out.println(data);// 115
		System.out.println();

		System.out.println((char) data); // a
		System.out.println();

		int data1 = fis.read();
		System.out.println((char) data1);// b
		System.out.println();

		int data2 = fis.read();
		System.out.println((char) data2);// c
		System.out.println();

		int data3 = fis.read();
		System.out.println((char) data3);// -1 ?
		System.out.println();

		int i;
        
		while ((i = fis.read()) != -1) {
			System.out.print((char) i + "");
			// System.out.println(i); }
		}
		fis.close();
	}
}
