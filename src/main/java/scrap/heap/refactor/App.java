package scrap.heap.refactor;

// I chose a class for each entity, that could look excessive for given task. Idea was to approach task as king of real world solution
// which is to be extended to represent entities in real systems.
// It could be enums, or simple strings, but all enities are better to be classes for possibilty of extending.
// Cake's color and balloons colors might not be from the same set;
// Colors could be custom and couldn't be presented in RGB color scheme
// We probably don't want to hardcode colors and flavors. They might be configured in DB or even external service
// Given all that, class per entity design approach is chosen

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

	Order order = Order.getBuilder()
			.addBalloons(Balloon.createBalloon(BalloonColor.fromString("red"), BalloonMaterial.fromString("mylar")), 4)
			.addCake(Cake.createCake(CakeFlavor.fromString("chocolate"), CakeFrostingFlavor.fromString("chocolate"), 
					CakeColor.fromString("brown"), CakeShape.fromString("circle"), CakeSize.fromString("large")))
			.build();
	order.place();

	order = Order.getBuilder()
			.addBalloons(Balloon.createBalloon(BalloonColor.fromString("blue"), BalloonMaterial.fromString("latex")), 7)
			.addCake(Cake.createCake(CakeFlavor.fromString("Vanilla"), CakeFrostingFlavor.fromString("chocelate"),
					CakeColor.fromString("yellow"), CakeShape.fromString("square"), CakeSize.fromString("med")))
			.build();
	order.place();

	order = Order.getBuilder()
			.addBalloons(Balloon.createBalloon(BalloonColor.fromString("yellow"), BalloonMaterial.fromString("mylar")), 4)
			.addCake(Cake.createCake(CakeFlavor.fromString("vanilla"), CakeFrostingFlavor.fromString("vanilla"),
					CakeColor.fromString("yellow"), CakeShape.fromString("square"), CakeSize.fromString("small")))
			.build();
	order.place();
	
    }
}
