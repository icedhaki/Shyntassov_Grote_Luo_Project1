import java.util.*;
/**
 * Creates a comparator
 *
 * @author  Henry Grote
 * @version 10/11/2020
 */
public class Compare<T extends Comparable> implements Comparator<T>
{
    /**
     * Compares two objects
     * @param Two objects
     * @return the difference between the objects.
     */
    public int compare(T a, T b){
        return a.compareTo(b);
    }
}