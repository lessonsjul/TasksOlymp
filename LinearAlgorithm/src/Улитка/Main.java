package Улитка;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            int h = Integer.valueOf(reader.readLine());
            int a = Integer.valueOf(reader.readLine());
            int b = Integer.valueOf(reader.readLine());

            double result = (double)(h-b) / (double)(a - b);
            result = result - (int)result > 0 ? result+1 : result;

            String N = String.valueOf((int)result);
            writer.write(N);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
