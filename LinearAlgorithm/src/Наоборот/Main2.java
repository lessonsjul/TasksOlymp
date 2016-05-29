package Наоборот;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            StringBuilder sb = new StringBuilder();
            sb = sb.insert(0,(char)reader.read());
            char two = (char)reader.read();
            char three = (char)reader.read();
            if(three == '0'){
                if(two != '0')
                    sb = sb.insert(0,two);
            }else{
                sb = sb.insert(0,two)
                        .insert(0,three);
            }

            String result = sb.toString();
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

