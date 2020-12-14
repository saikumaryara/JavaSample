import java.io.*;

class  FileReaderDemo
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader fr =  new FileReader("src/abc.txt");
            
			int i ;
			while ((i = fr.read()) != -1)
			{
				System.out.print(i+" .... ");
				System.out.println((char)i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
}
