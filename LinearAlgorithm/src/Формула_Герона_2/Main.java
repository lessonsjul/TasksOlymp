package Формула_Герона_2;

import java.io.*;

class Point{
    public double x;
    public double y;
    public Point(String x, String y) {
        this.x = Double.valueOf(x);
        this.y = Double.valueOf(y);
    }
}
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            String[] line = reader.readLine().split(" ");
//            Point A = new Point(line[0],line[1]);
//
//            line = reader.readLine().split(" ");
//            Point B = new Point(line[0],line[1]);
//
//            line = reader.readLine().split(" ");
//            Point C = new Point(line[0],line[1]);
//
//            double a = getLineLenght(A,B);
//            double b = getLineLenght(B,C);
//            double c = getLineLenght(C,A);
//            double bisA = getTriangleHeight(a,b,c);
//            writer.write(String.valueOf(bisA));
//            writer.newLine();
//            double bisB = getTriangleHeight(b,a,c);
//            writer.write(String.valueOf(bisB));
//            writer.newLine();
            double a = Double.valueOf(line[0]);
            double b = Double.valueOf(line[1]);
            double c = Double.valueOf(line[2]);
            double d = Double.valueOf(line[3]);
//            double bisC = getTriangleHeight(a,b,c);
            double bisC = getLineLenght(a,b,c,d);
            writer.write(String.valueOf(bisC));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double getLineLenght(Point A, Point B){
        double X = A.x - B.x;
        double Y = A.y - B.y;
        return Math.sqrt((X*X)+(Y*Y));
    }

    private static double getLineLenght(double a,double b,double c,double d){
        double X = a - c;
        double Y = b - d;
        return Math.sqrt((X*X)+(Y*Y));
    }

    private static double getTriangleHeight(double a, double b, double c){
        double p = (a+b+c) / 2;
        return (Math.sqrt(p * (p-a) * (p-b) * (p-c))) ;
    }

//    private static double getMediana(double a, double b, double c){
//        return (Math.sqrt((2*b*b)+(2*c*c)-(a*a))) / 2.;
//    }

//    private static double getBisectrica(double a, double b, double c){
//        double p = (a + b + c) / 2;
//        return (2 * Math.sqrt( b * c * p * (p - a))) / (b + c);
//    }
}