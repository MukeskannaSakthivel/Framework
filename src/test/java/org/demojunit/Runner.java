package org.demojunit;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Runner {
	@Test
	public void tc1() {
		Result r = JUnitCore.runClasses(A.class,B.class);
		
	}
}
