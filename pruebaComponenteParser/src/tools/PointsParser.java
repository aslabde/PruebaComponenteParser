package tools;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

public interface PointsParser {

	public HashMap<String,Integer> parsePoints (String seasson, String day) throws MalformedURLException, IOException;
	
}
