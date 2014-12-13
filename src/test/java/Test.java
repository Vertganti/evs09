package test.java;

import static org.junit.Assert.*;
import main.java.Gradletest;

public class Test {

	@org.junit.Test
	public void test() {
		Gradletest grad = new Gradletest();
		assertEquals("Result not correct!", grad.stringcon("A","Test"), "A Test");
	}

}
