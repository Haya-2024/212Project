package cscProject;

import java.io.*;
import java.util.*;


class SearchEngine {
    private LinkedList<LinkedList<String>> documentIndex; // list of IDs containing list of words ((index))
    private LinkedList<LinkedList<Integer>> invertedIndex; // list of words containing list IDs ((inverted index))
    private List<String> stopWords; // list of stop words

    
    public SearchEngine() {
        documentIndex = new LinkedList<>();
        invertedIndex = new LinkedList<>();
        stopWords = new ArrayList<>();
                          }
    
    

    // Load stop words from file
    	 public void loadStopWords() { // Load stop words from file

             try  {
            	 
                File file = new File("stop.txt");
         		FileReader rf = new FileReader(file);
         		BufferedReader br = new BufferedReader(rf);
                String line;
                 
                 
                 while ((line = br.readLine()) != null) { 
                	 stopWords.add(line);
                 }//end while
                 
                 br.close();
                   
                 }//end try
             catch (Exception e) {
            System.out.println("problem in (loadStopWords) method");
                                 }//end catch
        
                                    }//end method
    	 
    	 

    	 
    	 
    
    public void loadDocuments() { // save documents ID and word in list for farther implement
        try  {
        	 
            File file = new File("dataset.csv");
     		FileReader rf = new FileReader(file);
     		BufferedReader br = new BufferedReader(rf);
         
            String line;
            br.readLine(); // Skip header
            int docId = 0; // To keep track of document IDs

            while ((line = br.readLine()) != null) {
            	
                List<String> words = processWords(line);
                
                index(docId, words);// Add to document index
                
                invertedIndex(docId, words); // Add to inverted index
                
                docId++;
                                                   }//end while
             br.close();
             
            }//end try
        
        catch (Exception e) {
        	System.out.println("problem in (loadDocuments) method");
                            }//end catch
    


        
        
        
    
        private List<String> processWords(String text) {
        }

        
        
        
        private void index(int docId, List<String> words) {
            LinkedList<String> wordList = new LinkedList<>(words); // Convert List<String> to LinkedList<String>
            documentIndex.insert(wordList); // Add to main index
            documentIndex.set(docId, wordList);//we are moving sequentially but to ensure it is in the right place we could use this
                                                           }

        public void printDocumentIndex() {
        	
        }
        
        
        
        private void invertedIndex(int docId, List<String> words) {
       
        }
        
      
        public void printInvertedIndex() {
        	
        }
        
        
        
        
        
        
        
        
        
        
    }

    
    
     
    
    
    