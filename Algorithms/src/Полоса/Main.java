package Полоса;

import java.io.*;

class Point{
    private double x;
    private double y;

    public Point(String[] params) {
        this.x = Double.valueOf(params[0]);
        this.y = Double.valueOf(params[1]);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public boolean isOnThisLine(double A, double B){
        return (this.x >= Math.min(A,B) && this.x <= Math.max(A,B));
    }
}
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            int i = 0;
            Point[] points = new Point[5];
            while(i < 5){
                Point p = new Point(reader.readLine().split(" "));
                points[i] = p;
                i++;
            }
            String[] line = reader.readLine().split(" ");
            double A = Double.valueOf(line[0]);
            double B = Double.valueOf(line[1]);

            for(i = 0; i < 5; i++){
                String res = points[i].isOnThisLine(A, B)? "YES" : "NO";
                writer.write(res);
                if(i != 4){
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
