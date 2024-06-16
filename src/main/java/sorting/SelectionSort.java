package sorting;

import util.Fields;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array=Fields.sortArray;
        printArray(array);
        //selection sorting begins
        for(int i=0;i< array.length;i++){
            int min=array[i];
            int pos=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<min){
                    min=array[j];
                    pos=j;
                }
            }
            swap(array,i,pos);
        }
        System.out.println();
        printArray(array);
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(x->System.out.print(x+" "));
    }

    private static void swap(int[] array, int i, int pos) {
        int temp=array[i];
        array[i]=array[pos];
        array[pos]=temp;
    }
}
