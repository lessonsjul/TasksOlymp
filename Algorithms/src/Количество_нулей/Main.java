package Количество_нулей;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            int res = 0;
            while (reader.ready()){
                char c = (char) reader.read();
                if(c == '0')
                    res++;
            }

            writer.write(String.valueOf(res));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}