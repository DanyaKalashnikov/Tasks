package ru.vsu.cs.course1;

public class Chisla {
    public static SimpleLinkedList<Integer> chisla (int n) throws SimpleLinkedList.SimpleLinkedListException{
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        if (n == 1){
            list.addLast(0);
            return list;
        } else if (n == 2) {
            list.addLast(0);
            list.addLast(1);
            return list;
        }
        list.addLast(0);
        list.addLast(1);

        for (int i = 2; i<n; i++){
            list.addLast(list.get(i-1) + list.get(i-2));
        }
        return list;
    }
}
