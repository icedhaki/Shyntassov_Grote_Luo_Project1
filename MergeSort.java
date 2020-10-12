import java.util.*;
/**
 * Sorts an array via merge sort
 *
 * @author Henry Grote
 * @version 09/29/2020
 */
public class MergeSort implements Sorter
{
    /**
     * Sort an array of ints via merge sort.
     *
     * @param  a  an array of ints
     */ 
    public void sort(int[] a) {
        if(a != null && a.length > 0) {
            int start = 0;
            int end = a.length - 1;
            sort(a, start, end);
        }
    }

    /**
     * Sort an array of comparable objects via merge sort.
     *
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<T>> void sort(T[] a) {
        if(a != null && a.length > 0) {
            int start = 0;
            int end = a.length - 1;
            sort(a, start, end);
        }
    }

    /**
     * Sort an array of objects using comparator via merge sort.
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T extends Comparable<T>> void sort(T[] a, Comparator<T> c) {
        if(a != null && a.length > 0) {
            int start = 0;
            int end = a.length - 1;
            sort(a, start, end, c);
        }
    }

    /**
     * Recursive call of sort method for an array of ints, helper method for sort(a)
     * 
     * @param  a  array to be sorted
     * @param  start  upper index of a
     * @param  end  lower index of a
     */
    private <T extends Comparable<T>> void sort(int a[], int start, int end) {
        if (start >= end) return;
        int half = (start+end) / 2;
        sort(a, start, half);
        sort(a, half+1, end);

        merge(a, start, half, end);
    }

    /**
     * Recursive call of sort method for an array of generics, helper method for sort(a)
     * 
     * @param  a  array to be sorted
     * @param  start  upper index of a
     * @param  end  lower index of a
     */
    private <T extends Comparable<T>> void sort(T a[], int start, int end) {
        if (start >= end) return;
        int half = (start+end) / 2;
        sort(a, start, half);
        sort(a, half+1, end);

        merge(a, start, half, end);
    }

    /**
     * Recursive call of sort method for an array of generics with a comparator, helper method for sort(a)
     * 
     * @param  a  array to be sorted
     * @param  start  upper index of a
     * @param  end  lower index of a
     * @param  c  comparator object
     */
    private <T extends Comparable<T>> void sort(T a[], int start, int end, Comparator<T> c) {
        if (start >= end) return;
        int half = (start+end) / 2;
        sort(a, start, half);
        sort(a, half+1, end);

        merge(a, start, half, end);
    }

    /**
     * combines two previously sorted halves of an arrays, helper method for sort(a, start, end)
     * 
     * @param  a  array which halves are being sorted
     * @param  start  start index of first half array
     * @param  half  end index of first half array, 1 before start index of second half
     * @param  end  end index of second half array
     */
    private <T extends Comparable<T>> void merge(int a[], int start, int half, int end) {
        int[] b = Arrays.copyOfRange(a, start, half+1);

        int i = 0; //index in b
        int j = half+1; //index in second half of a
        int k = start; //index in merged a
        while (i < b.length && j <= end) {
            if (b[i] <= a[j]) {
                a[k++] = b[i++];
            }
            else {
                a[k++] = a[j++];
            }
        }
        while (i < b.length) {
            a[k++] = b[i++];
        }
    }

    /**
     * combines two previously sorted halves of an arrays, helper method for sort(a, start, end)
     * 
     * @param  a  array which halves are being sorted
     * @param  start  start index of first half array
     * @param  half  end index of first half array, 1 before start index of second half
     * @param  end  end index of second half array
     */
    private <T extends Comparable<T>> void merge(T a[], int start, int half, int end) {
        T[] b = Arrays.copyOfRange(a, start, half+1);

        int i = 0; //index in b
        int j = half+1; //index in second half of a
        int k = start; //index in merged a
        while (i < b.length && j <= end) {
            if (b[i].compareTo(a[j]) <= 0) {
                a[k++] = b[i++];
            }
            else {
                a[k++] = a[j++];
            }
        }
        while (i < b.length) {
            a[k++] = b[i++];
        }
    }

    /**
     * combines two previously sorted halves of an arrays, helper method for sort(a, start, end, c)
     * 
     * @param  a  array which halves are being sorted
     * @param  start  start of first half array
     * @param  half  end index of first half array, 1 before start index of second half
     * @param  end  end of second half array
     * @param  c  a comparator used to compare the generics
     */
    private <T extends Comparable<T>> void merge(T a[], int start, int half, int end, Comparator<T> c) {
        T[] b = Arrays.copyOfRange(a, start, half+1);

        int i = 0; //index in b
        int j = half+1; //index in second half of a
        int k = start; //index in merged a
        while (i < b.length && j <= end) {
            if (c.compare(b[i], a[j]) <= 0) {
                a[k++] = b[i++];
            }
            else {
                a[k++] = a[j++];
            }
        }
        while (i < b.length) {
            a[k++] = b[i++];
        }
    }
}
