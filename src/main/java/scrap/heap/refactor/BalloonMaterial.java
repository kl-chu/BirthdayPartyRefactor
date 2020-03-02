package scrap.heap.refactor;
  
import java.util.*;

public class BalloonMaterial {
	
	private static final Set<String> AVAILABLE_MATERIALS = new HashSet<>(
                Arrays.asList("latex", "myral"));


        private final String material;

        BalloonMaterial(String material) {
                this.material = material;
        }

        public static BalloonMaterial fromString(String materialName) {
                if (!AVAILABLE_MATERIALS.contains(materialName.toLowerCase())) {
                        throw new IllegalArgumentException("Unknown material " + materialName);
                }
                return new BalloonMaterial(materialName);
        }

        @Override
        public String toString() {
                return this.material;
        }
}

