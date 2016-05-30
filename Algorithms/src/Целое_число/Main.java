package Целое_число;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String[] line = reader.readLine().split(" ");
            double num = Double.valueOf(line[0]);
            boolean isZeloe = num - (int)num == 0;
            if(isZeloe) {
                int res = getSumZifer((int)num);
                writer.write(String.valueOf(res));
            }else{
                double res = Math.sqrt(Math.abs(num));
                writer.write(String.valueOf(res));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getSumZifer(int num) {
        int result = 0;
        char[] param = String.valueOf(num).toCharArray();
        for(char c: param){
            int z = Character.getNumericValue(c);
            if(z >= 1 && z <= 9){
                result += z;
            }
        }
        return result;
    }
}
