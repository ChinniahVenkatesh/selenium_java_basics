import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class json_example {
	
	public static void main(String [] args) throws IOException, ParseException
	{

		JSONParser jsonparser = new JSONParser();
		JSONObject jsonobject = (JSONObject) jsonparser.parse(new FileReader("C:\\Users\\chinn\\selenium-sept\\Selenium_basics\\src\\test.json"));
		
		String json = jsonobject.toJSONString();
		System.out.println(json);
		//Object name = jsonobject.ge
	}

}
