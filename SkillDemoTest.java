import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
	public void testSumIsOdd() {
		Integer[] arr = {7, 16, 28};
		assertTrue("The sum is odd", SkillDemo.sumIsOdd(arr));
	}
}
