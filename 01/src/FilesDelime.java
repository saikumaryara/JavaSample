import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesDelime {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("src/file1.txt"));
		FileWriter fw = new FileWriter("src/file2.txt");
		String currentLine;
		while ((currentLine = reader.readLine()) != null) {
			String[] arr = currentLine.split("\\|");
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i].compareTo(arr[j]) > 0) {
						String s1= arr[i];
						arr[i] = arr[j];
						arr[j] = s1;
					}
				}
				fw.write(arr[i]);
				fw.write("|");
				fw.flush();
			}
			fw.append("\n");
		}
        reader.close();
        fw.close();
	}

}
