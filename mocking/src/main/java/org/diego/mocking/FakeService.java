package org.diego.mocking;

import java.util.Random;

public class FakeService {

	public int fakeMethod(){
		Random ram = new Random();
		int  d= ram.nextInt(100);
		return d+1;
	}
	
}
