
public class Application {	// Application Class

	public static void main(String[] args) {	// Main method
		DuplicateCounter duplicateCounter = new DuplicateCounter();	// Creating new instance
		duplicateCounter.count("problem2.txt");			// Calling count method from DuplicateCounter class
		duplicateCounter.write("unique_word_counts");	// Calling write method from DuplicateCounter class
	}

}
