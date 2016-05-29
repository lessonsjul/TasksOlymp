package Время;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            long one = getLongTime(reader.readLine());
//            long two = getLongTime(reader.readLine());
//            long rzn = one + two;
            String result = getTime(one+1);
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long getLongTime(String param){
        String[] l = param.split(" ");
        long time = Integer.valueOf(l[0])*60*60 + Integer.valueOf(l[1])*60 + Integer.valueOf(l[2]);
        return time;
    }

    private static String getTime(long longTime){
        StringBuilder sb = new StringBuilder();
        long sec = longTime % 60;
        long min = (longTime / 60) % 60;
        long hours = (longTime / 3600) % 24;
        sb.append(hours).append(" ")
                .append(min).append(" ")
                .append(sec);
        return sb.toString();

    }
}
