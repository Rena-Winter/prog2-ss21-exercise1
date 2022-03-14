import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Excercise1Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkPassword_Length_Correct() {
        boolean actual = Exercise1.checkPassword("Abc7defgh)");
        assertTrue(actual);
    }

    @Test
    void checkPassword_Length_TooShort() {
        boolean actual = Exercise1.checkPassword("Abcd7)");
        assertFalse(actual);
    }

    @Test
    void checkPassword_Length_TooLong() {
        boolean actual = Exercise1.checkPassword("Abcdefgh7ijklmnopqrstuvwxyz*");
        assertFalse(actual);
    }
    @Test
    void checkPassword_Digits_NoDigits() {
        boolean actual = Exercise1.checkPassword("Abcdefgh)");
        assertFalse(actual);
    }
    @Test
    void checkPassword_Digits_WithDigits() {
        boolean actual = Exercise1.checkPassword("Abcdefgh7)");
        assertTrue(actual);
    }
    @Test
    void checkPassword_Upper_WithUpperCase() {
        boolean actual = Exercise1.checkPassword("Abcdefgh7)");
        assertTrue(actual);
    }
    @Test
    void checkPassword_UpperWithoutUpperCase() {
        boolean actual = Exercise1.checkPassword("abcdefgh7)");
        assertFalse(actual);
    }
    @Test
    void checkPassword_Lower_WithLowerCase() {
        boolean actual = Exercise1.checkPassword("Abcdefgh7)");
        assertTrue(actual);
    }
    @Test
    void checkPassword_LowerWithoutLowerCase() {
        boolean actual = Exercise1.checkPassword("ABCDEFGH7)");
        assertFalse(actual);
    }
    @Test
    void checkPassword_SpecialWithSpecialSigns() {
        boolean actual = Exercise1.checkPassword("Abcdefgh7)");
        assertTrue(actual);
    }
    @Test
    void checkPassword_SpecialWithoutSpecialSigns() {
        boolean actual = Exercise1.checkPassword("Abcdefgh7");
        assertFalse(actual);
    }
    @Test
    void checkPassword_SpecialWrongSpecialSigns() {
        boolean actual = Exercise1.checkPassword("Abcdefgh7>");
        assertFalse(actual);
    }
    @Test
    void checkPassword_EmptyWithWhitespace() {
        boolean actual = Exercise1.checkPassword("A bcdefgh7)");
        assertFalse(actual);
    }
    @Test
    void checkPassword_EmptyWithoutWhitespace() {
        boolean actual = Exercise1.checkPassword("Abcdefgh7)");
        assertTrue(actual);
    }


}
