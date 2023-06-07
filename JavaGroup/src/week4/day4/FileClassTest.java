package week4.day4;
import java.io.File;
public class FileClassTest {
public static void main(String[] args) {
	File file;
	file =new File("C:\\Users\\Dell\\Desktop\\JavaProject\\MyFile.txt");
	System.out.println("....");
	
	//boolean	canRead()
	/*if (file.canRead()) {
		System.out.println("The file can be read");
	}
	else {
		System.out.println("We can read file");
	}*/
	
	//boolean	canWrite()
	if (file.canWrite()) {
		System.out.println("we can write on file");
	}
	else {
		System.out.println("We can not write on file");
	}

}
}
