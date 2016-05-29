package Стоимость_покупки;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            String[] line = reader.readLine().split(" ");

            int rub = Integer.valueOf(line[0]);
            int cop = Integer.valueOf(line[1]);
            int count = Integer.valueOf(line[2]);

            int resCop = (cop*count);
            int resRub = (rub*count) + (resCop / 100);
            resCop %= 100;
            String result = resRub + " " + resCop;
            writer.write(result);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
