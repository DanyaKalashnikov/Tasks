package ru.vsu.cs.course1;

public class Vector {
    private int vx;
    private int vy;
    private int vz;
    public Vector(Point p1, Point p2){
        this.vx = p2.getX() - p1.getX();
        this.vy = p2.getY() - p1.getY();
        this.vz = p2.getZ() - p1.getZ();
    }

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }

    public int getVz() {
        return vz;
    }

    public static double[] Length (Vector v1){
        double[] Len = new double[1];
        Len[0] = Math.sqrt(Math.pow(v1.getVx(), 2) + Math.pow(v1.getVy(), 2) + Math.pow(v1.getVz(), 2));
        return Len;
    }

    public static int[] Sum (Vector v1, Vector v2){
        int arr[] = new int[3];
        int SumVecX = v1.getVx() + v2.getVx();
        arr[0] = SumVecX;
        int SumVecY = v1.getVy() + v2.getVy();
        arr[1] = SumVecY;
        int SumVecZ = v1.getVz() + v2.getVz();
        arr[2] = SumVecZ;
        return arr;
    }
    public static int[] Raz (Vector v1, Vector v2){
        int arr[] = new int[3];
        int SumVecX = v1.getVx() - v2.getVx();
        arr[0] = SumVecX;
        int SumVecY = v1.getVy() - v2.getVy();
        arr[1] = SumVecY;
        int SumVecZ = v1.getVz() - v2.getVz();
        arr[2] = SumVecZ;
        return arr;
    }
    public static int ScalProizv (Vector v1, Vector v2){
        int Proizv = v1.getVx()*v2.getVx() + v1.getVy()*v2.getVy() + v1.getVz()*v2.getVz();
        return Proizv;
    }

    public static double Cos (Vector v1, Vector v2){
        double Cos = (ScalProizv(v1, v2))/ (Length(v1)[0] * Length(v2)[0]);
        return Cos;
    }
}
