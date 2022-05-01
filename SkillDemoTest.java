import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @test
	public void testSumIsOdd() {
		Integer[] arr = {8, 16, 28};
		assertTrue("The sum is odd", SkillDemo.sumIsOdd(arr));
	}
}
