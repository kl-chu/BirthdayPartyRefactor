package scrap.heap.refactor;
  
import java.util.*;

public class CakeSize {

	private static final Set<String> AVAILABLE_SIZES = new HashSet<>(
                Arrays.asList("small", "med", "large"));

        private final String size;

        CakeSize(String size) {
                this.size = size;
        }

        public static CakeSize fromString(String sizeName) {
                if (!AVAILABLE_SIZES.contains(sizeName.toLowerCase())) {
                        throw new IllegalArgumentException("Unknown size " + sizeName);
                }
                return new CakeSize(sizeName);
        }

	@Override
	public String toString() {
		return this.size;
	}
}

