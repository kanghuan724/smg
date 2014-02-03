package edu.nyu.kanghuan;

import static org.junit.Assert.*;

import org.junit.Test;

public class StateTest {

	@Test
	public void test() {
		State state = new State();
		int actual = state.getNumber(Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, actual);
	}

}
