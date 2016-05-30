package Післязавтра;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String[] line = reader.readLine().split(" ");
            int day = Integer.valueOf(line[0]);
            int month = Integer.valueOf(line[1]);
            int year = Integer.valueOf(line[2]);

            int destDay = day+2;
            if(month == 2 && destDay > 28){
                if(isLeapYear(year) && destDay != 29){
                    destDay -= 29;
                    month++;
                }else{
                    destDay -= 28;
                    month++;
                }
            }else if(destDay > 30){
                if(containThirtyOne(month) && destDay != 31){
                    destDay -= 31;
                    if(month == 12){
                        month = 1;
                        year++;
                    }else {
                        month++;
                    }
                }else{
                    destDay -= 30;
                    month++;
                }
            }
            String result = destDay + " " + month + " " + year;
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean containThirtyOne(int month) {
        switch (month){
            case 2:
            case 4:
            case 6:
            case 9:
            case 11: return false;
            default: return true;
        }
    }

    private static boolean isLeapYear(int year) {
        return  year % 4 == 0 && (year % 100 !=0 || year % 400 == 0);
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
