package Следующее_чётное;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            String[] line = reader.readLine().split(" ");
            int a = Integer.valueOf(line[0]);

            int result = a < 0 ? (2 + a%2) : (2 - a % 2);
            result += a;
            String N = String.valueOf(result);
            writer.write(N);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
