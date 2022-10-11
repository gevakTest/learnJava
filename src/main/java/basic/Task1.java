package basic;

public class Task1 {

    public int countVowels(String text) {
        char[] characters = text.toCharArray();
        int i = 0;
        for(char character : characters) {
            if (isVowel(character)){
                i++;
            }
        }
        return i;
    }

    private static boolean isVowel(char character) {
        return character == 'a'
                || character == 'e'
                || character == 'i'
                || character == 'o'
                || character == 'u';
    }

}