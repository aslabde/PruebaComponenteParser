package test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ testFormacionURLPointParser.class,
		testRetornoNoNuloPointsParser.class })
public class AllTests {

}
