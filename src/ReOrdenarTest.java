import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReOrdenarTest {
    @Test
    public void test_01() {
        //assertEquals nos ayuda en asegurar que el valor devuelto sea el que nosotros hemos establecido.
        assertEquals(93321, ReOrdenar.ordenarDesc(21393));
        assertEquals(55432, ReOrdenar.ordenarDesc(54532));
        assertEquals(943220, ReOrdenar.ordenarDesc(923042));
    }
    @Test
    public void test_02() {
        assertEquals(0, ReOrdenar.ordenarDesc(-329432));
        assertEquals(7777, ReOrdenar.ordenarDesc(7777));
    }
    /*Existen más asserts:
     * assertTrue()/assertFalse()
     * assertNull()/assertNotNull()
     * assertSame(x,y)/assertNotSame(x,y)
     * assertArrayEquals(x,y)
     * Y aún existen más asserts como el Timeout, IterableEquals...Etc.
     */
}