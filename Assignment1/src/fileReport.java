import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class fileReport {
	
	private String path;
	
	public void ReadFile(String file_path){
		path = file_path;
	}
	
	public String[] openFile()throws IOException{
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		String hithere[] = {"hi", "hey"};
		return hithere;
	}

}
