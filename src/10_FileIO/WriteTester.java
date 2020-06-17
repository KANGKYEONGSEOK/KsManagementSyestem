import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTester {

	public static void main(String[] args) {
		try {
			FileOutputStream file = new FileOutputStream("text.txt");
			
			file.write("Hellow World".getBytes()); // Byte를 가져와서 Byte단위로 쓰라는 뜻이다.
			
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) { 	
			e.printStackTrace();
		}
		

	}

}
