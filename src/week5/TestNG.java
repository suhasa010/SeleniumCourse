package week5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {

		@Test
		public void TC_001_verifyEvenNumber()
		{
     		Assert.assertTrue(15 % 2 ==0, "verify it is even number");

		}
	}

