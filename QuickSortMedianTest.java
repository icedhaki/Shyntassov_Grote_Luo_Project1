
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class QuickSortMedianTest.
 *
 * @author  Henry Grote
 * @version 10/06/2020
 */
public class QuickSortMedianTest
{
    /**
     * Default constructor for test class QuickSortMedianTest
     */
    public QuickSortMedianTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void sortIntPresorted()
    {
        int[] test = new int[10];
        int[] check = new int[10];
        QuickSortMedian s = new QuickSortMedian();
        for (int i = 0; i < 10; i++) { //fill out test and check array
            test[i] = i;
            check[i] = i;
        }
        s.sort(test);
        assertArrayEquals(check, test);
    }

    @Test
    public void sortIntSemisorted()
    {
        int[] test = new int[10];
        int[] check = {0,1,2,3,3,4,4,5,7,9};
        QuickSortMedian s = new QuickSortMedian();
        for (int i = 0; i < 10; i++) { //fill out test array
            test[i] = i;
        }
        test[6] = 3;
        test[8] = 4;
        s.sort(test);
        assertArrayEquals(check, test);
    }
    
    @Test
    public void sortIntReverse()
    {
        int[] test = new int[10];
        int[] check = new int[10];
        QuickSortMedian s = new QuickSortMedian();
        for (int i = 0; i < 10; i++) { //fill out test and check array
            test[i] = 9-i;
            check[i] = i;
        }
        s.sort(test);
        assertArrayEquals(check, test);
    }

    @Test
    public void sortIntNull()
    {
        int[] test = null;
        int[] check = null;
        QuickSortMedian s = new QuickSortMedian();
        s.sort(test);
        assertArrayEquals(check, test);
    }

    @Test
    public void sortIntEmpty()
    {
        int[] test = {};
        int[] check = {};
        QuickSortMedian s = new QuickSortMedian();
        s.sort(test);
        assertArrayEquals(check, test);
    }
    
    @Test
    public void sortObjectPresorted()
    {
        Integer[] test = new Integer[10];
        Integer[] check = new Integer[10];
        QuickSortMedian s = new QuickSortMedian();
        for (int i = 0; i < 10; i++) { //fill out test and check array
            test[i] = i;
            check[i] = i;
        }
        s.sort(test);
        assertArrayEquals(check, test);
    }

    @Test
    public void sortObjectSemisorted()
    {
        Integer[] test = new Integer[10];
        Integer[] check = {0,1,2,3,3,4,4,5,7,9};
        QuickSortMedian s = new QuickSortMedian();
        for (int i = 0; i < 10; i++) { //fill out test array
            test[i] = i;
        }
        test[6] = 3;
        test[8] = 4;
        s.sort(test);
        assertArrayEquals(check, test);
    }
    
    @Test
    public void sortObjectReverse()
    {
        Integer[] test = new Integer[10];
        Integer[] check = new Integer[10];
        QuickSortMedian s = new QuickSortMedian();
        for (int i = 0; i < 10; i++) { //fill out test and check array
            test[i] = 9-i;
            check[i] = i;
        }
        s.sort(test);
        assertArrayEquals(check, test);
    }

    @Test
    public void sortObjectNull()
    {
        Integer[] test = null;
        Integer[] check = null;
        QuickSortMedian s = new QuickSortMedian();
        s.sort(test);
        assertArrayEquals(check, test);
    }

    @Test
    public void sortObjectEmpty()
    {
        Integer[] test = {};
        Integer[] check = {};
        QuickSortMedian s = new QuickSortMedian();
        s.sort(test);
        assertArrayEquals(check, test);
    }
    
    @Test
    public void sortComparatorPresorted()
    {
        Integer[] test = new Integer[10];
        Integer[] check = new Integer[10];
        QuickSortMedian s = new QuickSortMedian();
        Comparator<Integer> c = new Compares<Integer>();
        for (int i = 0; i < 10; i++) { //fill out test and check array
            test[i] = i;
            check[i] = i;
        }
        s.sort(test, c);
        assertArrayEquals(check, test);
    }

    @Test
    public void sortComparitorSemisorted()
    {
        Integer[] test = new Integer[10];
        Integer[] check = {0,1,2,3,3,4,4,5,7,9};
        QuickSortMedian s = new QuickSortMedian();
        Comparator<Integer> c = new Compares<Integer>();
        for (int i = 0; i < 10; i++) { //fill out test array
            test[i] = i;
        }
        test[6] = 3;
        test[8] = 4;
        s.sort(test, c);
        assertArrayEquals(check, test);
    }
    
    @Test
    public void sortComparitorReverse()
    {
        Integer[] test = new Integer[10];
        Integer[] check = new Integer[10];
        QuickSortMedian s = new QuickSortMedian();
        Comparator<Integer> c = new Compares<Integer>();
        for (int i = 0; i < 10; i++) { //fill out test and check array
            test[i] = 9-i;
            check[i] = i;
        }
        s.sort(test, c);
        assertArrayEquals(check, test);
    }

    @Test
    public void sortComparitorNull()
    {
        Integer[] test = null;
        Integer[] check = null;
        QuickSortMedian s = new QuickSortMedian();
        Comparator<Integer> c = new Compares<Integer>();
        s.sort(test, c);
        assertArrayEquals(check, test);
    }

    @Test
    public void sortComparitorEmpty()
    {
        Integer[] test = {};
        Integer[] check = {};
        QuickSortMedian s = new QuickSortMedian();
        Comparator<Integer> c = new Compares<Integer>();
        s.sort(test, c);
        assertArrayEquals(check, test);
    }

    @Test
    public void pivotLocationLMH()
    {
        QuickSortMedian quickSor1 = new QuickSortMedian();
        int[] a = {0, 1, 2};
        assertEquals(1, quickSor1.pivot(a, 0, 2));
    }
    
    @Test
    public void pivotLocationLHM()
    {
        QuickSortMedian quickSor1 = new QuickSortMedian();
        int[] a = {0, 2, 1};
        assertEquals(1, quickSor1.pivot(a, 0, 2));
    }
    
    @Test
    public void pivotLocationMLH()
    {
        QuickSortMedian quickSor1 = new QuickSortMedian();
        int[] a = {1, 0, 2};
        assertEquals(1, quickSor1.pivot(a, 0, 2));
    }
    
    @Test
    public void pivotLocationMHL()
    {
        QuickSortMedian quickSor1 = new QuickSortMedian();
        int[] a = {1, 2, 0};
        assertEquals(1, quickSor1.pivot(a, 0, 2));
    }
    
    @Test
    public void pivotLocationHLM()
    {
        QuickSortMedian quickSor1 = new QuickSortMedian();
        int[] a = {2, 0, 1};
        assertEquals(1, quickSor1.pivot(a, 0, 2));
    }
    
    @Test
    public void pivotLocationHML()
    {
        QuickSortMedian quickSor1 = new QuickSortMedian();
        int[] a = {2, 1, 0};
        assertEquals(1, quickSor1.pivot(a, 0, 2));
    }
}

