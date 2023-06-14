package classtest;

import java.io.FileWriter;

import java.io.FileReader;

import java.io.IOException;

public class CharacterWriteRead {

	// method to write a character to a file

	public static void writeChar(char ch) throws IOException {

		FileWriter f = new FileWriter("C:/Users/Administrator/Documents/NewFile.txt");

		f.write(ch); // write a character ch to a file

		f.close(); // close the filewriter object

	}

	// method to read a character from a file

	public static char readChar() throws IOException {

		FileReader fr = new FileReader("C:/Users/Dell/Documents/Filo.txt");

		char c = (char) fr.read(); // read a character ch to a file

		return c; // return the read character

	}

	public static void main(String[] args) throws IOException {

		// write character in file

		// read character from file

		try {

			writeChar('a'); // call the writeChar method

			System.out.println(readChar()); // call the readChar method and print the returned value

		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());

		}

	}

}
