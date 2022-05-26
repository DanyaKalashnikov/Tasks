package ru.vsu.cs.course1;

public class Main {
    public static int[] main (int arr[][]) throws Exception{
        int n = arr[0][0];
        SimpleLinkedList<Integer> list = Chisla.chisla(n);
        int[]Arr = new int[n];
        for (int i = 0; i<Arr.length; i++){
            Arr[i] = list.get(i);
        }
        return Arr;
    }
}
