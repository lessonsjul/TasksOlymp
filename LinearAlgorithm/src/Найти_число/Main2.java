package Найти_число;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            StringBuilder sb = new StringBuilder();
            char l = (char) reader.read();
            sb = sb.append((char)reader.read()).append((char)reader.read()).append(l);
            int k = 0;
            String result = sb.toString();
            for(;k < 3 && result.charAt(k) == '0';k++);

            result = result.substring(k);
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
