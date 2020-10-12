/**
 * ExperimentController class is used to calculate runtime and memory
 * usage for sorting algorithms for integer data.
 *
 * @author Khaknazar Shyntassov
 * @version 10/5/2020
 */

import java.util.*;
public class ExperimentController
{
    public static void main (String[] args){
        ExperimentController e = new ExperimentController();
        Random random = new Random(3248);
        int in = 10000000;
        float total=0;
        float total1=0;
        float total2=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total=total+e.memoryJavaQuickSortRandom(in,random.nextInt());
            total1=total1+e.memoryJavaMergeRandom(in,random.nextInt());
            //total2=total2+e.memoryMergeSortRandom(in,random.nextInt());
        }
        total=total/5; // average execution time
        total1=total1/5; // average execution time
        total2=total2/5; // average execution time
        System.out.println("best:"+total);
        System.out.println("random:"+total1);
        System.out.println("worst:"+total2);
        //e.memoryUseMeasurementsInteger(200000,random.nextInt());
        
        ExperimentController e1 = new ExperimentController();
        float total3=0;
        float total4=0;
        float total5=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total3=total3+e1.memoryJavaQuickSortRandom(in*2,random.nextInt());
            total4=total4+e1.memoryJavaMergeRandom(in*2,random.nextInt());
            //total5=total5+e1.memoryMergeSortRandom(in*2,random.nextInt());
        }
        total3=total3/5; // average execution time
        total4=total4/5; // average execution time
        total5=total5/5; // average execution time
        System.out.println("best:"+total3);
        System.out.println("random:"+total4);
        System.out.println("worst:"+total5);
        //e.memoryUseMeasurementsInteger(200000,random.nextInt());
        
        ExperimentController e2 = new ExperimentController();
        float total6=0;
        float total7=0;
        float total8=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total6=total6+e2.memoryJavaQuickSortRandom(in*3,random.nextInt());
            total7=total7+e2.memoryJavaMergeRandom(in*3,random.nextInt());
            //total8=total8+e2.memoryMergeSortRandom(in*3,random.nextInt());
        }
        total6=total6/5; // average execution time
        total7=total7/5; // average execution time
        total8=total8/5; // average execution time
        System.out.println("best:"+total6);
        System.out.println("random:"+total7);
        System.out.println("worst:"+total8);
        //e.memoryUseMeasurementsInteger(200000,random.nextInt());
        
        ExperimentController e3 = new ExperimentController();
        float total9=0;
        float total10=0;
        float total11=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total9=total9+e3.memoryJavaQuickSortRandom(in*4,random.nextInt());
            total10=total10+e3.memoryJavaMergeRandom(in*4,random.nextInt());
            //total11=total11+e3.timeMergeSortRandom(in*4,random.nextInt());
        }
        total9=total9/5; // average execution time
        total10=total10/5; // average execution time
        total11=total11/5; // average execution time
        System.out.println("best:"+total9);
        System.out.println("random:"+total10);
        System.out.println("worst:"+total11);
        //e.memoryUseMeasurementsInteger(200000,random.nextInt());
        
        ExperimentController e4 = new ExperimentController();
        float total12=0;
        float total13=0;
        float total14=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total12=total12+e4.memoryJavaQuickSortRandom(in*5,random.nextInt());
            total13=total13+e4.memoryJavaMergeRandom(in*5,random.nextInt());
            //total14=total14+e4.memoryMergeSortRandom(in*5,random.nextInt());
        }
        total12=total12/5; // average execution time
        total13=total13/5; // average execution time
        total14=total14/5; // average execution time
        System.out.println("best:"+total12);
        System.out.println("random:"+total13);
        System.out.println("worst:"+total14);
        //e.memoryUseMeasurementsInteger(200000,random.nextInt());
    
    }
    
    /**
     * Measuring memory use
     */
    public void memoryUseMeasurementsInteger(int numberOfItems, int seed) {
        SelectionSort s = new SelectionSort(); // instanciates sorters
        BubbleSort b = new BubbleSort();
        InsertionSort i = new InsertionSort();
        MergeSort m = new MergeSort();
        Random r = new Random(seed);
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=r.nextInt();
        }
        int[] copy = array;
        long startMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println(startMemory);
        s.sort(copy);
        long endMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        
        long deltaMemory = endMemory-startMemory;
        System.out.println(startMemory);
        System.out.println("Selection Sort memory: " + deltaMemory);
        
        copy = array;
        startMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        b.sort(copy);
        endMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        deltaMemory = endMemory-startMemory;
        System.out.println("Bubble Sort memory: " + deltaMemory);
        
        copy = array;
        startMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        i.sort(copy);
        endMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        deltaMemory = endMemory-startMemory;
        System.out.println("Insertion Sort memory: " + deltaMemory);
        
        /*copy = array;
        startMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        m.sort(copy);
        endMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        deltaMemory = endMemory-startMemory;
        System.out.println("Merge Sort memory: " + deltaMemory);*/
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public float timeSelectionSortRandom (int numberOfItems, int seed){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeSelectionSortSorted (int numberOfItems, int seed){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeSelectionSortReverse (int numberOfItems, int seed){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public int[] reverse(int a[]) 
    { 
        int n = a.length;
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
        return b;
    }
    
    public float timeInsertionSortRandom (int numberOfItems, int seed){
        InsertionSort s = new InsertionSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeInsertionSortSorted (int numberOfItems, int seed){
        InsertionSort s = new InsertionSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeInsertionSortReverse (int numberOfItems, int seed){
        InsertionSort s = new InsertionSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeBubbleSortRandom (int numberOfItems, int seed){
        BubbleSort s = new BubbleSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeBubbleSortSorted (int numberOfItems, int seed){
        BubbleSort s = new BubbleSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeBubbleSortReverse (int numberOfItems, int seed){
        BubbleSort s = new BubbleSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        int[] array1 = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array1);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeMergeSortRandom (int numberOfItems, int seed){
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeMergeSortBest (int numberOfItems, int seed){
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeMergeSortWorst (int numberOfItems, int seed){
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        int first = random.nextInt();
        Random incr = new Random();
        for(int x = 0; x < numberOfItems; x=x+2)
        {
            array[x]=first;
            array[x+1]=first-1;
            first=first+incr.nextInt(1000000);
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortFirstRandom (int numberOfItems, int seed){
        QuickSortFirst s = new QuickSortFirst(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortFirstWorst (int numberOfItems, int seed){
        QuickSortFirst s = new QuickSortFirst(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortFirstBest (int numberOfItems, int seed){
        QuickSortFirst s = new QuickSortFirst(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        int[] copy = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            copy[x]=array[x];
        }
        s.sort(copy);

        int median = (numberOfItems-1)/2;
        array[0]=copy[median];
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortMedianRandom (int numberOfItems, int seed){
        QuickSortMedian s = new QuickSortMedian(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortMedianWorst (int numberOfItems, int seed){
        QuickSortMedian s = new QuickSortMedian(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortMedianBest (int numberOfItems, int seed){
        QuickSortMedian s = new QuickSortMedian(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        int[] copy = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            copy[x]=array[x];
        }
        s.sort(copy);

        int median = copy[(numberOfItems-1)/2];
        array[0]=median - 1;
        array[(numberOfItems-1)/2]=median;
        array[numberOfItems-1]=median+1;

        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortRandomRandom (int numberOfItems, int seed){
        QuickSortRandom s = new QuickSortRandom(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortRandomWorst (int numberOfItems, int seed){
        QuickSortRandom s = new QuickSortRandom(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortRandomBest (int numberOfItems, int seed){
        QuickSortRandom s = new QuickSortRandom(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        int[] copy = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            copy[x]=array[x];
        }
        s.sort(copy);
        int median = copy[(numberOfItems-1)/2];
        array[0]=median - 1;
        array[(numberOfItems-1)/2]=median;
        array[numberOfItems-1]=median+1;
        
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeJavaQuickSortRandom (int numberOfItems, int seed){
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        Arrays.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeJavaQuickSortSorted (int numberOfItems, int seed){
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        Arrays.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        Arrays.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeJavaQuickSortReverse (int numberOfItems, int seed){
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        Arrays.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        Arrays.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeJavaMergeRandom (int numberOfItems, int seed){
        Random random = new Random(seed);// Instance of Random
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int x = 0; x < numberOfItems; x++)
        {
            temp.add(random.nextInt());
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        Collections.sort(temp);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeJavaMergeSorted (int numberOfItems, int seed){
        Random random = new Random(seed);// Instance of Random
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int x = 0; x < numberOfItems; x++)
        {
            temp.add(random.nextInt());
        }
        Collections.sort(temp);
        long startTime = System.currentTimeMillis(); // Recording starting time
        Collections.sort(temp);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeJavaMergeReverse (int numberOfItems, int seed){
        Random random = new Random(seed);// Instance of Random
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int x = 0; x < numberOfItems; x++)
        {
            temp.add(random.nextInt());
        }
        Collections.sort(temp);
        Collections.reverse(temp);
        long startTime = System.currentTimeMillis(); // Recording starting time
        Collections.sort(temp);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float memoryQuickSortMedianRandom(int numberOfItems, int seed){
        Runtime runtime = Runtime.getRuntime();
        QuickSortMedian s = new QuickSortMedian(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        s.sort(array);
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        return usedMemoryAfter - usedMemoryBefore; // Returning execution time
    
    }
    
    public float memoryQuickSortFirstRandom(int numberOfItems, int seed){
        Runtime runtime = Runtime.getRuntime();
        QuickSortFirst s = new QuickSortFirst(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        s.sort(array);
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        return usedMemoryAfter - usedMemoryBefore; // Returning execution time
    
    }
    
    public float memoryQuickSortRandomRandom(int numberOfItems, int seed){
        Runtime runtime = Runtime.getRuntime();
        QuickSortRandom s = new QuickSortRandom(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        s.sort(array);
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        return usedMemoryAfter - usedMemoryBefore; // Returning execution time
    
    }
    
    public float memoryMergeSortRandom (int numberOfItems, int seed){
        Runtime runtime = Runtime.getRuntime();
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        s.sort(array);
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        return usedMemoryAfter - usedMemoryBefore; // Returning execution time
    }
    
    public float memoryJavaQuickSortRandom (int numberOfItems, int seed){
        Runtime runtime = Runtime.getRuntime();
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        Arrays.sort(array);
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        return usedMemoryAfter - usedMemoryBefore; // Returning execution time
    }
    
    public float memoryJavaMergeRandom (int numberOfItems, int seed){
        Runtime runtime = Runtime.getRuntime();
        Random random = new Random(seed);// Instance of Random
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int x = 0; x < numberOfItems; x++)
        {
            temp.add(random.nextInt());
        }
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        Collections.sort(temp);
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        return usedMemoryAfter - usedMemoryBefore; // Returning execution time
    }
}
