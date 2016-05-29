package Найти_число;

import java.io.*;

public class Main4 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            StringBuilder sb = new StringBuilder();
            sb = sb.insert(0,(char)reader.read())
                    .insert(0,(char)reader.read());
            char l = (char)reader.read();
            if(l != '0'){
                sb.insert(0,l);
            }
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
