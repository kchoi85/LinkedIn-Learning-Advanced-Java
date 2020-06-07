package iodirectory;

import java.io.File;
import java.io.FilenameFilter;

public class IODirectory {
	public static void main(String[] args) {
		
		FilenameFilter filter = (file, fileName) -> {
			return fileName.contains(".");
		};
		
		String[] contents = new File(".").list(filter);
		for (String file : contents) {
			System.out.println(file);
		}
		
		new File("myDirectory").mkdir();
	}
}
