package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    private final Task1 task1 = new Task1();

    @Test
    public void countVowels() {
        int countVowels = task1.countVowels("asdzxcqwe");
        assertEquals(2, countVowels);
    }

}