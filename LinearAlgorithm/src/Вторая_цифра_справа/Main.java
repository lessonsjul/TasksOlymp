package Вторая_цифра_справа;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String[] line = reader.readLine().split(" ");
            long num = Long.valueOf(line[0]);
            long l = num / 10;
            l = Math.abs(l % 10);
            writer.write(String.valueOf(l));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
