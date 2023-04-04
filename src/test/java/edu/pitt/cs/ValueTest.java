package edu.pitt.cs;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.calls;
import static org.mockito.Mockito.times;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.mockito.*;
public class ValueTest {
	Value value;

	@Before
	public void setUp() {
		value = Mockito.mock(Value.class);
	}
	
	@Test
	public void testIncValNone() {
		Mockito.when(value.getVal()).thenReturn(0);
		assertEquals(0, value.getVal());
	}
	
	@Test
	public void testIncValOnce() {
		value.incVal();
		Mockito.when(value.getVal()).thenReturn(1);
		assertEquals(1, value.getVal());
	}

	@Test
	public void testIncValTwice() {
		value.incVal();
		value.incVal();
		Mockito.when(value.getVal()).thenReturn(2);
		assertEquals(2, value.getVal());
	}
}
