import java.util.*;
/**
 * Sorts arrays using selection sort
 *
 * @author Henry Grote
 * @version 09/25/2020
 */
public class SelectionSort implements Sorter
{
    /**
     * Sort an array of ints via selection sort. 
     *
     * @param  a  an array of ints
     */ 
    public void sort (int[] a) {
        if(a != null && a.length > 0) {
            int n = a.length;
            for (int fill = 0; fill < n - 1; fill++) {
                int posMin = fill;
                for (int nxt = fill + 1; nxt < n; nxt++) {
                    if (a[nxt] < a[posMin]) {
                        posMin = nxt;
                    }
                }
                int tmp = a[fill]; //swaps elements at posMin and fill
                a[fill] = a[posMin];
                a[posMin] = tmp;
            }
        }
    }

    /**
     * Sort an array of comparable objects via selection sort. 
     *
     * @param  a  an array of comparable objects
     */
    public <T extends Comparable<T>> void sort(T[] a) {
        if(a != null && a.length > 0) {
            int n = a.length;
            for (int fill = 0; fill < n - 1; fill++) {
                int posMin = fill;
                for (int nxt = fill + 1; nxt < n; nxt++) {
                    if (a[nxt].compareTo(a[posMin]) < 0) {
                        posMin = nxt;
                    }
                }
                T tmp = a[fill]; //swaps elements at posMin and fill
                a[fill] = a[posMin];
                a[posMin] = tmp;
            }
        }
    }

    /**
     * Sort an array of objects using comparator. 
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T extends Comparable<T>> void sort (T[] a, Comparator<T> c) {
        if(a != null && a.length > 0) {
            int n = a.length;
            for (int fill = 0; fill < n - 1; fill++) {
                int posMin = fill;
                for (int nxt = fill + 1; nxt < n; nxt++) {
                    if (c.compare(a[nxt], a[posMin]) < 0) {
                        posMin = nxt;
                    }
                }
                T tmp = a[fill]; //swaps elements at posMin and fill
                a[fill] = a[posMin];
                a[posMin] = tmp;
            }
        }
    }
}
