import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//class imports

public class main {
	
	private static double askOptions(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		while(true){
			try{
				System.out.print("Hello! Welcome to the file reader \n\n"
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
	public static void main(String [] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		double optionChoice = askOptions();
		
		if(optionChoice == 1){
			try{
				System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n Lets do a File Report! \n Please enter the name or path of a file:");
				String inFile = br.readLine();
				fileReport fileRep = new fileReport();
				fileRep.ReadFile("test");
			
			}
			catch(IOException ioe){
				System.out.print ("Please enter a value between 1 and 5. \n\n");
			}
		}
		
		System.exit(0);	
		
	}//END MAIN

}