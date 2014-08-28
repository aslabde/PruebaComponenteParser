package toolsImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import tools.PointsParser;

public class PointsParserImpl implements PointsParser{
	
	static final String URL_BASE = "http://www.puntoscomunio.com/jornadaDD-AAAA.html";
	
	@Override
	public HashMap<String, Integer> parsePoints(String seasson, String day) throws IOException {
		
		HashMap<String, Integer> playersPoints = new HashMap<String,Integer>();
		
		URL url = new URL(buildURL(seasson, day));
		
		URLConnection uc = url.openConnection();
		
		InputStreamReader input = new InputStreamReader(uc.getInputStream());
		BufferedReader 		 in = new BufferedReader(input);
		String inputLine;
		boolean print = false;
		Map<String,Integer> puntuacion = new HashMap<String,Integer>();
		
		while ((inputLine = in.readLine()) != null ){
			
			inputLine = inputLine.trim();
			
			if(inputLine.contains("id=\"table261\"")){
				print = true;
			}
			
			if(inputLine.contains("</table>")){
				print = false;
			}
			
			if(print && !inputLine.startsWith("<") && !inputLine.startsWith("&")){
				
				String [] parts = inputLine.split("<");
				inputLine = parts[0];
				
				System.out.println(inputLine);
				inputLine = inputLine.trim();
				String nombre = inputLine.substring(0,inputLine.lastIndexOf(" "));
				String puntosString = inputLine.substring(inputLine.lastIndexOf(" ") + 1 , inputLine.length());
				
				if("sc".equals(puntosString)) puntosString = "0";
				int puntos    = Integer.parseInt(puntosString);
				
				playersPoints.put(nombre, puntos);
				
				System.out.println("NOMBRE: " + nombre + " PUNTOS: " + puntos); 
			}
		
			
		}
		
		
		
		return null;
	}

	public String buildURL (String seasson, String day){
		return URL_BASE.replace("DD", day).replace("AAAA", seasson);
	}

}
