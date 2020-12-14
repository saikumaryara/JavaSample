import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataKeyboardToFile {

	public static void main(String[] args) {
		//With Java 8, this can be very concise as:
		/*
		 * BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 * Stream<String> stream = in.lines().limit(20); // 20 is number of lines you
		 * want to read
		 * 
		 * try (PrintWriter pw = new PrintWriter("FileName.txt", "UTF-8")) {
		 * stream.map(s -> s) .forEachOrdered(pw::println); } catch
		 * (UnsupportedEncodingException | FileNotFoundException e) {
		 * e.printStackTrace(); }
		 */

	        // The reader and writer objects must be declared BEFORE
	        // the try block, otherwise they are not 'visible' to close
	        // in the finally block
	        Scanner reader = null;
	        FileWriter writer = null;
	        String inputText;

	        try {

	            // Reader and writer are instantiated within the try block,
	            // because they can already throw an IOException
	            reader = new Scanner(System.in);

	            // Do not forget, / is the escape sequence for a backslash
	            writer = new FileWriter("src/file1.txt");

	            // We read line by line, a line ends with a newline character
	            // (in Java a '\n') and then we write it into the file
	            while (true) {

	                inputText = reader.nextLine();

	                // If you type 'EXIT', the application quits
	                if (inputText.equalsIgnoreCase("EXIT")) {
	                    break;
	                }

	                writer.write(inputText);

	                // Add the newline character, because it is cut off by
	                // the reader, when reading a whole line
	                writer.write("\n");

	            }

	        } catch (IOException e) {

	            // This exception may occur while reading or writing a line
	            System.out.println("A fatal exception occurred!");

	        } finally {

	            // The finally branch is ALWAYS executed after the try
	            // or potential catch block execution

	            if (reader != null) {
	                reader.close();
	            }

	            try {

	                if (writer != null) {
	                    writer.close();
	                }

	            } catch (IOException e) {

	                // This second catch block is a clumsy notation we need in Java,
	                // because the 'close()' call can itself throw an IOException.
	                System.out.println("Closing was not successful.");

	            }

	        }

	}
}
