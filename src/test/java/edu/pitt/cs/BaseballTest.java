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
public class BaseballTest {
	//Pitcher pitcher;
	@Before
	public void setUp() {
		
	}
	/**
	 * <pre>
	 * Preconditions: A Pitcher pitcher is created.
	 * Execution steps: Call pitcher.addStress(10).
	 * Postconditions: pitcher.getStress() returns 10.
	 * </pre>
	 */
	@Test
	public void testAddStress() {
		// TODO: Fill in
		Pitcher pitcher = new Pitcher();
		pitcher.addStress(10);
		assertEquals(10, pitcher.getStress());
	}

		/**
	 * <pre>
	 * Preconditions: A Pitcher pitcher is created.
	 *                The pitcher always throws strikes.
	 *                A Batter batter is created.
	 *                The batter always swings bat.
	 *                A BallGame game is created using pitcher and batter.
	 * Execution steps: Call game.pitch().
	 * Postconditions: The string "hit" is returned from the call.
	 *                 Stress of 10 is added to the pitcher.
	 * </pre>
	 */
	@Test
	public void testPitch() {
		Pitcher pitcher = Mockito.mock(Pitcher.class);
		Batter batter = Mockito.mock(Batter.class);
		Mockito.when(pitcher.throwBall()).thenReturn(true);
		Mockito.when(batter.swingBat()).thenReturn(true);
		BallGame game = new BallGame(pitcher, batter);
		String string = game.pitch();
		assertEquals("hit", string);
		Mockito.verify(pitcher, times(1)).addStress(10);
	}
}

