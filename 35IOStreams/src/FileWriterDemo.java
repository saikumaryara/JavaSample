import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
      FileWriter fw=new FileWriter("src/bac.txt");
                fw.write(97);
                fw.write("sai");
                fw.flush();
                System.out.println("Data saved in the file.");
	}

}
