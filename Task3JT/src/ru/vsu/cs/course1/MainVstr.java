package ru.vsu.cs.course1;
import java.util.Stack;

public class MainVstr {
    public static int[] main (int[] arr){
        Stack<Integer> list = new Stack<>();
        for (int i = 0; i< arr.length; i++){
            list.push(arr[i]);
        }
        Stack<Integer> listFin = CalculateVstr.Calcul(list, list.size());
        int[] arr2 = new int[arr.length];
        for (int j = 0; j< arr.length; j++){
            arr2[j] = listFin.pop();
        }
        return arr2;
    }
}
