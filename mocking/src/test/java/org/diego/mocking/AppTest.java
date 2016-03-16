package org.diego.mocking;



import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {
	FakeService service;

	@BeforeClass
	public void initTestModule() {
		service = new FakeService();
	}

	@Test
    public void fakeTest(){
		int fake = service.fakeMethod();
		assertTrue("int > 0",fake>0);
    }
}
