import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//class imports

public class fileMain {
	
	private static double askOptions() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		while(true){
			try{
				System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \nHello! Welcome to the file reader.\nMenu:\n\n"
						+ "1. File Report"+ "\n"
						+ "2. Directory Report" + "\n"
						+ "3. Compare Two Files" +"\n"
						+ "4. Compare Two Directories" + "\n"
						+ "5. Exit" + "\n"
						+ "\n" + "Please select an option: ");
				String answer = br.readLine();
				double answerNum = Double.parseDouble(answer);
				if(answerNum > 5 || answerNum < 1){ //integer put in that was not between 1 and 5
					System.out.print("Please enter a value between 1 and 5. \n\n");
					
				}
				else{
					return answerNum;
				}
			}	
			catch(IOException ioe){ //general exception thrown
				System.out.println ("IOException: " + ioe.getMessage());
			}
			catch(NumberFormatException e){ //incorrect type entered as answer
				System.out.print ("Please enter a value between 1 and 5. \n\n");
			}
			
		}//END WHILE
	}//END askOptions()
	
	
	//MAIN! 
	public static void main(String [] args) throws IOException {
		boolean ask = true;
		while(ask){
			
			double optionChoice = askOptions();
			
			if(optionChoice == 1){		
				System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \nLet's do a File Report!\n");
				fileReport fileRep = new fileReport();
				fileRep.readFile();	

			}
		}	
	}//END MAIN
}