import java.util.*;
/**
 * An interface of sorting algorithms
 * 
 * @author Henry Grote
 * @version 09/25/2020
 */
public interface Sorter
{
    /**
     * Sort an array of ints. 
     *
     * @param  a  an array of ints
     */ 
    public void sort (int[] a);
    
    /**
     * Sort an array of comparable objects. 
     *
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<T>> void sort (T[] a);
    
    /**
     * Sort an array of objects using comparator. 
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T extends Comparable<T>> void sort (T[] a, Comparator<T> c);
    
}
