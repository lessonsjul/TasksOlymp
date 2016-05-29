package Автопробег;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            String[] line = reader.readLine().split(" ");
            int num1 = Integer.valueOf(line[0]);
            int num2 = Integer.valueOf(line[1]);

            int result = (num2 / num1);
            result += num2 % num1 > 0 ? 1 : 0;
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
