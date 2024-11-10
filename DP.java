import java.io.*;
import java.util.*;


public class DP {
	
	public static void main(String[]args)throws Exception
	
	{
		try {
			
			File file = new File("dataset.csv");
			FileReader rf = new FileReader(file);
			BufferedReader bfr = new BufferedReader(rf);
			
			
			File file2 = new File("stop.txt");
			FileReader rf2 = new FileReader(file2);
			BufferedReader bfr2 = new BufferedReader(rf2);
			
			String str ;//reading lines
			// str = bfr.readLine();
			 
			 String stopWords = bfr2.readLine();
		     
		     while((str = bfr.readLine())!= null) 
		     {
		    	 LinkedL <String> L = new LinkedL < >();
		    	 
		    	 String [] word = str.split(" ");
		    	 for(int i = 0 ; i < word.length ; i++) {
		    		word[i]= word[i].toLowerCase();
		    		
		    		 while((stopWords= bfr2.readLine()) != null) {
		    			 
		    			 if(word[i].equals(stopWords))
		    				 break ;
		    			 else
		    				{L.insert(word[i].replaceAll("[^\\sa-zA-Z0-9]", ""));
		    				System.out.println(word[i]) ;}		    		 
		    		 }
		    		 }
		    	
		     }//end of while	
		     bfr.close();
		     bfr2.close();

		}//end of try

	
	
	
	
	catch (FileNotFoundException e) {
	System.out.println("Error opening file");
	
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
		

		/*read from file data set
		 * take the data and split it , convert it to lower case
		 * clean the data from the stop words "read stop words file "
		 */


