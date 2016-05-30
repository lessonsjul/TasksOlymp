package Інтернет;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String[] line = reader.readLine().split(" ");
            int N = Integer.valueOf(line[0]);
            int M = Integer.valueOf(line[1]);
            int X = Integer.valueOf(line[2]);
            int K = Integer.valueOf(line[3]);

            int koef = K - M > 0 ? K-M : 0;
            int result = N + koef*X ;

            writer.write(String.valueOf(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getSumZifer(int num) {
        int result = 0;
        char[] param = String.valueOf(num).toCharArray();
        for(char c: param){
            int z = Character.getNumericValue(c);
            if(z >= 1 && z <= 9){
                result += z;
            }
        }
        return result;
    }
}
