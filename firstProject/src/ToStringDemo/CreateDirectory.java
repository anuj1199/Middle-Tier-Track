package ToStringDemo;

import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
public class CreateDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		try {
			Path path=Paths.get("D:\\DemoFile\\newFile");
			/*
			 * -----create directory-------------
			 * if(Files.exists(path)) System.out.println("File already exists"); else {
			 * //Path p=Files.createDirectories(path);
			 * 
			 * --------create path---------------
			 * //System.out.println("Direectory is created at "+p); Path
			 * p=Files.createFile(path); System.out.println("File is created at "+p); }
			 */
			/*
			 * ------------write into file----------
			 * String content ="Hello java!!!!!!"; Files.write(path, content.getBytes());
			 * System.out.println("Content written successfully");
			 */
			
			//------------read into files-----------------
			List<String>list=Files.readAllLines(path);
			for(String string:list) {
				System.out.println(string);
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
