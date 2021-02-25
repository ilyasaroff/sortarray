package com.company.classes;

public class SortArray {
    public int[] intArray;

    //-----------------Сортировка пузырьковая---------------
    public void sortBubbleArray (int [] intArr) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < intArr.length - 1; i++) {
                if (intArr[i] > intArr[i+1]) {
                    temp = intArr[i];
                    intArr[i] = intArr[i+1];
                    intArr[i+1] = temp;
                    sorted = false;
                }
            }
        }
        this.intArray=intArr;
    }
    //------------------Сортировка вставкой----------------
    public void sortInsertionArray(int[] intArr) {
        for (int i = 1; i < intArr.length; i++) {
            int current = intArr[i];
            int j = i - 1;
            while(j >= 0 && current < intArr[j]) {
                intArr[j+1] = intArr[j];
                j--;
            }
            intArr[j+1] = current;
        }
        this.intArray=intArr;
    }
    //------------------Сортировка выбором-----------------
    public void sortSelectionArray(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            int min = intArr[i];
            int minId = i;
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[j] < min) {
                    min = intArr[j];
                    minId = j;
                }
            }
            int temp = intArr[i];
            intArr[i] = min;
            intArr[minId] = temp;
        }
        this.intArray = intArr;
    }
}
