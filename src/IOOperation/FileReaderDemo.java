package IOOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
public static void main(String[] args) throws IOException {
	try {
		FileReader fr =new FileReader(new File("a.txt"));
	    fr.read();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
