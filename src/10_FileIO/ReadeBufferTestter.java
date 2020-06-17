import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadeBufferTestter {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("text.txt");
			BufferedReader in = new BufferedReader(file);
			
			while(true) {
				String str = in.readLine();
				
				if(str == null) {
					break;
				}				
				System.out.println(str);

			}
			in.close();
			
			// OR
			
//			String str;	
//			do {
//				str = in.readLine();
//
//				if(str != null) {
//					System.out.println(str);
//				}
//			}while (str != null);
//			in.close();
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
// https://www.youtube.com/watch?v=9_AWYpn94eE&feature=youtu.be (ÆÄÀÏ I/O 2) 
