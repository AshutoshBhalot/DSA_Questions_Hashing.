import java.util.HashMap;

public class FirstRepeatedCharacter {
    public static char firstRepeatedCharacter(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            if (charCount.get(ch) > 1) {
                return ch;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "hello";
        char result = firstRepeatedCharacter(str);
        if (result != '\0') {
            System.out.println("First repeated character: " + result);
        } else {
            System.out.println("No repeated characters found.");
        }
    }
}
