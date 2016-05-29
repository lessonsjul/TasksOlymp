package МКАД;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String[] line = reader.readLine().split(" ");
            int V = Integer.parseInt(line[0]);
            line = reader.readLine().split(" ");
            int T = Integer.parseInt(line[0]);

            int length = V*T;
            int res = length - ((length / 109)*109);
            if(res < 0){
                res = 109 + res;
            }
            String result = String.valueOf(res);
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
