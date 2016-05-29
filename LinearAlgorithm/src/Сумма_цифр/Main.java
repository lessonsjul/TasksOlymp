package Сумма_цифр;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            char[] line = reader.readLine().toCharArray();
            int i = 0;
            int last = 4;
            if(!Character.isDigit(line[0])){
                i = 1;
                last = 5;
            }

            long sum = 0;
            while(i < last){
                int N = Character.getNumericValue(line[i]);
                if(N >= 1 && N <= 9) {
                    sum += N;
                }
                i++;
            }

            writer.write(String.valueOf(sum));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
