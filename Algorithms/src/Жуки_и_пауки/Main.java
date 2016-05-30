package Жуки_и_пауки;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("bugs.in"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("bugs.out"))){
            String[] line = reader.readLine().split(" ");
            long N = Long.valueOf(line[0]);
            long k = Long.valueOf(line[1]);

            long y = ((N*k)/(1+k)) / 8;
            long x = (8*y) / (6*k);


            long res = x + y;
            writer.write(String.valueOf(res));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}