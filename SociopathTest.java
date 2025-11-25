import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class SociopathTest {

    @Test
    public void testCase1() {
        Sociopath s = new Sociopath();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1,2});
        assertEquals(2, s.findTheSociopath(2, list));
    }

    @Test
    public void testCase2() {
        Sociopath s = new Sociopath();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1,2});
        assertEquals(-1, s.findTheSociopath(3, list));
    }

    @Test
    public void testCase3() {
        Sociopath s = new Sociopath();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1,2});
        list.add(new int[]{1,3});
        list.add(new int[]{2,3});
        assertEquals(3, s.findTheSociopath(3, list));
    }

    @Test
    public void testCase4() {
        Sociopath s = new Sociopath();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1,3});
        list.add(new int[]{2,3});
        list.add(new int[]{3,1});
        assertEquals(-1, s.findTheSociopath(3, list));
    }

    @Test
    public void testCase5() {
        Sociopath s = new Sociopath();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1,2});
        assertEquals(-1, s.findTheSociopath(0, list));
    }

    @Test
    public void testCase6() {
        Sociopath s = new Sociopath();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1,0});
        assertEquals(-1, s.findTheSociopath(3, list));
    }
}
