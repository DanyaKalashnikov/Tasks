package ru.vsu.cs.course1;

public class MainList {
    public static int[] main (int[] arr) throws Exception{
        SimpleLinkedListStack<Integer> list = new SimpleLinkedListStack<>();
        for (int i = 0; i< arr.length; i++){
            list.push(arr[i]);
        }
        SimpleLinkedListStack<Integer> listFin = Calculate.Calcul(list, list.size());
        int[] arr2 = new int[arr.length];
        for (int j = 0; j< arr.length; j++){
            arr2[j] = listFin.pop();
        }
        return arr2;
    }
}
