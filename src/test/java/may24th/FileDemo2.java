package may24th;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("user.dir"));;
		
		File f1=new File(System.getProperty("user.dir")+"\\file1.txt");
		
		f1.createNewFile();

	}

}
