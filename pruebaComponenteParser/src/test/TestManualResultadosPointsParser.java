package test;
import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import toolsImpl.PointsParserImpl;


public class TestManualResultadosPointsParser {
	HashMap<String, Integer> retorno = new HashMap<String, Integer>();
	int Manucho;
	int Gabi;
	int Dimitrievski;
	int Pablo_Insua;
	int Alex_Bergantiños;
	int Vietto;
	
	@Before
	public void setUp() throws Exception {
		
		PointsParserImpl pp = new PointsParserImpl();
		retorno = pp.parsePoints("2014", "1");
		
		 Manucho = retorno.get("Manucho");
		 Gabi = retorno.get("Gabi");
		 Dimitrievski = retorno.get("Dimitrievski");
		 Pablo_Insua = retorno.get("Pablo Insua");
		 Alex_Bergantiños = retorno.get("Alex Bergantiños");
		 Vietto = retorno.get("Vietto");
		
		
	}	
	@Test
	public void test() {
		assertTrue(Manucho == 6);
		assertTrue(Gabi == 2);
		assertTrue(Dimitrievski == -2);
		assertTrue(Pablo_Insua == 2);
		assertTrue(Alex_Bergantiños == 0);
		assertTrue(Vietto == 0);
	}

}
