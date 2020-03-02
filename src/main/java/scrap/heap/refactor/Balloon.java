package scrap.heap.refactor;

class Balloon {
        private final BalloonColor color;
        private final BalloonMaterial material;

        protected Balloon(BalloonColor color, BalloonMaterial material) {
                this.color = color;
                this.material = material;
        }

	public BalloonColor getColor() {
		return color;
	}

	public BalloonMaterial getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "Ballon: " + color + " " + material;
	}

        // Balloon has 2 params and both are required, so looks like no need for builder
        public static Balloon createBalloon(BalloonColor color, BalloonMaterial material) {
                return new Balloon(color, material);
        }
}

