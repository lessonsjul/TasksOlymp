package Последняя_цифра_числа;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            String[] line = reader.readLine().split(" ");
            long N = Long.valueOf(line[0]);
            long l = Math.abs(N % 10);
            writer.write(String.valueOf(l));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}