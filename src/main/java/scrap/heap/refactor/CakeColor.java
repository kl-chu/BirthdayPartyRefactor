package scrap.heap.refactor;
  
import java.util.*;

public class CakeColor {

	private static final Set<String> AVAILABLE_COLORS = new HashSet<String>(
                Arrays.asList("red", "green", "yellow", "blue", "brown"));

        private final String color;

        CakeColor(String color) {
                this.color = color;
        }

        public static CakeColor fromString(String colorName) {
                if (!AVAILABLE_COLORS.contains(colorName.toLowerCase())) {
                        throw new IllegalArgumentException("Unknown color " + colorName);
                }
                return new CakeColor(colorName);
        }

	@Override
	public String toString() {
		return color;
	}
}

