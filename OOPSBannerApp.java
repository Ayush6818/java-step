import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return map;
    }

    
    public static void renderBanner(String word, Map<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = map.get(c);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        renderBanner("OOPS", patternMap);
    }
}
