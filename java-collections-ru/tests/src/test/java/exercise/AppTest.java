package exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(3);
        numbers1.add(5);
        numbers1.add(7);
        numbers1.add(11);
        List<Integer> expected1 = new ArrayList<>();
        expected1.add(3);
        expected1.add(5);
        assertThat(App.take(numbers1, 2)).containsExactlyElementsOf(expected1);

        expected1.add(7);
        expected1.add(11);
        assertThat(App.take(numbers1, 6)).containsExactlyElementsOf(expected1);

        List<Integer> numbers2 = new ArrayList<>();
        List<Integer> actual2 = App.take(numbers2, 2);
        assertThat(actual2.size()).isEqualTo(0);
        // END
    }
}
