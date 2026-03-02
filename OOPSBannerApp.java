public class OOPSBannerApp {

    static String getLine(String pattern, int index) {
        String[] lines = pattern.split(",");
        return lines[index];
    }

    public static void main(String[] args) {

        String o = String.join(",",
                " ***** ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                " ***** "
        );

        String p = String.join(",",
                " ***** ",
                " *   * ",
                " *   * ",
                " ***** ",
                " *     ",
                " *     ",
                " *     "
        );

        String s = String.join(",",
                " ***** ",
                " *     ",
                " *     ",
                " ***** ",
                "     * ",
                "     * ",
                " ***** "
        );

        for (int i = 0; i < 7; i++) {
            String line = String.join("   ",
                    getLine(o, i),
                    getLine(o, i),
                    getLine(p, i),
                    getLine(s, i)
            );
            System.out.println(line);
        }
    }
}