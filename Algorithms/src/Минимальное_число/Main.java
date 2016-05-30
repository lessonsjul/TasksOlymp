package Минимальное_число;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            char[] num = new char[4];
            int i = 0;
            while (i < 4){
                char c = (char) reader.read();
                num[i] = c;
                int j = i;
                while (j >= 1 && num[j-1] > c) {
                    char tmp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = c;
                    j--;
                }
                i++;
            }

            for(i = 0; i < 4 && num[i] == '0';i++);
            String result = String.valueOf(num);
            String zero = result.substring(0,i);
            StringBuilder sb = new StringBuilder(result.substring(i)).insert(1,zero);
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
