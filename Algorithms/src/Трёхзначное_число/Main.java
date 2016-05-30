package Трёхзначное_число;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String[] line = reader.readLine().split(" ");
            int num = Integer.valueOf(line[0]);
            int round = (int) (Math.log10(num) + 1);
            int res = num % 10;
            if(round == 3){
                res = num / 100;
            }

            writer.write(String.valueOf(res));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
