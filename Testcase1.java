public class TestFirstRepeatedCharacter {
    public static void main(String[] args) {
        assert FirstRepeatedCharacter.firstRepeatedCharacter("hello") == 'l';
        assert FirstRepeatedCharacter.firstRepeatedCharacter("world") == '\0';
        assert FirstRepeatedCharacter.firstRepeatedCharacter("aabbcc") == 'a';
        assert FirstRepeatedCharacter.firstRepeatedCharacter("") == '\0';
        System.out.println("All test cases passed for FirstRepeatedCharacter.");
    }
}
