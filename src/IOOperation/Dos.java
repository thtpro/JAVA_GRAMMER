package IOOperation;

import java.io.File;
import java.io.IOException;

public class Dos {
public static void main(String[] args) {
	File dir =new File("dir");
    dir.mkdir();
 File f1 =new File(dir,"f1.txt");
 try{
	 f1.createNewFile();
 }catch(IOException e){
	 File  newDir =new File("newdir");
	 dir.renameTo(newDir);
 }
}
}
