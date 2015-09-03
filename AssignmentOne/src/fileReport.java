
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class fileReport {
	
	String[] fileSentences = new String[1000];
	int lines = 0; 
	int numFreq = 0;
	int numFreqWord = 0;
	Map<String, Integer> wordFreq = new HashMap<String, Integer>();
 
	
	public double fileSize(File f){
		return f.length();
	}
	
	public int characterCount(){
		int charCount = 0;
		for(int i = 0; i < lines; i++){
			for(int j = 0; j < fileSentences[i].length(); j++){
				if(Character.isLetterOrDigit(fileSentences[i].charAt(j))){
					charCount++; 
				}
			}
			
		}
		return charCount;
	}
	
	public char mostFreqChar(){
		
		char freqChar = '-';
		Map<Character, Integer> charIntMap = new HashMap<Character, Integer>();
		
		for(int i= 0; i < lines; i ++){
			for(int j = 0; j < fileSentences[i].length(); j++){
				char x = fileSentences[i].charAt(j);
				if(Character.isLetterOrDigit(x)){
					if(charIntMap.containsKey(x)){
						Integer val = charIntMap.get(x) + 1;
						charIntMap.put(x, val);
						System.out.print("line: " + i + "\n");
						System.out.print("char: " + x +"\n");

						System.out.print("numFreq: " + val +"\n");

						if (val > numFreq){
							freqChar = x;
							numFreq = val;
						}
					}
					else{
						charIntMap.put(x, 1);

					}
				}
			}
		}

		return freqChar;
	}
	
	public int wordCount(){
		int wordCount = 0;
		
		for(int i = 0; i < lines; i++){
			String words = fileSentences[i];
			StringTokenizer st = new StringTokenizer(words);
			wordCount = wordCount + st.countTokens();
			
			while (st.hasMoreTokens()) {
				String t = st.nextToken();
		         if(wordFreq.containsKey(t)){
		        	 Integer val = wordFreq.get(t) + 1;
		        	 wordFreq.put(t, val);
		         }
		         else{
		        	 wordFreq.put(t, 1);
		         }
		     }
		}
		
		return wordCount;
	}
	
	public String mostFreqWord(){
		String mostUsedWord = null;
		
		for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
		    String key = entry.getKey();
		    Integer value = entry.getValue();
		    
		    if(value > numFreqWord){
		    	numFreqWord = value;
		    	mostUsedWord = key;
		    }
		}
		
		return mostUsedWord;
	}
	
	public void makeReport(File f){
		System.out.print("\n FILE REPORT: \n");
		System.out.print("File Size: "+fileSize(f)+ " Bytes." + "\n"); //size of file
		System.out.print("Character Count:" + characterCount() + " Characters"+"\n"); //character count	
		System.out.print("Most Frequent Character: " + mostFreqChar()+ " ("+numFreq+" occurances)\n"); //most frequent character
		System.out.print("Total Word Count: " + wordCount()+ "\n"); //total word count
		System.out.print("Most Frequent Word: " + mostFreqWord()+ " ("+numFreqWord+" occurances)\n"); //most frequent word
	}
	public void readFile() throws IOException{
				
		InputStreamReader isr = new InputStreamReader(System.in);
		
		boolean fileDoesntWork = true;
		
		while(fileDoesntWork){
			
			System.out.print("Please enter a file name or path: ");
		
			try {
				BufferedReader br = new BufferedReader(isr);
				String file_path = br.readLine();
				
				if(new String(file_path).equals("exit")){
					return;
				}
												
				File f = new File(file_path);
				FileReader fr = new FileReader(f.getAbsolutePath());
				BufferedReader br2 = new BufferedReader(fr);
				boolean endOfFile = false;
				
				int counter = 0; 
				while(endOfFile == false){
					String line = br2.readLine();
					fileSentences[counter] = line;
					if (line == null){
						endOfFile = true;
						lines = counter;
						break;
					}
					System.out.println("Line #" +counter +" = " + line);

					counter++;
				}		
				
				fileDoesntWork = false;
				makeReport(f);
			} 
			catch (FileNotFoundException fnfe) {
				System.out.println("File doesn't exist. \n");
				continue;
			} 
			catch (IOException ioe) {
				System.out.println("File contents are not readable.");
				continue;
			}
		}
		return;	
	}
}