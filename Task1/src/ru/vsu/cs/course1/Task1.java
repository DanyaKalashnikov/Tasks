package ru.vsu.cs.course1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static List<Vector> Calculatin (int[][] arr2){
        int[][] arr = arr2;
        List<Vector> list2 = new ArrayList<>();
        List<Point> list1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            int x = arr[i][0];
            int y = arr[i][1];
            int z = arr[i][2];
            Point p = new Point(x, y, z);
            list1.add(p);
        }
        for (int i = 0; i < list1.size(); i = i+2){
            Point p1 = list1.get(i);
            Point p2 = list1.get(i+1);
            Vector v = new Vector(p1, p2);
            list2.add(v);
        }
        return list2;
    }

    public static int[] Sum (int[][] arr2){
        List<Vector> list1 = Calculatin(arr2);
        int[] sum = Vector.Sum(list1.get(0), list1.get(1));
        return sum;
    }
    public static int[] Raz (int[][] arr2){
        List<Vector> list1 = Calculatin(arr2);
        int[] raz =  Vector.Raz(list1.get(0), list1.get(1));
        return raz;
    }
    public static double[] Length (int[][] arr2){
        List<Vector> list1 = Calculatin(arr2);
        double[] Length = Vector.Length(list1.get(0));
        return Length;
    }
    public static int[] Scal (int[][] arr2){
        List<Vector> list1 = Calculatin(arr2);
        int ScalProizv = Vector.ScalProizv(list1.get(0), list1.get(1));
        int[] arr = new int[1];
        arr[0] = ScalProizv;
        return arr;
    }

    public static double[] Cos(int[][] arr2){
        List<Vector> list1 = Calculatin(arr2);
        double CosVec = Vector.Cos(list1.get(0), list1.get(1));
        double[] arr = new double[1];
        arr[0] = CosVec;
        return arr;
    }
}
