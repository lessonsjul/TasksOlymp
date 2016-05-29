package Последовательность_цифр;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            int num = Integer.valueOf(reader.readLine());
            int a = (int) ((num / 2.) + .5);
            writer.write(String.valueOf(a));
            writer.newLine();
            int b = 10 + a -1;
            writer.write(String.valueOf(b));
            writer.newLine();
            int c = num % 2 > 0 ? b / 10 : b;
            c = c % 10;
            writer.write(String.valueOf(c));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}