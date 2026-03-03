public class OOPSBannerApp {
    public static void main(String[] args) {

        String[] O = {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };

        String[] P = {
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        };

        String[] S = {
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        };

        for (int i = 0; i < 7; i++) {
            System.out.println(String.join(" ", O[i], O[i], P[i], S[i]));
        }
    }
}
