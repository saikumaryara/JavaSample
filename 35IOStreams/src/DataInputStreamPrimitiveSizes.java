import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamPrimitiveSizes {

	public static void main(String[] args) throws IOException {

		/*
		 * FileInputStream fis = new FileInputStream("src/data.txt"); DataInputStream
		 * dis = new DataInputStream(fis);
		 */
		// or like bellow

		DataInputStream dis = new DataInputStream(new
		 FileInputStream("src/data.txt"));
		// the dis obj readXXX() in same order of the writeXXX() of dos obj
		
		System.out.println(dis.readShort());
		System.out.println(dis.readByte());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());	
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readUTF());
		System.out.println(dis.readFloat());


	}

}
