package may24th;

import java.io.File;

public class FolderDemo2 {

	public static void main(String[] args) {
		
		File f2=new File(System.getProperty("user.dir")+"\\xyz");
		
		f2.mkdir();
		
		System.out.println(".....");

	}

}
