import java.util.*;
/**
 * Sorts an array via quicksort, using the first element as the pivot.
 *
 * @author Henry Grote
 * @version 09/29/2020
 */
public class QuickSortMedian extends QuickSorter implements Sorter 
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
        int center = (fst+lst)/2;
        if(a[fst] > a[center] )
            swap(a,fst, center);
        if( a[fst] > a[lst] )
            swap(a,fst, lst);
        if( a[center] > a[lst] )
            swap(a,center, lst);
        swap(a,center, fst); 
        int pivot = a[fst];
        return pivot; 
    }

    /**
     * Swaps two elements in the int array.
     * 
     * @param  a  the array to choose the pivot location in
     * @param  i1  index of the first element
     * @param  i2  index of the second element
     * 
     * @return void
     */
    public void swap(int[] a, int i1, int i2)
    {
      int temp = a[i1];
      a[i1] = a[i2];
      a[i2] = temp;
    }
    
    /**
     * Swaps two elements in the generic array.
     * 
     * @param  a  the array to choose the pivot location in
     * @param  i1  index of the first element
     * @param  i2  index of the second element
     * 
     * @return void
     */
    public <T extends Comparable<T>> void swap(T[] a, int i1, int i2){
      T temp = a[i1];
      a[i1] = a[i2];
      a[i2] = temp;
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
        int center = (fst+lst)/2;
        if(a[fst].compareTo(a[center]) > 0 )
            swap(a,fst, center);
        if(a[fst].compareTo(a[lst]) > 0 )
            swap(a,fst, lst);
        if(a[center].compareTo(a[lst])>0 )
            swap(a,center, lst);
        swap(a,center, fst); 
        T pivot = a[fst];
        return pivot; 
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
        int center = (fst+lst)/2;
        if(c.compare(a[fst],a[center]) > 0 )
            swap(a,fst, center);
        if(c.compare(a[fst],a[lst]) > 0 )
            swap(a,fst, lst);
        if(c.compare(a[center],a[lst])>0 )
            swap(a,center, lst);
        swap(a,center, fst); 
        T pivot = a[fst];
        return pivot; 
    }
}
