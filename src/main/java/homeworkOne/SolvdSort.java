package homeworkOne;

public class SolvdSort {
//    Selection sort
    /* Bubble Sort */
    /*  Referenced for the pseudocode:
        https://algorithmist.com/wiki/Bubble_sort
        https://www.youtube.com/watch?v=xli_FI7CuzA
    */
    public static int[] bubbleSort(int[] array){
        int temp;

        for(int i = 1; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }
//    TODO: Merge sort
    public static int[] mergeSort(int[] array){
        if(array.length == 1){
            return array;
        }

        int[] arrayOne = new int[array.length/2];
        int[] arrayTwo = new int[array.length/2];

        arrayOne = mergeSort(arrayOne);
        arrayTwo = mergeSort(arrayTwo);

        return merge(arrayOne, arrayTwo);
    }

    private static int[] merge(int[] arrayOne, int[] arrayTwo){
        int[] arrayThree = new int[arrayOne.length + arrayTwo.length];

        while(arrayOne.length != 0 && arrayTwo.length != 0){
            if(arrayOne[0] > arrayTwo[0]){
                arrayThree[arrayThree.length-1] = arrayTwo[0];
                //remove arrayTwo[0]
            } else {
                arrayThree[arrayThree.length-1] = arrayOne[0];
                //remove arrayOne[0]
            }
        }

        while(arrayOne.length != 0){
            arrayThree[arrayThree.length-1] = arrayOne[0];
            //remove arrayOne[0]
        }
        while(arrayTwo.length != 0){
            arrayThree[arrayThree.length-1] = arrayTwo[0];
            //remove arrayTwo[0]
        }

        return arrayThree;
    }
//    Quicksort

    /* Insertion sort */
    public static int[] insertionSort(int[] array) {
        int numToSort;
        int j;

        for (int i = 1; i < array.length; i++) {
            numToSort = array[i];
            j = i - 1;
            while (j >= 0 && numToSort < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = numToSort;
        }

        return array;
    }
}
