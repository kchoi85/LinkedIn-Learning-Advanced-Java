package bufferedreaderex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
	//advantage: synchronized, safe to use in multithreaded application
	//faster than scanner, so good for long sections of text
	
	public static void main(String[] args) {
		
		File myFile = new File("C:\\Users\\kihoon\\Desktop\\FDM\\FDM Hours and Summary.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(myFile));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			
		}
		
	}
}
