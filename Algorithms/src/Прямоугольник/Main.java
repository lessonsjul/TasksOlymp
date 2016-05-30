package Прямоугольник;

import java.io.*;

class Point{
    private double x;
    private double y;

    public Point(String[] params) {
        this.x = Double.valueOf(params[0]);
        this.y = Double.valueOf(params[1]);
    }

    public Point(String x, String y) {
        this.x = Double.valueOf(x);
        this.y = Double.valueOf(y);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public boolean isOnRectangle(Point p1, Point p2){
        double maxX = Math.max(p1.getX(),p2.getX());
        double minX = Math.min(p1.getX(),p2.getX());
        double maxY = Math.max(p1.getY(),p2.getY());
        double minY = Math.min(p1.getY(),p2.getY());
        return x >= minX && x <= maxX && y >= minY && y <= maxY;
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
            Point A = new Point(line[0],line[1]);
            Point B = new Point(line[2],line[3]);

            for(i = 0; i < 5; i++){
                String res = points[i].isOnRectangle(A,B) ? "YES" : "NO";
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
