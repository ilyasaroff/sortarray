package com.company;

import com.company.classes.SortArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        int size = 500; // размер массива
        int[] intArray = new int[size];
        int a=1;
        int b=1000;
        // Заполняем массив случайными числами
        for (int i=0; i<size; i++) {
            intArray[i]=a + (int) (Math.random() * b);
        }
        System.out.println(Arrays.toString(intArray));
        Long start = System.nanoTime();
        sortArray.sortBubbleArray(Arrays.copyOf(intArray, intArray.length));
        Long current = System.nanoTime()-start;
        System.out.println(Arrays.toString(sortArray.intArray));
        System.out.println("Отсортировано за "+current+" наносек");

        System.out.println(Arrays.toString(intArray));
        start = System.nanoTime();
        sortArray.sortInsertionArray(Arrays.copyOf(intArray, intArray.length));
        current = System.nanoTime()-start;
        System.out.println(Arrays.toString(sortArray.intArray));
        System.out.println("Отсортировано за "+current+" наносек");

        System.out.println(Arrays.toString(intArray));
        start = System.nanoTime();
        sortArray.sortSelectionArray(Arrays.copyOf(intArray, intArray.length));
        current = System.nanoTime()-start;
        System.out.println(Arrays.toString(sortArray.intArray));
        System.out.println("Отсортировано за "+current+" наносек");

    }
}
