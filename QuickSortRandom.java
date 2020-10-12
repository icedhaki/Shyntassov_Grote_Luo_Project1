import java.util.*;
/**
 * Write a description of class QuickSortRandom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuickSortRandom extends QuickSorter implements Sorter
{
    /**
     * Returns the desired pivot location in the array
     * 
     * @param  a  the array to choose the pivot location in
     * @param  fst  the beginning of valid indicies
     * @param  lst  the end of valid indicies
     * 
     * @return  either first; median of first, middle and last; or a random element, depending on inheritance
     */
    public int pivot(int[] a, int fst, int lst) {
        return a[(int)(Math.random())*(lst-fst) + fst];
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
    public <T extends Comparable<T>> T pivot(T[] a, int fst, int lst) {
        return a[(int)(Math.random())*(lst-fst) + fst];
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
    public <T extends Comparable<T>> T pivot(T[] a, int fst, int lst, Comparator<T> c) {
        return a[(int)(Math.random())*(lst-fst) + fst];
    }
}
