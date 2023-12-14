package consultation2023_12_14;

import consultation2023_12_14.teachers_code.TeacherSandbox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestWordTest {
    @Test
    public void testLongestWordCorrectSimpleTest() {
        String input = "one two three";
        String result = TeacherSandbox.longestWord(input);
        String expected = "three";

        Assertions.assertEquals(expected, result);
        Assertions.assertEquals("one", TeacherSandbox.longestWord("one"));
        Assertions.assertNull(TeacherSandbox.longestWord(null));
        Assertions.assertNull(TeacherSandbox.longestWord("    "));
    }

    @Test
    public void testLongestWordTrickyInput() {
        // тк в задаче не было сказано обработку случаев слов с одинаковой длиной,
        // то считаем первое самое длинное слово - самым длинным
        Assertions.assertEquals("aaaa", TeacherSandbox.longestWord("aaaa bbbb cccc"));
        Assertions.assertNotEquals("aaaa", TeacherSandbox.longestWord("bbbb aaaa cccc"));
        Assertions.assertEquals("bbbb", TeacherSandbox.longestWord("bbbb aaaa cccc"));
        // "\t" = "    ", "\n" = перенос строки
        Assertions.assertEquals("bbbb", TeacherSandbox.longestWord("bbbb \taaaa \ncccc"));
    }

    @Test
    public void testLongestWordInputWithComma() {
        // тк в задании про знаки препинания ничего не сказано, то можно допустить,
        // что нет необходимости удалять знаки препинания
        Assertions.assertEquals("aaaa;", TeacherSandbox.longestWord("aaaa; bbbb, cccc!"));
    }


}
