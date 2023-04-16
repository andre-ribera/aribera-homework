package homeworkOne;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        /* Hello World */
        HelloWorld.helloWorld();

        /* Print User Provided Info*/
        System.out.println("\n*** Print Statement ***");
        System.out.println(PrintUserInfo.printUserInfo("Andre", 37, "Phoenix"));

        /* Sort */
        System.out.println("\n*** Sorting Algorithm ***");
        int[] array = randomIntArray(100);
        System.out.println("Array BEFORE sort: " + Arrays.toString(array));
//        SolvdSort.bubbleSort(array);
//        SolvdSort.insertionSort(array);
//        SolvdSort.mergeSort(array); TODO: not working yet
        SolvdSort.selectionSort(array);
        System.out.println("Array AFTER sort: " + Arrays.toString(array));
    }

    private static int[] randomIntArray(int upperbound){
        int[] array = new int[10];
        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(upperbound);
        }
        return array;
    }
}
