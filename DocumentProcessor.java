import java.io.*;
import java.util.*;


public class DocumentProcessor {
	
	public static void main(String[]args)throws Exception
	
	{
		
			try {
			
			File file = new File("dataset.csv");
			FileReader rf = new FileReader(file);
			BufferedReader bfr = new BufferedReader(rf);
			
			String str ;//reading lines
			String document ;
			
			 str = bfr.readLine();
		     // docId = 0;		     
		     
		     while(str != null) 
		     {
		    	 LinkedList <String> L = new LinkedList<String>();
		    	 
		    	 String [] word = str.split(" ");
		    	 
	    			 
		    	 
		    	
		     }	
		     bfr.close();

		}

	
	
	
	/*read from file data set
	 * take the data and split it , convert it to lower case
	 * clean the data from the stop words "read stop words file "
	 * 
	 
	 
	 */
	
	catch (FileNotFoundException e) {
		System.out.println("Error opening file");
	
	}
	
	
}
}


/*

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DocumentProcessor {
    private Set<String> stopWords;
    private List<String> rawWordsList; // List to store raw words

    public DocumentProcessor(Set<String> stopWords) {
        this.stopWords = stopWords;
        this.rawWordsList = new ArrayList<>(); // Initialize the list for raw words
    }

    public void processDocument(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        // Read each line from the document
        while ((line = reader.readLine()) != null) {
            // Process the line to extract raw words
            processLine(line);
        }
        reader.close();
    }

    private void processLine(String line) {
        // Split the line by spaces
        String[] words = line.split("\\s+");

        for (String word : words) {
            // Save the raw word to the list
            rawWordsList.add(word);
        }
    }

    public List<String> getRawWordsList() {
        return rawWordsList;
    }

    public static void main(String[] args) {
        // Define some stop words
        Set<String> stopWords = new HashSet<>(Arrays.asList("the", "is", "and", "a", "of", "to", "in"));

        DocumentProcessor processor = new DocumentProcessor(stopWords);

        try {
            // Process the document
            processor.processDocument("documents.txt"); // Replace with your file path
            // Get the list of raw words
            List<String> rawWords = processor.getRawWordsList();

            // Print the raw words
            System.out.println("Raw Words: " + rawWords);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DocumentProcessor {
    private Set<String> stopWords;
    private List<String> rawWordsList; // List to store raw words

    public DocumentProcessor(Set<String> stopWords) {
        this.stopWords = stopWords;
        this.rawWordsList = new ArrayList<>(); // Initialize the list for raw words
    }

    public void processDocument(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        // Read each line from the document
        while ((line = reader.readLine()) != null) {
            // Process the line to extract raw words
            processLine(line);
        }
        reader.close();
    }

    private void processLine(String line) {
        // Split the line by spaces
        String[] words = line.split("\\s+");

        for (String word : words) {
            // Save the raw word to the list
            rawWordsList.add(word);
        }
    }

    public List<String> getRawWordsList() {
        return rawWordsList;
    }

    public static void main(String[] args) {
        // Define some stop words
        Set<String> stopWords = new HashSet<>(Arrays.asList("the", "is", "and", "a", "of", "to", "in"));

        DocumentProcessor processor = new DocumentProcessor(stopWords);

        try {
            // Process the document
            processor.processDocument("documents.txt"); // Replace with your file path
            // Get the list of raw words
            List<String> rawWords = processor.getRawWordsList();

            // Print the raw words
            System.out.println("Raw Words: " + rawWords);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}*/


