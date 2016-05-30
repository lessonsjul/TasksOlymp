package Неравенство_треугольника;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String[] line = reader.readLine().split(" ");
            double a = Double.valueOf(line[0]);
            double b = Double.valueOf(line[1]);
            double c = Double.valueOf(line[2]);

            double AA = Math.min(a,b);
            double BB = Math.max(a,b);
            double min = BB - AA;
            double max = BB + AA;
            double p = (a+b+c)/2;
            if(c >= min && c <= max){
                double res = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                writer.write(String.valueOf(res));
            }else{
                double res = a + b + c;
                writer.write(String.valueOf(res));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
