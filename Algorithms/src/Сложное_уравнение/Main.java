package Сложное_уравнение;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String[] line = reader.readLine().split(" ");
            int a = Integer.valueOf(line[0]);
            int b = Integer.valueOf(line[1]);
            int c = Integer.valueOf(line[2]);
            int d = Integer.valueOf(line[3]);

            String result = "";
            if(a != 0){
                int x = -(b/a);
                int check = a*x + b;
                int divider = c*x + d;
                if(check == 0 && divider != 0){
                    result = String.valueOf(x);
                }else if(check == 0 && divider == 0) {
                    result = "NO";
                }else{
                    result = "INF";
                }
            }else{
                if(b == 0){
                    result = "INF";
                }else{
                    result = "NO";
                }
            }

            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
