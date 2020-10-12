import java.util.*;
/**
 * Sorts an array via merge sort
 *
 * @author Henry Grote
 * @version 09/29/2020
 */
public abstract class QuickSorter implements Sorter
{
    /**
     * Sort an array of ints via quicksort.
     *
     * @param  a  an array of ints
     */ 
    public void sort (int[] a) {
        if(a != null && a.length > 0) {
            qSort(a, 0, a.length-1);
        }
    }

    /**
     * Sort an array of comparable objects via quicksort.
     *
     * @param  a  an array of comparable objects
     */
    public <T extends Comparable<T>> void sort(T[] a) {
        if(a != null && a.length > 0) {
            qSort(a, 0, a.length-1);
        }
    }

    /**
     * Sort an array of objects using comparator via quicksort.
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T extends Comparable<T>> void sort(T[] a, Comparator<T> c) {
        if(a != null && a.length > 0) {
            qSort(a, 0, a.length-1, c);
        }
    }

    /**
     * Helper method for sort of ints
     * 
     * @param  a  array to be sorted via quicksort
     * @param  fst  first element of array
     * @param  lst  last element of array
     */
    private void qSort(int[] a, int fst, int lst) {
        if (fst+2 > lst) {
            insertionSort(a,fst,lst);
        }
        else{
            int pivIndex = partition(a, fst, lst);
            qSort(a, fst, pivIndex-1);
            qSort(a, pivIndex+1, lst);
        }
    }
    
     private static void insertionSort(int[] a, int low, int high ) {
        for( int p = low + 1; p <= high; p++ ) {
            int tmp = a[p];
            int j;

            for(j = p; j > low && tmp < a[j-1]; j-- ) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }

    /**
     * Helper method for sort of generics
     * 
     * @param  a  array to be sorted via quicksort
     * @param  fst  first element of array
     * @param  lst  last element of array
     */
    private <T extends Comparable<T>> void qSort(T[] a, int fst, int lst) {
        if (fst < lst) {
            int pivIndex = partition(a, fst, lst);
            qSort(a, fst, pivIndex-1);
            qSort(a, pivIndex+1, lst);
        }
    }

    /**
     * Helper method for sort of generics
     * 
     * @param  a  array to be sorted via quicksort
     * @param  fst  first element of array
     * @param  lst  last element of array
     * @param  c  comparitor used to compare the generics
     */
    private <T extends Comparable<T>> void qSort(T[] a, int fst, int lst, Comparator<T> c) {
        if (fst < lst) {
            int pivIndex = partition(a, fst, lst, c);
            qSort(a, fst, pivIndex-1, c);
            qSort(a, pivIndex+1, lst, c);
        }
    }

    /**
     * Helper method for qSort of ints
     * 
     * @param  a  array to partition at pivot
     * @param  fst  first index of array
     * @param  lst  last index of array
     */
    private int partition(int[] a, int fst, int lst) {
        int pivot = pivot(a, fst, lst);
        int u = fst;
        int d = lst;
        do {
            while ((u < lst) && (pivot >= a[u])) {
                u++;
            }
            while (pivot <  a[d] && (d>fst)) {
                d--;
            }
            if(u < d) { //swaps u and d in a
                int temp = a[u];
                a[u] = a[d];
                a[d] = temp;
            }
        } while (u < d);
        int tmp = a[fst]; //swaps u and d in a
        a[fst] = a[d];
        a[d] = tmp;
        return d;
    }

    /**
     * Helper method for qSort of generics
     * 
     * @param  a  array to partition at pivot
     * @param  fst  first index of array
     * @param  lst  last index of array
     */
    private <T extends Comparable<T>> int partition(T[] a, int fst, int lst) {
        T pivot = pivot(a, fst, lst);
        int u = fst;
        int d = lst;
        do {
            while ((u < lst) && (pivot.compareTo(a[u]) >= 0)) {
                u++;
            }
            while (pivot.compareTo(a[d]) < 0) {
                d--;
            }
            if (u < d) { //swaps u and d in a
                T temp = a[u];
                a[u] = a[d];
                a[d] = temp;
            }
        } while (u < d);
        T tmp = a[fst]; //swaps u and d in a
        a[fst] = a[d];
        a[d] = tmp;
        return d;
    }

    /**
     * Helper method for qSort of generics
     * 
     * @param  a  array to partition at pivot
     * @param  fst  first index of array
     * @param  lst  last index of array
     * @param  c  the comparitor used
     */
    private <T extends Comparable<T>> int partition(T[] a, int fst, int lst, Comparator<T> c) {
        T pivot = pivot(a, fst, lst, c);
        int u = fst;
        int d = lst;
        do {
            while ((u < lst) && (c.compare(pivot, a[u]) >= 0)) {
                u++;
            }
            while (c.compare(pivot, a[d]) < 0) {
                d--;
            }
            if (u < d) { //swaps u and d in a
                T temp = a[u];
                a[u] = a[d];
                a[d] = temp;
            }
        } while (u < d);
        T tmp = a[fst]; //swaps u and d in a
        a[fst] = a[d];
        a[d] = tmp;
        return d;
    }

    /**
     * Returns the desired pivot location in the array
     * 
     * @param  a  the array to choose the pivot location in
     * @param  fst  the beginning of valid indicies
     * @param  lst  the end of valid indicies
     * 
     * @return  either first; median of first, middle and last; or a random element, depending on inheritance
     */
    public abstract int pivot(int[] a, int fst, int lst);

    /**
     * Returns the desired pivot location in the array
     * 
     * @param  a  the array to choose the pivot location in
     * @param  fst  the beginning of valid indicies
     * @param  lst  the end of valid indicies
     * 
     * @return  either first; median of first, middle and last; or a random element, depending on inheritance
     */
    public abstract <T extends Comparable<T>> T pivot(T[] a, int fst, int lst);

    /**
     * Returns the desired pivot location in the array
     * 
     * @param  a  the array to choose the pivot location in
     * @param  fst  the beginning of valid indicies
     * @param  lst  the end of valid indicies
     * 
     * @return  either first; median of first, middle and last; or a random element, depending on inheritance
     */
    public abstract <T extends Comparable<T>> T pivot(T[] a, int fst, int lst, Comparator<T> c);
}
