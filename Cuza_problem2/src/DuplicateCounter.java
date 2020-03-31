// Importing classes
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class DuplicateCounter {	// Takes a txt file and removes duplicate words and display unique words in a separate txt file.
	Map<String, Integer> wordCounter = new HashMap<String, Integer>();
	public void count(String dataFile) {		// remove method, takes parameter String dataFile
		File file1 = new File(dataFile);			// Creating new file with name saved in dataFile
		try {
			Scanner input = new Scanner(file1);	// Create new scanner 
			while(input.hasNext()){				// Loops until end of file
				String temp = input.next().toLowerCase();	// Reads file for words and changes all letters to lower case and save in temp
				if(wordCounter.containsKey(temp)) {			// Checks if String is in Map
					int i = wordCounter.get(temp);			// If it is count returned
					wordCounter.put(temp, i+1);				// Saves count with String in wordCounter
				}
				else
					wordCounter.put(temp, 1);
			}
			input.close();	// Closes Scanner
		}
		catch(FileNotFoundException ex) { // Catches error if program cannot not find the file
			System.out.println("File Not Found.");	// Display Message
		}
	}
	public void write(String outputFile) {	// write method, takes parameter String outputFile
		File file2 = new File(outputFile);	// Creating new file with name saved in outputFile
		try {
			java.util.Formatter output = new Formatter(file2);	// Creates new Formatter 
			for(Map.Entry<String, Integer> data : wordCounter.entrySet())	// Loop
				output.format(data.getKey() +": "+data.getValue()+"\n");	// Prints out contents in wordCounter
			output.close();		// Closes Formatter
		}
		catch(IOException ex) {		// Catches error I/O Exception
			System.out.println("I/O Exception Error.");	// Display Message
		}
	}
}
