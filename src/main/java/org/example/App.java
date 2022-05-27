package org.example;
//output an array from a method

import java.util.Arrays;

public class App
{
    public static void bubbleSort(int[] array){

        int arrayLength = array.length;

        for (int j = 1; j < arrayLength; j++) {
            for (int i = 1; i < arrayLength; i++) {
                int numberAtPosition = array[i];
                if (array[i] < array[i - 1]) {
                    array[i] = array[i - 1];
                    array[i - 1] = numberAtPosition;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args)
    {
       // int[] arrayToSort = new int[] {7, 8, 3, 4, 2, 6};
       // bubbleSort(arrayToSort);
    }


}
