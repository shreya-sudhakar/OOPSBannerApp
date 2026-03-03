public class OOPSBannerAppuc6 {

    public static void main(String[] args) {

        // Build banner using helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop-based rendering (7 lines)
        for (int i = 0; i < 7; i++) {
            System.out.println(
                    oPattern[i] + "  " +
                    oPattern[i] + "  " +
                    pPattern[i] + "  " +
                    sPattern[i]
            );
        }
    }

    // Helper Method for O
    public static String[] getOPattern() {
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

    // Helper Method for P
    public static String[] getPPattern() {
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

    // Helper Method for S
    public static String[] getSPattern() {
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
}