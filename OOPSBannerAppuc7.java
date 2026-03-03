
public class OOPSBannerAppuc7 {

    /**
     * Inner Static Class that encapsulates
     * a character and its corresponding 7-line banner pattern.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         *
         * @param character The alphabet character
         * @param pattern   The 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character.
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the 7-line pattern.
         *
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /* ================= Utility Static Methods ================= */

    /**
     * Builds pattern for letter O
     * @return 7-line O pattern
     */
    public static String[] buildOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    /**
     * Builds pattern for letter P
     * @return 7-line P pattern
     */
    public static String[] buildPPattern() {
        return new String[]{
                "*******  ",
                "*      * ",
                "*      * ",
                "*******  ",
                "*        ",
                "*        ",
                "*        "
        };
    }

    /**
     * Builds pattern for letter S
     * @return 7-line S pattern
     */
    public static String[] buildSPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*        ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        };
    }

    /* ================= Main Method ================= */

    public static void main(String[] args) {

        // Create objects for O, P, S
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', buildOPattern()),
                new CharacterPatternMap('P', buildPPattern()),
                new CharacterPatternMap('S', buildSPattern())
        };

        String word = "OOPS";

        // Loop for 7 rows
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                for (CharacterPatternMap cp : patterns) {
                    if (cp.getCharacter() == ch) {
                        lineBuilder.append(cp.getPattern()[row]).append("  ");
                    }
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }
}
