package Обои;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String[] num = reader.readLine().split(" ");
            int a = Integer.valueOf(num[0]) ;
            int b = Integer.valueOf(num[1]);
            int c = Integer.valueOf(num[2]);
            String[] num2 = reader.readLine().split(" ");
            double H = Integer.valueOf(num2[0]) / 1000.;
            double L = Integer.valueOf(num2[1]) / 1000.;

            double S = 2 * ((a*b)+(a*c)+(b*c));
            double Sosn = a*b;
            double pokleika = S - Sosn;
            double okna = pokleika * .15;
            pokleika -= okna;
            pokleika /= c;
//            double pokleika = (2*(a+b)) + (2*a) - (okna / c);
            double rul = pokleika / H;
            double heg = L / c;
            rul /= heg;
            rul*= 1.1;

            rul = rul - (int)rul > 0 ? (int)rul+1 : (int)rul;

            writer.write(String.valueOf((int)rul));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
