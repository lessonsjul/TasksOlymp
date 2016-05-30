package Зайцы_в_клетках;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){

            String[] f = reader.readLine().split(" ");
            long N = Long.valueOf(f[0]);
            long M = Long.valueOf(f[1]);
            long R = N <= M ? (M / N) + (M % N) : 1;

            writer.write(String.valueOf(R));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}