package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        var numbers1 = List.of(1, 2, 3, 4);
        var expected1 = App.take(numbers1, 2);
        var actual1 = List.of(1, 2);
        assertThat(actual1).isEqualTo(expected1);

        var numbers2 = List.of(7, 3, 10);
        var expected2 = App.take(numbers2, 8);
        var actual2 = List.of(7, 3, 10);
        assertThat(actual2).isEqualTo(expected2);
    }
}
