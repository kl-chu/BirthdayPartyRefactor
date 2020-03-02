package scrap.heap.refactor;
  
import java.util.*;

public class CakeFlavor {

	private static final Set<String> AVAILABLE_FLAVORS = new HashSet<>(
                Arrays.asList("chocolate", "vanilla"));

        private final String flavor;

        CakeFlavor(String flavor) {
                this.flavor = flavor;
        }

        // Factory method is for extension, hiding implementation details
        // probably it's going to return some singletone instance, e.g. enum
        public static CakeFlavor fromString(String flavorName) {

                // Validation is to be here. This is an example of one
                if (!AVAILABLE_FLAVORS.contains(flavorName.toLowerCase())) {
                        throw new IllegalArgumentException("Unknown flavor " + flavorName);
                }
		return new CakeFlavor(flavorName);
        }

        @Override
        public String toString() {
                return flavor;
        }
}

