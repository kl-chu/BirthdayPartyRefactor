package scrap.heap.refactor;
  
import java.util.*;

// Frosting flavor probably is not the same as cake flavor, so separate class is devoted for this
public class CakeFrostingFlavor {

	private static final Set<String> AVAILABLE_FLAVORS = new HashSet<>(
                Arrays.asList("chocolate", "vanilla"));

        private final String flavor;

        CakeFrostingFlavor(String flavor) {
                this.flavor = flavor;
        }

        public static CakeFrostingFlavor fromString(String flavorName) {
                if (!AVAILABLE_FLAVORS.contains(flavorName.toLowerCase())) {
                        throw new IllegalArgumentException("Unknown flavor " + flavorName);
                }
                return new CakeFrostingFlavor(flavorName);
        }

        @Override
        public String toString() {
                return flavor;
        }
}

