import java.util.*;

/**
 * An implement of Bubble sort
 * 
 * @author  Andrew Luo
 * @version 09/29/2020
 */
public class BubbleSort implements Sorter
{
    /**
     * Sort an array of ints using bubble sort. 
     *
     * @param  a  an array of ints
     */ 
    public void sort (int[] a) {
        if(a!=null){
            int pass = 1;
            boolean exchanges;
            do {
                exchanges = false;
                for (int i = 0; i < a.length-pass; i++)
                    if (a[i]>a[i+1]) {
                        int tmp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = tmp;
                        exchanges = true;
                    }
                pass++;
            } while (exchanges);
        }
    }

    /**
     * Sort an array of comparable objects using bubble sort. 
     *
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<T>> void sort (T[] a) {
        if(a!=null){
            int pass = 1;
            boolean exchanges;
            do {
                exchanges = false;
                for (int i = 0; i < a.length-pass; i++)
                    if (a[i].compareTo(a[i+1]) > 0) {
                        T tmp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = tmp;
                        exchanges = true;
                    }
                pass++;
            } while (exchanges);
        }
    }

    /**
     * Sort an array of objects using comparator. 
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T extends Comparable<T>> void sort (T[] a, Comparator<T> c) {
        if(a!=null){
            int pass = 1;
            boolean exchanges;
            do {
                exchanges = false;
                for (int i = 0; i < a.length-pass; i++)
                    if (c.compare(a[i],a[i+1]) > 0) {
                        T tmp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = tmp;
                        exchanges = true;
                    }
                pass++;
            } while (exchanges);
        }
    }

}
