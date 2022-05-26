package ru.vsu.cs.course1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CalculateVstr {
    public static Stack<Integer> Calcul(Stack<Integer> list, int size){
        Queue<Integer> listQueue = new LinkedList<>();

        for (int i = 0; i<size; i++){
            if (i == size-1){
                listQueue.add(list.pop());
                continue;
            }
            listQueue.add(list.pop());
            int k = listQueue.remove();
            listQueue.add(k);
        }
        Stack<Integer> listFinish = new Stack<>();
        for (int j = 0; j<size; j++){
            listFinish.push(listQueue.remove());
        }
        return listFinish;
    }
}
