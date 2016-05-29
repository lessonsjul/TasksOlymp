package Найти_число;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            StringBuilder sb = new StringBuilder();
            sb = sb.append((char)reader.read());
            char l = (char)reader.read();
            sb = sb.append((char)reader.read()).append(l);
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
