package Tреугольника;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            String[] line = reader.readLine().split(" ");
            double a = Double.valueOf(line[0]);
            double b = Double.valueOf(line[1]);
            double c = Double.valueOf(line[2]);
            double bisA = getTriangleHeight(a,b,c);
            writer.write(String.valueOf(bisA));
            writer.newLine();
            double bisB = getTriangleHeight(b,a,c);
            writer.write(String.valueOf(bisB));
            writer.newLine();
            double bisC = getTriangleHeight(c,a,b);
            writer.write(String.valueOf(bisC));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double getTriangleHeight(double a, double b, double c){
        double p = (a+b+c) / 2;
        return (2*Math.sqrt(p * (p-a) * (p-b) * (p-c))) / a;
    }

//    private static double getMediana(double a, double b, double c){
//        return (Math.sqrt((2*b*b)+(2*c*c)-(a*a))) / 2.;
//    }

//    private static double getBisectrica(double a, double b, double c){
//        double p = (a + b + c) / 2;
//        return (2 * Math.sqrt( b * c * p * (p - a))) / (b + c);
//    }
}