package scrap.heap.refactor;

public class Order {

        public static class OrderBuilder {

		private Cake cake = null;
		private Balloon balloon = null;
		private int numBalloons = 0;

                public OrderBuilder addCake(Cake cake) {
			if (this.cake != null) {
				throw new IllegalArgumentException("Cake is set already");
			}
			this.cake = cake;
			return this;
                }

                public OrderBuilder addBalloons(Balloon balloon, int num) {
			if (this.numBalloons > 0) {
				throw new IllegalArgumentException("Balloons already set");
			}
			if (num <= 0) {
				throw new IllegalArgumentException("Balloon count is wrong");
			}
			this.balloon = balloon;
			this.numBalloons = num;
			return this;
                }

                public Order build() {

			// Validations here. 
			if (cake == null || balloon == null || numBalloons <= 0) {
				// for demonstration: in real life can skip either cake or balloons
				throw new IllegalArgumentException("Must have cake and some balloons");
			}

			return new Order(this.cake, this.balloon, this.numBalloons);
                }
        }

	private final Cake cake;
	private final Balloon balloon;
	private final int numBalloons;

	protected Order(Cake cake, Balloon balloon, int numBalloons) {
		this.cake = cake;
		this.balloon = balloon;
		this.numBalloons = numBalloons;
	}

        public static OrderBuilder getBuilder() {
                return new OrderBuilder();
        }

	public void place() {
		System.out.println("Placing order " + this);
	}

	@Override
	public String toString() {
		return "Cake: " + this.cake + ", " + this.numBalloons + " of " + this.balloon;
	}
}

