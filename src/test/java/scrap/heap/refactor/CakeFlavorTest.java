package scrap.heap.refactor;

import org.junit.Test;
import static org.junit.Assert.*;

// Tests that cake flavor is created correctly for allowed flavors and failed for not allowed
// The same test is for all other entities like frosting flavor, color, etc.
// Test doesn't make much sense as is, but it does for more complex cases like custom flavors, or inidividually priced ones, etc.
public class CakeFlavorTest {

	@Test
	public void testCreateValid() {
		CakeColor color = CakeColor.fromString("yellow");
		System.out.println(color.toString());
		assertEquals("yellow", color.toString());
	}

	@Test
	public void testCreateInvalid() {
		try {
			CakeColor.fromString("blu-ish");
			fail("should have been failed");
		} catch (IllegalArgumentException e) {
			// pass thru
		}
	}
}
	
