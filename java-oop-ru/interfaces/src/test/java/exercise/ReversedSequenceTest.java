package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ReversedSequenceTest {
    CharSequence text = new ReversedSequence("abcdef");

    @Test
    void toStringTest() {
        String expected = "fedcba";
        String actual = text.toString();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void charAtTest() {
        char expected = 'e';
        char actual = text.charAt(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void lengthTest() {
        int expected = 6;
        int actual = text.length();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void subSequenceTest() {
        String expected = "edc";
        String actual = text.subSequence(1, 4).toString();
        assertThat(actual).isEqualTo(expected);
    }


}
