package Домино;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String num = reader.readLine();
            long a = Long.valueOf(num);
            long result = 0;
            for(int i = 1; i <= a+1; i++){
                result += i;
            }
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
