package scrap.heap.refactor;

public class Cake {
	private final CakeFlavor flavor;
	private final CakeFrostingFlavor frostingFlavor;
	private final CakeColor color;
	private final CakeShape shape;
	private final CakeSize size;

	// Looks like all params are mandatory and different type, no builder is needed so far, use factory method
	protected Cake(CakeFlavor flavor, CakeFrostingFlavor frostingFlavor, CakeColor color, CakeShape shape, CakeSize size) {
		this.flavor = flavor;
		this.frostingFlavor = frostingFlavor;
		this.color = color;
		this.shape = shape;
		this.size = size;
	}

	public CakeFlavor getFlavor() {
		return flavor;
	}

	public CakeFrostingFlavor getFrostingFlavor() {
		return frostingFlavor;
	}

	public CakeColor getColor() {
		return color;
	}

	public CakeShape getShape() {
		return shape;
	}

	public CakeSize getSize() {
		return size;
	}

	public static Cake createCake(CakeFlavor flavor, CakeFrostingFlavor frostingFlavor, CakeColor color, CakeShape shape, CakeSize size) {
		return new Cake(flavor, frostingFlavor, color, shape, size);
	}

	@Override
	public String toString() {
		return "Cake: " + this.flavor + ", frosting " + frostingFlavor + ", " + color + ", " + shape + ", " + size;
	}
}

