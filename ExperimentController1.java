/**
 * ExperimentController class is used to calculate runtime and memory
 * usage for sorting algorithms for String data.
 *
 * @author Khaknazar Shyntassov
 * @version 10/5/2020
 */
import java.util.*;
public class ExperimentController1
{
    public static void main(String[] args){
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrestuvwxyz0123456789";
        int in = 5000;
        ExperimentController1 e = new ExperimentController1();
        float total=0;
        float total1=0;
        float total2=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total=total+e.timeSelectionSortRandomComparator(string,in, new Compare());
            //total1=total1+e.timeJavaQuickSort(string,in);
            //total2=total2+e.timeJavaMergeSort(string,in);
        }
        total=total/5; // average execution time
        total1=total1/5; // average execution time
        total2=total2/5; // average execution time
        System.out.println("first:"+total);
        System.out.println("medium:"+total1);
        System.out.println("random:"+total2);
        //e.memoryUseMeasurementsInteger(200000,random.nextInt());
        
        
        ExperimentController1 e1 = new ExperimentController1();
        float total3=0;
        float total4=0;
        float total5=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total3=total3+e1.timeSelectionSortRandomComparator(string,in*2, new Compare());
            //total4=total4+e1.timeJavaQuickSort(string,in*2);
            //total5=total5+e1.timeJavaMergeSort(string,in*2);
        }
        total3=total3/5; // average execution time
        total4=total4/5; // average execution time
        total5=total5/5; // average execution time
        System.out.println("first:"+total3);
        System.out.println("medium:"+total4);
        System.out.println("random:"+total5);
        //e.memoryUseMeasurementsInteger(200000,random.nextInt());
        
        ExperimentController1 e2 = new ExperimentController1();
        float total6=0;
        float total7=0;
        float total8=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total6=total6+e2.timeSelectionSortRandomComparator(string,in*3, new Compare());
            total7=total7+e2.timeJavaQuickSort(string,in*3);
            total8=total8+e2.timeJavaMergeSort(string,in*3);
        }
        total6=total6/5; // average execution time
        total7=total7/5; // average execution time
        total8=total8/5; // average execution time
        System.out.println("first:"+total6);
        System.out.println("medium:"+total7);
        System.out.println("random:"+total8);
        //e.memoryUseMeasurementsInteger(200000,random.nextInt());
        
        ExperimentController1 e3 = new ExperimentController1();
        float total9=0;
        float total10=0;
        float total11=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total9=total9+e3.timeSelectionSortRandomComparator(string,in*4, new Compare());
            //total10=total10+e3.timeJavaQuickSort(string,in*4);
            //total11=total11+e3.timeJavaMergeSort(string,in*4);
        }
        total9=total9/5; // average execution time
        total10=total10/5; // average execution time
        total11=total11/5; // average execution time
        System.out.println("first:"+total9);
        System.out.println("medium:"+total10);
        System.out.println("random:"+total11);
        //e.memoryUseMeasurementsInteger(200000,random.nextInt());
        
        ExperimentController1 e4 = new ExperimentController1();
        float total12=0;
        float total13=0;
        float total14=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total12=total12+e4.timeSelectionSortRandomComparator(string,in*5, new Compare());
            //total13=total13+e4.timeJavaQuickSort(string,in*5);
            //total14=total14+e4.timeJavaMergeSort(string,in*5);
        }
        total12=total12/5; // average execution time
        total13=total13/5; // average execution time
        total14=total14/5; // average execution time
        System.out.println("first:"+total12);
        System.out.println("medium:"+total13);
        System.out.println("random:"+total14);
        //e.memoryUseMeasurementsInteger(200000,random.nextInt());
    
    }
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class ExperimentController1
     */
    public ExperimentController1()
    {
        // initialise instance variables
    }

    public float timeSelectionSortRandom(String str,int numberOfItems){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeSelectionSortRandomComparator(String str,int numberOfItems, Compare c){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array, c);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeSelectionSortSorted(String str,int numberOfItems){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeSelectionSortReverse(String str,int numberOfItems){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public String[] reverse(String a[]) 
    { 
        int n = a.length;
        String[] b = new String[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
        return b;
    }
    
    public float timeBubbleSortRandom(String str,int numberOfItems){
        BubbleSort s = new BubbleSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeBubbleSortSorted(String str,int numberOfItems){
        BubbleSort s = new BubbleSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeBubbleSortReverse(String str,int numberOfItems){
        BubbleSort s = new BubbleSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeInsertionSortRandom(String str,int numberOfItems){
        InsertionSort s = new InsertionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeInsertionSortSorted(String str,int numberOfItems){
        InsertionSort s = new InsertionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeInsertionSortReverse(String str,int numberOfItems){
        InsertionSort s = new InsertionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeMergeSortRandom(String str,int numberOfItems){
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeMergeSortSorted(String str,int numberOfItems){
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeMergeSortReverse(String str,int numberOfItems){
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time

        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortFirstRandom(String str,int numberOfItems){
        QuickSortFirst s = new QuickSortFirst(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortFirstWorst(String str,int numberOfItems){
        QuickSortFirst s = new QuickSortFirst(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortMedianRandom(String str,int numberOfItems){
        QuickSortMedian s = new QuickSortMedian(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortMedianWorst(String str,int numberOfItems){
        QuickSortMedian s = new QuickSortMedian(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortRandomRandom(String str,int numberOfItems){
        QuickSortRandom s = new QuickSortRandom(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeQuickSortRandomWorst(String str,int numberOfItems){
        QuickSortRandom s = new QuickSortRandom(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeJavaQuickSort(String str,int numberOfItems){
        QuickSortFirst s = new QuickSortFirst(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        Arrays.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeJavaMergeSort(String str,int numberOfItems){
        QuickSortMedian s = new QuickSortMedian(); // Instance of RandomIntegersContainer
        ArrayList<String> array = new ArrayList<String>();
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array.add(randomString);
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        Collections.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
}
