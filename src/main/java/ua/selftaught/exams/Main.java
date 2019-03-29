package ua.selftaught.exams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		Properties props = new Properties();
		
		try {
			props.load(Main.class.getClassLoader().getResourceAsStream("app.properties"));
			System.out.println(props.get("ua.selftaught.name"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		
	}

}
