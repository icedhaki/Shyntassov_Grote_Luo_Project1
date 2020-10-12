import java.util.*;
/**
 * Sorts an array via insertion sort.
 *
 * @author Henry Grote
 * @version 09/29/2020
 */
public class InsertionSort implements Sorter
{
    /**
     * Sort an array of ints via inserertion sort.
     *
     * @param  a  an array of ints
     */ 
    public void sort (int[] a) {
        if(a != null && a.length > 0) {
            for (int nextPos = 1; nextPos < a.length; nextPos++) {
                insert(a, nextPos);
            }
        }
    }

    /**
     * Sort an array of comparable objects via insertion sort. 
     *
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<T>> void sort (T[] a) {
        if(a != null && a.length > 0) {
            for (int nextPos = 1; nextPos < a.length; nextPos++) {
                insert(a, nextPos);
            }
        }
    }

    /**
     * Sort an array of objects using comparator via insertion sort. 
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T extends Comparable<T>> void sort (T[] a, Comparator<T> c) {
        if(a != null && a.length > 0) {
            for (int nextPos = 1; nextPos < a.length; nextPos++) {
                insert(a, nextPos, c);
            }
        }
    }

    /**
     * Helper method for insertion sorting an array of generics
     * 
     * @param  a  the array sort is sorting
     * @param  nextPos  position of the next element to be inserted in a.
     */
    private void insert(int[] a, int nextPos) {
        int nextVal = a[nextPos];
        while (nextPos > 0 && nextVal < a[nextPos-1]) {
            a[nextPos] = a[nextPos-1];
            nextPos--;
        }
        a[nextPos] = nextVal;
    }

    /**
     * Helper method for insertion sorting an array of generics
     * 
     * @param  a  the array sort is sorting
     * @param  nextPos  position of the next element to be inserted in a.
     */
    private <T extends Comparable<? super T>> void insert(T[] a, int nextPos) {
        T nextVal = a[nextPos];
        while (nextPos > 0 && nextVal.compareTo(a[nextPos-1]) < 0) {
            a[nextPos] = a[nextPos-1];
            nextPos--;
        }
        a[nextPos] = nextVal;
    }

    /**
     * Helper method for insertion sorting an array of generics
     * 
     * @param  a  the array sort is sorting
     * @param  nextPos  position of the next element to be inserted in a.
     */
    private <T extends Comparable<T>> void insert(T[] a, int nextPos, Comparator<T> c) {
        T nextVal = a[nextPos];
        while (nextPos > 0 && c.compare(nextVal, a[nextPos-1]) < 0) {
            a[nextPos] = a[nextPos-1];
            nextPos--;
        }
        a[nextPos] = nextVal;
    }
}