package Шахматный_король;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("king.in"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("king.out"))) {
            String[] line = reader.readLine().split(" ");
            int N = Integer.valueOf(line[0]);
            line = reader.readLine().split(" ");

            int x = Integer.valueOf(line[0]);
            int y = Integer.valueOf(line[1]);
            int m = Integer.valueOf(line[2]);
            int t = Integer.valueOf(line[3]);

            int res = Math.max(Math.abs(x-m),Math.abs(y-t));
            writer.write(String.valueOf(res));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
