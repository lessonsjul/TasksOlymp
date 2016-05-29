package Угол;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String[] line = reader.readLine().split(" ");
            int H = Integer.valueOf(line[0]);
            int M = Integer.valueOf(line[1]);
            int S = Integer.valueOf(line[2]);

            double HH = H  *(360. / 12.);
            double MM = M * (360. / (12. * 60.));
            double SS = S * (360. / (12. * 60. * 60.));
            double r = HH + MM + SS;
            String result = String.valueOf(r);
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
