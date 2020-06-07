package fileanddirectories;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {

	public static void main(String[] args) {
		//creating files
		File myFile = new File("C:\\Users\\kihoon\\Desktop\\JavaFileCreation.txt");
		try {
			boolean fileCreated = myFile.createNewFile();
			System.out.println("File is created: " + fileCreated);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
