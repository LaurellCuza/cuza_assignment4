// Importing classes
import java.util.Scanner;	
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import java.util.Formatter;
import java.util.HashSet;
import java.io.File;

public class DuplicateRemover {	// Takes a txt file and removes duplicate words and display unique words in a separate txt file.
	Set<String> uniqueWords = new HashSet<>();	// Creating a new Hash Set
	public void remove(String dataFile) {		// remove method, takes parameter String dataFile
		File file = new File(dataFile);			// Creating new file with name saved in dataFile
		try {
			Scanner input = new Scanner(file);	// Create new scanner 
			while(input.hasNext()){				// Loops until end of file
				String temp = input.next().toLowerCase();	// Reads file for words and changes all letters to lower case and save in temp
				uniqueWords.add(temp);	// Adds string in temp to set uniqueWords
			}
			input.close();	// Closes Scanner
		}
		catch(FileNotFoundException ex) {	// Catches error if program cannot not find the file
			System.out.println("File Not Found.");	// Display Message
		}
	}
	public void write(String outputFile) {	// write method, takes parameter String outputFile
		File file2 = new File(outputFile);	// Creating new file with name saved in outputFile
		try {
			Formatter output = new Formatter(file2);	// Creates new Formatter 
			output.format(uniqueWords+"\n");	// Prints out original words in file2
			output.close();		// Closes Formatter
		}
		catch(IOException ex) {		// Catches error I/O Exception
			System.out.println("I/O Exception Error.");	// Display Message
		}
	}
}
