package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import tools.PointsParser;
import toolsImpl.PointsParserImpl;


public class testFormacionURLPointParser {
	
	//@Autowired
	PointsParserImpl pp = new PointsParserImpl();
	
	String url;
	
	@Before
	public void setUp() throws Exception {
		 url = pp.buildURL("2014", "1");
	
	}

	@Test
	public void test() {
		
		assertTrue(url.equals("http://www.puntoscomunio.com/jornada1-2014.html"));
	}

}
