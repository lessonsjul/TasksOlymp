package Наоборот;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while(i < 5){
                sb = sb.insert(0,(char)reader.read());
                i++;
            }
            String result = sb.toString();
            int k = 0;
            for(;k < 5 && result.codePointAt(k) == '0'; k++);

            result = result.substring(k);
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
