package ToStringDemo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Path path=Paths.get("D:\\DemoFile\\newFile");
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
