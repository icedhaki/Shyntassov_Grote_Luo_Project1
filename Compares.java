import java.util.*;
/**
 * Non-abstract comparator
 *
 * @author Henry Grote
 * @version 10/06/2020
 */
public class Compares<T extends Comparable<T>> implements Comparator<T>
{
    /**
     * compares two objects
     * 
     * @param  x  an object
     * @param  y  an object
     * @return    x compared to y
     */
    public int compare(T x, T y) {
        return x.compareTo(y);
    }
}
