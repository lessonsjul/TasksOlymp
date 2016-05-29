package Сумма_четырёхзначных_чисел;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){

            String[] line = reader.readLine().split("");
            String a = line[0];
            String b = line[1];
            String c = line[2];
            String d = line[3];

            long res = Long.valueOf(a+b+c+d)+Long.valueOf(d+c+b+a)+Long.valueOf(a+c+b+d)+Long.valueOf(b+a+d+c);
            writer.write(String.valueOf(res));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
