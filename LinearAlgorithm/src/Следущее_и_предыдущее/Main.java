package Следущее_и_предыдущее;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            long a = Long.valueOf(reader.readLine());

            writer.write(String.format("The next number for %s is %s.",a,a+1));
            writer.newLine();
            writer.write(String.format("The previous number for %s is %s.",a,a-1));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
