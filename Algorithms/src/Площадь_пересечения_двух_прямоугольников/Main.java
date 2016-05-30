package Площадь_пересечения_двух_прямоугольников;

import java.io.*;
import java.util.Arrays;

class Point {
    int x1;
    int y1;
    int x2;
    int y2;

    public Point(String[] params) {
       this.x1 = Integer.valueOf(params[0]);
       this.y1 = Integer.valueOf(params[1]);
        if(x1 != y1){
            x1 = y1 = Math.min(x1,y1);
        }
       this.x2 = Integer.valueOf(params[2]);
       this.y2 = Integer.valueOf(params[3]);
        if(x2 != y2){
            x2 = y2 = Math.max(x2,y2);
        }
    }

    public long getS(){
        return (Math.max(x1,x2) - Math.min(x1,x2)) * (Math.max(y1,y2)-Math.min(y1,y2));
    }
}
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            Point p1 = new Point(reader.readLine().split(" "));
            Point p2 = new Point(reader.readLine().split(" "));

            int[] X = {p1.x1,p1.x2,p2.x1,p2.x2};
            int[] Y = {p1.y1,p1.y2,p2.y1,p2.y2};

            Arrays.sort(X);
            Arrays.sort(Y);
            long S = (X[2]-X[1])*(Y[2]-Y[1]);

            System.out.println(p1.getS());
            System.out.println(p2.getS());
            if(p1.getS() <= S && p2.getS() <= S){
                S = 0;
            }
            writer.write(String.valueOf(S));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
