package Спички;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("matches.in"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("matches.out"))) {
            String[] line = reader.readLine().split(" ");
            int col = Integer.valueOf(line[0]);
            int a = col / 4;
            int b = (col / 4) + (col/2) % 2;
            int res = a * b;

            writer.write(String.valueOf(res));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
