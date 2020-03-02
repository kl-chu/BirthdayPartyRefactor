package scrap.heap.refactor;

import java.util.*;

class BalloonColor {
	private static final Set<String> AVAILABLE_COLORS = new HashSet<String>(
                Arrays.asList("red", "green", "yellow", "blue", "brown"));

        private final String color;

        BalloonColor(String color) {
                this.color = color;
        }

        public static BalloonColor fromString(String colorName) {
                if (!AVAILABLE_COLORS.contains(colorName.toLowerCase())) {
                        throw new IllegalArgumentException("Unknown color " + colorName);
                }
                return new BalloonColor(colorName);
        }

        @Override
        public String toString() {
                return this.color;
        }
}

