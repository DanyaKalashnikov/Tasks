package ru.vsu.cs.course1;

public class Calculate {
    public static SimpleLinkedListStack<Integer> Calcul (SimpleLinkedListStack<Integer> list, int size) throws Exception{
        SimpleLinkedListQueue<Integer> listQueue = new SimpleLinkedListQueue<>();

        for (int i = 0; i<size; i++){
            if (i == size-1){
                listQueue.add(list.pop());
                continue;
            }
            listQueue.add(list.pop());
            int k = listQueue.remove();
            listQueue.add(k);
        }

        SimpleLinkedListStack<Integer> listFinish = new SimpleLinkedListStack<>();
        for(int j = 0; j<size; j++){
            listFinish.push(listQueue.remove());
        }
        return listFinish;
    }
}
