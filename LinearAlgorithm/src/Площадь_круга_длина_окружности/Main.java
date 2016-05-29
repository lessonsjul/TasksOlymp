package Площадь_круга_длина_окружности;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            String[] line = reader.readLine().split(" ");
            double R = Double.valueOf(line[0]);
            double bisC = getCircleSquare(R);
            writer.write(String.valueOf(bisC));
            bisC = getCircleLength(R);
            writer.newLine();
            writer.write(String.valueOf(bisC));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double getCircleSquare(double R){
        return Math.PI * R * R;
    }

    private static double getCircleLength(double R){
        return Math.PI * R * 2;
    }

}