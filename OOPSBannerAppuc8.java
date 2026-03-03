import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppuc8 {

    /* ================= Utility Method to Build Pattern Map ================= */

    /**
     * Builds and returns a Map containing
     * character-to-pattern mappings.
     *
     * @return Map<Character, String[]>
     */
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        patternMap.put('P', new String[]{
                "*******  ",
                "*      * ",
                "*      * ",
                "*******  ",
                "*        ",
                "*        ",
                "*        "
        });

        patternMap.put('S', new String[]{
                "  *****  ",
                " *     * ",
                "*        ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        });

        return patternMap;
    }

    /* ================= Utility Method to Display Banner ================= */

    /**
     * Displays the banner message using
     * stored character patterns.
     *
     * @param message    The word to display
     * @param patternMap Map containing character patterns
     */
    public static void displayBanner(String message,
                                     Map<Character, String[]> patternMap) {

        int height = 7; // Each character is 7 lines tall

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    /* ================= Main Method ================= */

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        String message = "OOPS";

        displayBanner(message, patternMap);
    }
}