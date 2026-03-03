public class OOPSBannerApp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        };
    }

    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('P', getPPattern()),
                new CharacterPatternMap('S', getSPattern())
        };

        CharacterPatternMap O = patterns[0];
        CharacterPatternMap P = patterns[1];
        CharacterPatternMap S = patterns[2];

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            line.append(O.getPattern()[i]).append(" ")
                .append(O.getPattern()[i]).append(" ")
                .append(P.getPattern()[i]).append(" ")
                .append(S.getPattern()[i]);
            System.out.println(line.toString());
        }
    }
}
