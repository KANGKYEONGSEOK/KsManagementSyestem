import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LogCreatorHW {

	public static void main(String[] args) {
		Date date = new Date();
		Scanner input = new Scanner(System.in);
		//System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("\n" +"yyyy년MM월dd일 HH시mm분ss초" );
		//for(int i=0; i<4; i++) {
		try {
			FileOutputStream file = new FileOutputStream("LogCreator.txt",true);
			file.write(format.format(date).getBytes());
			file.write(input.nextLine().getBytes());
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//}
		
		//System.out.println(format.format(date));
		
		
		byte b[] = new byte[1024];
		try {
			FileInputStream file = new FileInputStream("LogCreator.txt");
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
