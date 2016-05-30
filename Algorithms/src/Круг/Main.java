package Круг;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

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

    @Test
    public double getX() {

        assertEquals("d",getX());
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public boolean isOnCircle(Point p1, double R){


        double X = this.x - p1.x;
        double Y = this.y - p1.y;
        double L = Math.sqrt((X*X) + (Y*Y));
        return  L <= R;
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
            double R = Double.valueOf(line[2]);

            for(i = 0; i < 5; i++){
                String res = points[i].isOnCircle(A,R) ? "YES" : "NO";
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
