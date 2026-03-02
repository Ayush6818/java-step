public class OOPSBannerUC3 {

    static void line1() {
        System.out.println(" *****   *****   *****   ***** ");
    }

    static void line2() {
        System.out.println(" *   *   *   *   *       *     ");
    }

    static void line3() {
        System.out.println(" *   *   *****   *****   ***** ");
    }

    static void line4() {
        System.out.println(" *   *   *           *       * ");
    }

    static void line5() {
        System.out.println(" *****   *       *****   ***** ");
    }

    public static void main(String[] args) {

        String[] o1 = {
                String.join(" ", "*****", "*   *", "*   *", "*   *", "*   *", "*   *", "*****"),
        };

        String[] o2 = {
                String.join(" ", "*****", "*   *", "*   *", "*   *", "*   *", "*   *", "*****"),
        };

        String[] p = {
                String.join(" ", "*****", "*   *", "*   *", "*****", "*", "*", "*"),
        };

        String[] s = {
                String.join(" ", "*****", "*", "*", "*****", "    *", "    *", "*****"),
        };

        for (int i = 0; i < 7; i++) {
            String line = String.join("   ",
                    getLine(o1[0], i),
                    getLine(o2[0], i),
                    getLine(p[0], i),
                    getLine(s[0], i)
            );
            System.out.println(line);
        }
    }

    static String getLine(String pattern, int index) {
        String[] lines = pattern.split(" ");
        return lines[index];
    }
}