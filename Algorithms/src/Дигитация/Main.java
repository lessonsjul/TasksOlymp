package Дигитация;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            String line = reader.readLine();

            long num = Long.valueOf(line.trim());
            long res = 1;
            if(num >= 6)
                res = 9;
            else{
                for(int i = 1; i <= num; i++){
                    res*=i;
                }
            }
            writer.write(String.valueOf(res));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
