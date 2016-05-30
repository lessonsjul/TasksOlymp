package Слон;

import java.io.*;

class Point{
    private int x;
    private int y;

    public Point(String[] params) {
        this.x = Integer.valueOf(params[0]);
        this.y = Integer.valueOf(params[1]);
    }

    public boolean isBishopStep(Point p){
        return Math.abs(this.x - p.x) == Math.abs(this.y - p.y);
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            Point[] points = new Point[5];
            int i = 0;
            while (i < 5) {
                Point p = new Point(reader.readLine().split(" "));
                points[i] = p;
                i++;
            }

            Point p = new Point(reader.readLine().split(" "));
            for(i = 0; i < 5; i++){
                if(p.isBishopStep(points[i])) {
                    writer.write(points[i].toString());
                    if (i != 4)
                        writer.append(" ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
