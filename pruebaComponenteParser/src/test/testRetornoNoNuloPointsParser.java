package test;
import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import toolsImpl.PointsParserImpl;


public class testRetornoNoNuloPointsParser {

	HashMap<String, Integer> retorno = new HashMap<String, Integer>();	
	
	@Before
	public void setUp() throws Exception {
		
		PointsParserImpl pp = new PointsParserImpl();
		retorno = pp.parsePoints("2014", "1");
	}

	@Test
	public void test() {
		assertTrue(retorno.size() > 0);
	}

}
