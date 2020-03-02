package scrap.heap.refactor;
  
import java.util.*;

public class CakeShape {

	private static final Set<String> AVAILABLE_SHAPES = new HashSet<>(
                Arrays.asList("square", "circle"));

        private final String shape;

        CakeShape(String shape) {
                this.shape = shape;
        }

        public static CakeShape fromString(String shapeName) {
                if (!AVAILABLE_SHAPES.contains(shapeName.toLowerCase())) {
                        throw new IllegalArgumentException("Unknown shape " + shapeName);
                }
                return new CakeShape(shapeName);
        }

	@Override
	public String toString() {
		return this.shape;
	}
}

