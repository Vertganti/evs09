package main.java;

import com.google.common.base.Joiner;

public class Gradletest {

	public String stringcon(String s1, String s2){
		Joiner joiner = Joiner.on(" ").skipNulls();
		return joiner.join(s1, s2);
	}
	
}
