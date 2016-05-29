package Средние;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String[] l = reader.readLine().split(" ");
            double a = Double.valueOf(l[0]);
            double b = Double.valueOf(l[1]);
            double c = Double.valueOf(l[2]);


            writer.write(String.valueOf(getX1(a,b,c)) + " " + String.valueOf(getX2(a,b,c)));
            writer.newLine();
//            writer.write(String.valueOf(getMidlGeom(a,b)));
//            writer.newLine();
//            writer.write(String.valueOf(getMidlAriphmetic(a,b)));
//            writer.newLine();
//            writer.write(String.valueOf(getMidlSquare(a,b)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double getX1(double a, double b, double c){
        return (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
    }

    private static double getX2(double a, double b, double c){
        return (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
    }

    private static double getMidlSquare(double a, double b) {
        double division = Math.sqrt((a*a)+(b*b));
        double divider = Math.sqrt(2);
        return  division / divider;
    }

    private static double getMidlAriphmetic(double a, double b) {
        return (double) ((a+b)/2);
    }

    private static double getMidlGeom(double a, double b) {
        return Math.sqrt(a*b);
    }

    private static double getMidlGarmony(double a, double b) {
        double a1 = 1 / a;
        double b1 = 1 / b;
        return (double)2 / (a1+b1);
    }

}

