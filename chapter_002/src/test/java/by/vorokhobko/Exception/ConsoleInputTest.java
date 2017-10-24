package by.vorokhobko.exception;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test.
 *
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @version 1.
 * @since 19.04.2017.
 */
public class ConsoleInputTest {
    /**
     * Test.
     */
    @Test
    public void whenTheUserEstablishesContactWithTheProgram() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        int result = 1;
        int[] range = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int test = new ConsoleInput().ask("test ", range);
        assertThat(result, is(test));
    }
    /**
     * Test.
     * @throws MenuOutException tag.
     */
    @Test(expected = MenuOutException.class)
    public void whenTheUserEstablishesContactWithTheProgramButKeyDoNotRange() throws MenuOutException {
        ByteArrayInputStream in = new ByteArrayInputStream("10".getBytes());
        System.setIn(in);
        int[] range = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        new ConsoleInput().ask("test ", range);
    }
}