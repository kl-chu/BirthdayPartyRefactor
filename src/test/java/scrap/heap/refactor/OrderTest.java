package scrap.heap.refactor;

import org.junit.Test;
import static org.junit.Assert.*;

public class OrderTest {

	Balloon goodBalloon = Balloon.createBalloon(BalloonColor.fromString("brown"), BalloonMaterial.fromString("latex"));
	Cake goodCake = Cake.createCake(CakeFlavor.fromString("chocolate"), CakeFrostingFlavor.fromString("vanilla"),
					CakeColor.fromString("red"), CakeShape.fromString("square"), CakeSize.fromString("small"));

	@Test
	public void testBuildMissedItem() {
		try {
			Order.getBuilder().addBalloons(goodBalloon, 5).build();
			fail();
		} catch (IllegalArgumentException e) {
			// pass thru
		}
	}

        @Test
        public void testBuildWrongData() {
                try {
                        Order.getBuilder().addBalloons(goodBalloon, -1).build();
                        fail();
                } catch (IllegalArgumentException e) {
                        // pass thrui
                }
        }

        @Test
        public void testBuildItemTwice() {
                try {
                        Order.getBuilder().addBalloons(goodBalloon, 5).addCake(goodCake).addCake(goodCake);
                        fail();
                } catch (IllegalArgumentException e) {
                        // pass thru
                }
        }

	@Test
	public void testCreateOK() {
		Order.getBuilder().addBalloons(goodBalloon, 1).addCake(goodCake).build();
		// To do: check it's indeed correct order
	}

	// to do test place()
}
