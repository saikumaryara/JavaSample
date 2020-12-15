import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamPrimitiveSizes {

	public static void main(String[] args) throws IOException {

		/*
		 * FileOutputStream fos=new FileOutputStream("src/data.txt"); DataOutputStream
		 * dos=new DataOutputStream(fos);
		 */
		// or like bellow

		DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/data.txt"));

		dos.writeShort(97);// the data is stored in 2 bytes 1space and a
		dos.writeByte(98);// te data is stored as 1 byte 1space and ab
		dos.writeInt(99);// bytes so 3 space then c ascii value of 99 is c.
		dos.writeLong(48);
		dos.writeDouble(100.0);
		dos.writeBoolean(true);
		dos.writeChar('S');
		dos.writeUTF("SKY");
		dos.writeFloat(100.0f);

		System.out.println("Data saved");
		
	}

}
