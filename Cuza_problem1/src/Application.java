
public class Application {	// Runs methods
	public static void main(String[] args) {	// Main method
			DuplicateRemover duplicateRemover = new DuplicateRemover();	// Creates new instance
			duplicateRemover.remove("problem1.txt");	// Calls remove method
			duplicateRemover.write("unique_words.txt");	// Calls write method
	}
}
