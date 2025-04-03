package testcases;


import org.testng.annotations.Test;

import resources.Base;
import resources.CommonFunctions;


public class tests extends Base{
	@Test
	public void browserLaunch() throws Exception {
		launchURL();
		CommonFunctions cf = new CommonFunctions();
		cf.search();
	}
}
