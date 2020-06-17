import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderTestter {

	public static void main(String[] args) {
		byte b[] = new byte[1024];
		try {
			FileInputStream file = new FileInputStream("text.txt");
			file.read(b); 
			
			System.out.println(new String(b));

			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 

	}

}
// https://www.youtube.com/watch?v=uHuHxnV5ms0&feature=youtu.be (ÆÄÀÏ I/O) 
