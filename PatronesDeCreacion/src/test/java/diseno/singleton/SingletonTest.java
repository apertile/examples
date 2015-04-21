package diseno.singleton;

import junit.framework.Assert;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class SingletonTest {
	private ClassicSingleton sone = null, stwo = null;
	private static Logger logger = Logger.getRootLogger();
	
	@Before
	public void before(){
		BasicConfigurator.configure();
	}

	@Test
	public void testUnique() {
		logger.info("checking singletons for equality");		
		logger.info("getting singleton...");
		sone = ClassicSingleton.getInstance();
		logger.info("...got singleton: " + sone);
		logger.info("getting singleton...");
		stwo = ClassicSingleton.getInstance();
		logger.info("...got singleton: " + stwo);
		Assert.assertEquals(true, sone == stwo);
	}
	
	
}
