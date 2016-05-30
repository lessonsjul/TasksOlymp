package Навчальний_рік;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String[] line = reader.readLine().split(" ");
            int N = Integer.valueOf(line[0]);
            int week = N <= 30 ? 1 : (N / (6*5))+1;
            if(week > 8) {
                week++;
            }
            System.out.println(week);
            int day = N / (week * 5);
            String result = week + " " + day;
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
