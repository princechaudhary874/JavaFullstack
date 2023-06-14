package classtest;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class FileTest {
	public static void main(String[] args) {
		File file;
		File file2;
		File file3;
		File file4;
		File file5;
		File file6;
		// boolean createNewFile()
		try {
			/*
			 * file = new File("C:/Users/Dell/Desktop/JavaProject/MyFile.txt");// supported
			 * by all os file2 = new
			 * File("C:\\Users\\Dell\\Desktop\\JavaProject\\javafullstack/MyFILE2.txt");
			 * file3 = new
			 * File("C:\\Users\\Dell\\Desktop\\JavaProject\\javafullstack\\MyFIle3.txt");
			 * file4 = new
			 * File("C:/Users/Dell/Desktop/JavaProject/javafullstack/MyFIle4.txt");
			 * file5=new File("D:/MyFile5.txt/"); file6=new File("D:/MyFile6.txt/");
			 * System.out.println("......."); file6.createNewFile();
			 */

			// Copying file
			// Files.copy(file.toPath(), file2.toPath(),
			// StandardCopyOption.REPLACE_EXISTING);
			// Files.copy(file5.toPath(), file6.toPath(),
			// StandardCopyOption.REPLACE_EXISTING);

			// copy all file from source folder to destination folder
			String srcPath = "C:/Users/Dell/Documents/folder1";
			String destPath = "C:/Users/Dell/Documents/folder2";
			File files[] = new File("C:/Users/Dell/Documents/folder1").listFiles();
			System.out.println(files.length);

			for (File fil : files) {
				System.out.println(fil.getName());
				// copy file to destination folder
				Files.copy(srcPath + "/" + fil.getName(), 
						destPath + "/" + fil.getName(),
						StandardCopyOption.REPLACE_EXISTING);

			}

			/*
			 * if(file4.createNewFile()) {
			 * System.out.println("New file is created successfully."); } else {
			 * System.out.println("New file is not created."); }
			 */

			// boolean canExecute()
			/*
			 * if (file.canExecute()) { System.out.println("File is executed."); } else {
			 * System.out.println("File can no be executed."); }
			 */

			// boolean canRead()
			/*
			 * if(file.canRead()) { System.out.println("File can be read."); } else {
			 * System.out.println("File can not be read"); }
			 */

			// boolean canWrite()
			/*
			 * if(file.canWrite()) { System.out.println("We can write a file."); } else {
			 * System.out.println("We can not write a file"); }
			 */

			// boolean exists()->Tests whether pathname exists.
			/*
			 * if(file.exists()) { System.out.println("The file exists!"); } else {
			 * System.out.println("The file doesn't exist!"); }
			 */

			// int hashCode()->Computes a hash code for this abstract pathname.
			// System.out.println(file.hashCode());

			// boolean isAbsolute()
			/*
			 * if(file.isAbsolute()) { System.out.println("The file is absolute."); } else {
			 * System.out.println("The file is not absolute."); }
			 */

			// boolean isDirectory
			/*
			 * if(file.isDirectory()) { System.out.
			 * println("The file denoted by this abstract pathname is a directory."); } else
			 * { System.out.
			 * println("The file denoted by this abstract pathname is not a directory."); }
			 * //output->The file denoted by this abstract pathname is not a directory.
			 */

			// boolean isFile()
			/*
			 * if(file.isFile()) { System.out.
			 * println(" The file denoted by this abstract pathname is a normal file."); }
			 * else { System.out.
			 * println(" The file denoted by this abstract pathname is not a normal file.");
			 * 
			 * }
			 */

			// boolean isHidden()
			/*
			 * if(file.isHidden()) { System.out.println("The file is hidden."); } else {
			 * System.out.println("The file is not hidden."); }
			 */

			// boolean delete()
			/*
			 * if(file4.delete()) { System.out.println("File4 is deleted sucessfully!"); }
			 * else { System.out.println("file is not deleted"); }
			 */

			// boolean equals(Object obj)
			/*
			 * if(file.equals(file3)){ System.out.println("file and file3 are equals."); }
			 * else{ System.out.println("file and file3 are not equal"); }
			 */

			// String getAbsolutePath()
			/*
			 * String path=file.getAbsolutePath(); System.out.println(path);
			 */

			// File getCanonicalFile()
			/*
			 * File canonical=file2.getCanonicalFile(); System.out.println(canonical);
			 */

			// long getFreeSpace()->Returns the number of unallocated bytes
			/*
			 * long unallocated=file3.getFreeSpace(); System.out.println(unallocated);
			 */

			// String getName()
			/*
			 * String name=file2.getName(); System.out.println(name);
			 */

			// String getParent()
			/*
			 * String parent=file3.getParent();
			 * System.out.println(parent);//->C:\Users\Dell\Desktop\JavaProject\
			 * javafullstack
			 */

			// File getParentFile()
			/*
			 * File parentName=file2.getParentFile();
			 * System.out.println(parentName);//->C:\Users\Dell\Desktop\JavaProject\
			 * javafullstack
			 */

			// long getTotalSpace()

			/*
			 * long totalSpace=file.getTotalSpace();
			 * System.out.println(totalSpace/1024/1024/1024);//returns the size of the drive
			 * 
			 */

			// long getUsableSpace()

			/*
			 * long usableSpace=file.getUsableSpace();
			 * System.out.println(usableSpace/1024/1024/1024);
			 */
			/*
			 * //size of a file long result=file.length(); System.out.println(result);
			 */
			// long lastModified()
			/*
			 * long modified=file.lastModified(); System.out.println(modified);
			 */

			// long length()->returns length of the file
			/*
			 * long len=file.length(); System.out.println(len);//->output->0
			 */

			// String[] list()->returns an array of strings naming the files and directories
			// in the director
			/*
			 * String[] arr; arr=file2.list(); for(String i:arr) { System.out.println(i); }
			 */

			// boolean mkdir()

			/*
			 * if(file4.mkdir()) { System.out.println( "Creates the directory!"); } else {
			 * System.out.println("Doesn't create a directory!"); }
			 */

			// boolean mkdirs()
			/*
			 * if(file2.mkdirs()) { System.out.
			 * println("Creates the directory named by this abstract pathname, including any necessary but nonexistent parent directories."
			 * ); } else { System.out.println("Doesn't create a directory!"); }
			 */

			// boolean renameTo(File dest)
			/*
			 * if(file2.renameTo(file3)) { System.out.println("file2 is renamed to file3");
			 * } else { System.out.println("file 2 is not renamed"); }
			 */

		}
		/*
		 * catch (IOException eio) { System.out.println("Error : " + eio.getMessage());
		 * }
		 */

		/*
		 * catch(FileAlreadyExistsException fae) { System.out.println("Error : "+fae); }
		 */
		catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
